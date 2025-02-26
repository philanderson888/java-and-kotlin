package uk.co.philanderson.stockui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;

@Component
public class StageInitializer implements ApplicationListener<ChartApplication.StageReadyEvent> {

    @Value("classpath:/chart.fxml")
    private Resource chartResource;
    private ApplicationContext applicationContext;

    public StageInitializer(@Value("${spring.application.ui.title}") String applicationTitle,
                            ApplicationContext applicationContext) {
        this.applicationTitle = applicationTitle;
        this.applicationContext = applicationContext;
    }

    private String applicationTitle;

    @Override
    public void onApplicationEvent(ChartApplication.StageReadyEvent event) {
        try {
            var fxmlLoader = new FXMLLoader(chartResource.getURL());
            // where do we get our controllers from
            fxmlLoader.setControllerFactory(aClass->applicationContext.getBean(aClass));
            Parent parent = fxmlLoader.load();
            Stage stage = event.getStage();
            // build ui
            stage.setScene(new Scene(parent, 800,600));
            stage.setTitle(applicationTitle);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}

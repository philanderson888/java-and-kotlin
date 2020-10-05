package uk.co.philanderson.stockui;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.function.Consumer;


@Component
public class ChartController implements Consumer<StockPrice>{
    @FXML
    public LineChart<String,Double> chart;
    private WebClientStockClient webClientStockClient;
    private ObservableList<XYChart.Data<String, Double>> seriesData = FXCollections.observableArrayList();

    public ChartController(WebClientStockClient webClientStockClient) {
        this.webClientStockClient = webClientStockClient;
    }

    @FXML
    public void initialize(){
        ObservableList<XYChart.Series<String,Double>> data = FXCollections.observableArrayList();
        data.add(new XYChart.Series<>(seriesData));
        chart.setData(data);

        webClientStockClient.pricesFor("SYMBOL").subscribe(this);
    }

    @Override
    public void accept(StockPrice stockPrice) {
        Platform.runLater(()->{
            seriesData.add(new XYChart.Data<Axis<String>,Axis<Double>>(String.valueOf(stockPrice.getTime().getSecond()),stockPrice.getPrice()));
        });
    }

/*    @Override
    public void accept(StockPrice stockPrice) {
        Platform.runLater(()->
            seriesData.add(new XYChart.Data<>(String.valueOf(stockPrice.getTime().getSecond()),stockPrice.getPrice()))
        );
    }*/
}

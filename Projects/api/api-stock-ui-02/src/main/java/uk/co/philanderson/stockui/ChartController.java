package uk.co.philanderson.stockui;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import org.springframework.stereotype.Component;
import uk.co.philanderson.stockclient.StockPrice;
import uk.co.philanderson.stockclient.WebClientStockClient;

import java.util.function.Consumer;


@Component
public class ChartController {
    @FXML
    public LineChart<String,Double> chart;
    private uk.co.philanderson.stockclient.WebClientStockClient webClientStockClient;

/*    public ChartController(WebClientStockClient webClientStockClient) {
        this.webClientStockClient = webClientStockClient;
    }*/

    @FXML
    public void initialize(){
        ObservableList<XYChart.Series<String,Double>> data = FXCollections.observableArrayList();
     //   data.add(new XYChart.Series<>(seriesData));
        chart.setData(data);

      //  webClientStockClient.pricesFor("SYMBOL").subscribe(this);
    }

/*    @Override
    public void accept(StockPrice stockPrice) {
        Platform.runLater(()->
            seriesData.add(new XYChart.Data<>(String.valueOf(stockPrice.getTime().getSecond()),stockPrice.getPrice()))
        );
    }*/
}

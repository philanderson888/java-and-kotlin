package uk.co.philanderson.stockui;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import uk.co.philanderson.stockclient.StockPrice;

@Log4j2
@Component
public class WebClientStockClient {

    private WebClient webClient;

    @Autowired
    public WebClientStockClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<StockPrice> pricesFor(String symbol){
        return webClient.get()
                .uri("http://localhost:8080/stocks/{SYMBOL}",symbol)
                .retrieve()
                .bodyToFlux(StockPrice.class);
//                .retryBackoff(5, Duration.ofSeconds(1),Duration.ofSeconds(20))
  //              .doOnError(IOException.class,e-> System.out.println(e) );

        //  return Flux.fromArray((new StockPrice[0]));
    }
}

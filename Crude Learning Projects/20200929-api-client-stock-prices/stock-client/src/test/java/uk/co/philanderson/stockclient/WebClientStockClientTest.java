package uk.co.philanderson.stockclient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

class WebClientStockClientIntegrationTest {

    private WebClient webClient = WebClient.builder().build();

    @Test
    void shouldRetrieveStockPricesFromTheService() {

        //given
        var webClientStockClient = new WebClientStockClient(webClient);

        // when
        Flux<StockPrice> prices = webClientStockClient.pricesFor("SYMBOL");
        var fivePrices = webClientStockClient.pricesFor("SYMBOL");

        // then
        Assertions.assertNotNull(prices);
        Assertions.assertTrue(prices.take(5).count().block() > 0);
        Assertions.assertEquals(5,fivePrices.count().block());
        Assertions.assertEquals("SYMBOL",fivePrices.blockFirst().getSymbol());
    }
}
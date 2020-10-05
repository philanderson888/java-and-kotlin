package uk.co.philanderson.stockui;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import uk.co.philanderson.stockclient.WebClientStockClient;

@Configuration
public class  ClientConfiguration {
    @Bean
    public uk.co.philanderson.stockclient.WebClientStockClient webClientStockClient(WebClient webClient){
        return new WebClientStockClient(webClient);
    }

    @Bean
    @ConditionalOnMissingBean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}

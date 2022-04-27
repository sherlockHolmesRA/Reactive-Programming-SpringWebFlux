package client;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class ProductWebClient {
	private WebClient webClient = WebClient.create("http://localhost:8081");

    private Mono<Object> result = webClient.get()
            .uri("/products")
            .accept(MediaType.APPLICATION_JSON)
            .exchangeToMono(response -> 
            response.bodyToMono(String.class)
        );

    public String getResult() {
        return ">> result = " +
                result.flatMap(res -> ((ClientResponse) res).bodyToMono(String.class)).block();
    }

}

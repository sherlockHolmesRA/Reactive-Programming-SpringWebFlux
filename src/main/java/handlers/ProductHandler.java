package handlers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import model.Product;
import reactor.core.publisher.Mono;

@Component
public class ProductHandler {
	private List<Product> products = Arrays.asList(
            new Product(1, "Lit", "ADB123"),
            new Product(2, "Canapé", "ADPO23"),
            new Product(3, "Chaise", "OPMLE23")
 		);

	public Mono<ServerResponse> getProduct(ServerRequest serverRequest){
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(products));
		
	}
}

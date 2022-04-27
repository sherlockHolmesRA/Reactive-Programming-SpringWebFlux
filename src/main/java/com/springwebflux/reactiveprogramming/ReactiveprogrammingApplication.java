package com.springwebflux.reactiveprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import client.ProductWebClient;

@SpringBootApplication
public class ReactiveprogrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveprogrammingApplication.class, args);
		ProductWebClient gwc = new ProductWebClient();
        System.out.println(gwc.getResult());
	}

}

package com.sample.stream;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sample.stream.model.Order;

@SpringBootApplication
public class ApiConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiConsumerApplication.class, args);
	}
	
	@Bean
    Consumer<Order> streambridgeOrders() {
        return order -> {
            System.out.println("Order received: " + order.toString());;
        };
    }

}

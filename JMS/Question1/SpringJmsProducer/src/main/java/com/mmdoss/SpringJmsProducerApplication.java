package com.mmdoss;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mmdoss.config.RabbitMQConfiguration;
import com.mmdoss.model.Product;

@SpringBootApplication
public class SpringJmsProducerApplication implements CommandLineRunner {

	@Autowired
	RabbitTemplate rabbitTemplate;

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SpringJmsProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Toothbrush", 100));
		products.add(new Product(2, "Bathing Soap", 20));
		products.add(new Product(3, "Towel", 50));
		products.add(new Product(4, "Toothpaste", 5));
		products.add(new Product(5, "Mouthwash", 6));
		products.add(new Product(6, "Detergent", 12));
		products.add(new Product(7, "Cookies", 8));
		products.add(new Product(8, "Shampoo", 11));
		products.add(new Product(9, "Perfume", 14));
		products.add(new Product(10, "Shoes", 10));

		products.stream().filter(p -> p.getQuantity() < 10)
				.forEach(p -> rabbitTemplate.convertAndSend(RabbitMQConfiguration.fanoutExchangeName, "", p));
		System.out.println("Messages Queued");
	}

}

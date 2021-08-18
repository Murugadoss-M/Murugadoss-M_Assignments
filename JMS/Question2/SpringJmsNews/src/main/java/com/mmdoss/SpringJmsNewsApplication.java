package com.mmdoss;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mmdoss.config.RabbitMQConfiguration;
import com.mmdoss.model.News;

@SpringBootApplication
public class SpringJmsNewsApplication implements CommandLineRunner {

	@Autowired
	RabbitTemplate rabbitTemplate;

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SpringJmsNewsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "INDvENG", "Sports"));
		newsList.add(new News(2, "Afghan Invasion", "Politics"));
		newsList.add(new News(3, "Windows 11", "Technology"));
		newsList.add(new News(4, "COVID-19", "Science"));
		
		

		newsList.forEach(n->rabbitTemplate.convertAndSend(RabbitMQConfiguration.topicExchangeName, n.getCategory(), n));
		
		System.out.println("Messages Queued");
		
	}

}

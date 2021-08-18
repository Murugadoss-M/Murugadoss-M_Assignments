package com.mmdoss.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConfiguration
{

	public static final String fanoutExchangeName="inventory_exchange";
	
	@Bean
	Queue queue1()
	{
		return new Queue("retail1", false);
	}
	@Bean
	Queue queue2()
	{
		return new Queue("retail2", false);
	}
	@Bean
	Queue queue3()
	{
		return new Queue("retail3", false);
	}

	@Bean
	FanoutExchange exchange()
	{
		return new FanoutExchange(fanoutExchangeName);
	}

	@Bean
	Binding retail1binding(Queue queue1, FanoutExchange exchange)
	{
		return BindingBuilder.bind(queue1).to(exchange);
	}
	@Bean
	Binding retail2binding(Queue queue2, FanoutExchange exchange)
	{
		return BindingBuilder.bind(queue2).to(exchange);
	}
	@Bean
	Binding retail3binding(Queue queue3, FanoutExchange exchange)
	{
		return BindingBuilder.bind(queue3).to(exchange);
	}

	@Bean
	public ConnectionFactory connectionFactory()
	{
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory(
				"localhost");
		connectionFactory.setPort(5672);
		connectionFactory.setUsername("guest");
		connectionFactory.setPassword("mmdoss123");
		return connectionFactory;
	}

}

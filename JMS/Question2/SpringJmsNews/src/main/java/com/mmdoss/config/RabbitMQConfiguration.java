package com.mmdoss.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConfiguration
{

	public static final String topicExchangeName="news_exchange";
	
	@Bean
	Queue sports_queue()
	{
		return new Queue("Sports", false);
	}
	@Bean
	Queue politics_queue()
	{
		return new Queue("Politics", false);
	}
	@Bean
	Queue science_queue()
	{
		return new Queue("Science", false);
	}
	
	@Bean
	Queue tech_queue()
	{
		return new Queue("Technology", false);
	}
	@Bean
	TopicExchange exchange()
	{
		return new TopicExchange(topicExchangeName);
	}

	@Bean
	Binding sportsbinding(Queue sports_queue, TopicExchange exchange)
	{
		return BindingBuilder.bind(sports_queue).to(exchange).with("Sports");
	}
	@Bean
	Binding sciencebinding(Queue science_queue, TopicExchange exchange)
	{
		return BindingBuilder.bind(science_queue).to(exchange).with("Science");
	}
	@Bean
	Binding politicsbinding(Queue politics_queue, TopicExchange exchange)
	{
		return BindingBuilder.bind(politics_queue).to(exchange).with("Politics");
	}
	@Bean
	Binding techbinding(Queue tech_queue, TopicExchange exchange)
	{
		return BindingBuilder.bind(tech_queue).to(exchange).with("Technology");
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

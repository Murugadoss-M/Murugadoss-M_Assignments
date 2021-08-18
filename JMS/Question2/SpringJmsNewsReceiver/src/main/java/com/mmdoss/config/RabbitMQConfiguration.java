package com.mmdoss.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.mmdoss.receiver.JMSReceiver;

@Component
public class RabbitMQConfiguration
{

	public static final String topicExchangeName = "news_exchange";

	public static final String sportsName = "Sports";
	public static final String scienceName = "Science";

	@Bean
	Queue sports_queue()
	{
		return new Queue(sportsName, false);
	}
	@Bean
	Queue science_queue()
	{
		return new Queue(scienceName, false);
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
	public ConnectionFactory connectionFactory()
	{
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory(
				"localhost");
		connectionFactory.setPort(5672);
		connectionFactory.setUsername("guest");
		connectionFactory.setPassword("mmdoss123");
		return connectionFactory;
	}

	@Bean
	SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
			MessageListenerAdapter listenerAdapter)
	{
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		//container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
		container.setQueueNames(sportsName,scienceName);
		container.setMessageListener(listenerAdapter);
		return container;
	}

	@Bean
	MessageListenerAdapter listenerAdapter(JMSReceiver jmsReceiver)
	{
		return new MessageListenerAdapter(jmsReceiver, "receiveMessage");
	}

}
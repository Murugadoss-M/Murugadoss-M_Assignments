package com.mmdoss.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
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

	public static final String fanoutExchangeName = "inventory_exchange";

	public static final String queueName = "retail1";

	@Bean
	Queue queue()
	{
		return new Queue(queueName, false);
	}

	@Bean
	FanoutExchange exchange()
	{
		return new FanoutExchange(fanoutExchangeName);
	}

	@Bean
	Binding binding(Queue queue, FanoutExchange exchange)
	{
		return BindingBuilder.bind(queue).to(exchange);
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
		container.setQueueNames(queueName);
		container.setMessageListener(listenerAdapter);
		return container;
	}

	@Bean
	MessageListenerAdapter listenerAdapter(JMSReceiver jmsReceiver)
	{
		return new MessageListenerAdapter(jmsReceiver, "receiveMessage");
	}

}
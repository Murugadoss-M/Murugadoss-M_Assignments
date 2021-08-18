package com.mmdoss.receiver;

import org.springframework.stereotype.Component;

import com.mmdoss.model.Product;

@Component
public class JMSReceiver{
	public void receiveMessage(Product product) {
		System.out.println(product);
	}
}
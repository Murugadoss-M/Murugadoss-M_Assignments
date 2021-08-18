package com.mmdoss.receiver;

import org.springframework.stereotype.Component;

import com.mmdoss.model.News;

@Component
public class JMSReceiver{
	public void receiveMessage(News news) {
		System.out.println(news);
	}
}
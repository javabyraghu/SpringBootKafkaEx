package com.app.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@KafkaListener(topics="my-tpc",groupId="group-id")
	public void myDataRead(String message) {
		System.out.println(message);
	}
}

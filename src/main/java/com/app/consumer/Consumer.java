package com.app.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.app.storage.MessageStorage;

@Component
public class Consumer {
	@Autowired
	private MessageStorage storage;
	
	@KafkaListener(topics="${kafka-topic-name}",groupId="group-id")
	public void myDataRead(String message) {
		storage.put(message);
	}
}

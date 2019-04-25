package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Value("${kafka-topic-name}")
	private String topicName;
	
	@Autowired
	private KafkaTemplate<String, String> template;
	
	public void send(String message){
		template.send(topicName, message);
	}
}

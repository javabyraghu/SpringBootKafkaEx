package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer implements CommandLineRunner{
	@Autowired
	private KafkaTemplate<String, String> template;
	
	@Override
	public void run(String... args) throws Exception {
		template.send("my-tpc", "Hello Data");
	}
}

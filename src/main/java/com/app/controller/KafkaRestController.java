package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.runner.Producer;
import com.app.storage.MessageStorage;

@RestController
@RequestMapping("/kafka")
public class KafkaRestController {
	@Autowired
	private Producer producer;
	@Autowired
	private MessageStorage storage;
	
	@GetMapping("/send")
	public String readInMsg(@RequestParam String message) {
		producer.send(message);
		return "DONE";
	}
	
	@GetMapping("/consume")
	public String readConsumer() {
		return storage.readData();
	}
}

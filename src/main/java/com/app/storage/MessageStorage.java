package com.app.storage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStorage {

	private List<String> list=new ArrayList<String>();
	
	public void put(String message) {
		list.add(message);
	}
	
	public String readData() {
		StringBuffer info=new StringBuffer();
		list.forEach(msg->info.append(msg).append("<br/>"));
		return info.toString();
	}

}

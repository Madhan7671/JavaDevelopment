package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotification implements Notification{
	public EmailNotification() {
		System.out.println("This is email notification");
	}
	@Override
	public void send(String message) {
		System.out.println("Email Notification sent "+message);
		
	}
}

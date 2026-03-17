package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SmsNotification implements Notification{

	public SmsNotification() {
		System.out.println("This class is sms notification");
	}
	@Override
	public void send(String message) {
		System.out.println("SMS Notification Recived"+message);
		
	}
	
}

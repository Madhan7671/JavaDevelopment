package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class NotificationSystemApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Notification notification=context.getBean(Notification.class);
		notification.send("i want to know which notifaction system is this was");
		
		SmsNotification sn=context.getBean(SmsNotification.class);
		sn.send("This is sms notification system message");
		context.close();
	}

}

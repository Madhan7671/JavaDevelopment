package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class OnlinePaymentApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Payment payment=context.getBean(Payment.class);
		payment.pay(2000);
		
		System.out.println();
		
		UpiPayment upi1=context.getBean(UpiPayment.class);
		UpiPayment upi2=context.getBean(UpiPayment.class);
		upi1.pay(200.00);
		upi2.pay(30001.89);
		context.close();
	}

}

package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class UpiPayment implements Payment {
	public UpiPayment() {
		System.out.println("this is upipayment class");
	}
	@Override
	public void pay(double amount) {
		System.out.println("Upi Payment of "+amount+" was sucessful");
	}
	@PostConstruct
	void init() {
		System.out.println("Bean is initialize");
	}
	@PreDestroy
	void destroy() {
		System.out.println("Bean is destroyed");
	}
}

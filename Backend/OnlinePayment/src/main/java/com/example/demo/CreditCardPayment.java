package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
@Primary
public class CreditCardPayment implements Payment{
	public CreditCardPayment() {
		System.out.println("This is creditcard class");
	}

	@Override
	public void pay(double amount) {
		System.out.println("credit card payment of "+amount+"was successfull");
	}
	@PostConstruct
	public void init() {
		System.out.println("bean is initiallised");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("bean is destroyed");
	}
}

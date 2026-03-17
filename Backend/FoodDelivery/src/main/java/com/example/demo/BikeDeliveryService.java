package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class BikeDeliveryService implements FoodDelivery{
	public BikeDeliveryService() {
		System.out.println("Bike delivery service is created");
	}

	@Override
	public void deliverOrder(String customerName) {
		System.out.println("Food is delivered byt the bike");
		
	}
}

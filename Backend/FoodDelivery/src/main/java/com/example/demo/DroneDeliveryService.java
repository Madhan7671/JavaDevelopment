package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DroneDeliveryService implements FoodDelivery{
	public DroneDeliveryService() {
		System.out.println("Your order is delivered by the Drone");
	}

	@Override
	public void deliverOrder(String customerName) {
		System.out.println("Food is delivered by the drone");
		
	}
	
}

package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CarService implements VehicleService{
	public CarService() {
		System.out.println("This is car service");
	}
	@Override
	public void startRide(String customerName) {
		System.out.println("let's go for a car ride"+customerName);
	}
}

package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BikeService implements VehicleService{
	public BikeService() {
		System.out.println("This is the bikeservice class");
	}
	@Override
	public void startRide(String customerName) {
		System.out.println("let's go for a Bike ride "+customerName);
		
	}

}

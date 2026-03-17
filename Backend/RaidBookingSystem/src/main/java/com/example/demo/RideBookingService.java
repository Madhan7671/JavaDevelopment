package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class RideBookingService{
	private VehicleService vechileservice;

	public RideBookingService(VehicleService vechileservice) {
		this.vechileservice = vechileservice;
	}
	void BookRide(String customerName) {
		System.out.println("The ride is booked sucessfully");
		vechileservice.startRide(customerName);
	}
}

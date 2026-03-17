package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodOrderService {
	FoodDelivery fooddelivery;
	//This is for the default like when we use the primary we will the default one
//	public FoodOrderService(FoodDelivery fooddelivery) {
//		this.fooddelivery = fooddelivery;
//		System.out.println("Foodorderservice bean created");
//	}
	
	public FoodOrderService(@Qualifier("bikeDeliveryService")FoodDelivery fooddelivery) {
		this.fooddelivery=fooddelivery;
		System.out.println("Fooddelivery bean is created");
	}
	void placeorder(String customerName)
	{
		System.out.println("Order placed successfully");
		fooddelivery.deliverOrder("madhan");
	}
}

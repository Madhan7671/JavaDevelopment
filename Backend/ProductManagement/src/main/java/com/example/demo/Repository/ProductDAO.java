package com.example.demo.Repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public class ProductDAO {
	public List<Product> getAllProducts(){
		Product p1=new Product(1,"Shampoo",125.67);
		Product p2=new Product(2,"Rice bag",150.87);
		Product p3=new Product(3,"Dal",110.50);
		List<Product> arr=new ArrayList<>();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		return arr;
	}
}

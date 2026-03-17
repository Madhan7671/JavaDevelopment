package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProductDAO;
import com.example.demo.model.Product;

@Service
public class ProductService {
	private final ProductDAO repo;

	public ProductService(ProductDAO repo) {
		this.repo = repo;
	}
	public List<Product> fetchProducts(){
		return(repo.getAllProducts());
	}
}

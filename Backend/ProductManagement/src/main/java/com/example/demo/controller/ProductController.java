package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;


@Controller
public class ProductController {
	ProductService productservice;

	public ProductController(ProductService productservice) {
		this.productservice = productservice;
	}
	@GetMapping("/products")
	public String showproducts(Model model) {
		List<Product> product_list=productservice.fetchProducts();
		model.addAttribute("products",product_list);
		return "products";
		}
}

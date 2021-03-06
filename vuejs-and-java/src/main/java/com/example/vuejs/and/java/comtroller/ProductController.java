package com.example.vuejs.and.java.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vuejs.and.java.model.Product;
import com.example.vuejs.and.java.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return service.getProducts();
	}
}

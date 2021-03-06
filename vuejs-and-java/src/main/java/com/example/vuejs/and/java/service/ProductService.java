package com.example.vuejs.and.java.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vuejs.and.java.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> getProducts(){
		List<Product> list = new ArrayList<>();
		repository.findAll().forEach(product -> list.add(product));
		return list;
	}
}

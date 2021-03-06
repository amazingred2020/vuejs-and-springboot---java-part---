package com.example.vuejs.and.java.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.vuejs.and.java.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}

package com.products.productsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.productsapi.entity.Product;
import com.products.productsapi.repository.ProductsRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductsRepository productsRepository;
	
	@PostMapping
	public ResponseEntity<Product> adicionarProduto(@RequestBody Product product) {
		productsRepository.save(product);
		return ResponseEntity.ok().body(product);
	}
}

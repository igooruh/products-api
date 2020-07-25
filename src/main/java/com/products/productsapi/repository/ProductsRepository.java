package com.products.productsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.productsapi.entity.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}

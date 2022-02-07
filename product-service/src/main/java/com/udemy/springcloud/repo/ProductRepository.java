package com.udemy.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.springcloud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

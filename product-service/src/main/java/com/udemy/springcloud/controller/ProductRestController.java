package com.udemy.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.udemy.springcloud.dto.Coupon;
import com.udemy.springcloud.model.Product;
import com.udemy.springcloud.repo.ProductRepository;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {
    
	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${couponService.url}")
	private String couponServiceUrl;
	
	@PostMapping(value = "/products")
	public Product create(@RequestBody Product product) {
		Coupon coupon = restTemplate.getForObject(couponServiceUrl+product.getCouponCode(), Coupon.class);
	     product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return repository.save(product);
	}
}

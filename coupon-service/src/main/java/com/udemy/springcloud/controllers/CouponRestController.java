package com.udemy.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.springcloud.model.Coupon;
import com.udemy.springcloud.repo.CouponRepository;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired
	private CouponRepository couponRepository;
	
	@RequestMapping(value="/coupons",method = RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon) {
		return couponRepository.save(coupon);
	}
	
	@RequestMapping(value = "/coupons/{code}",method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code")String code) {
		return couponRepository.findByCode(code);
	}
}

package com.udemy.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.springcloud.model.Coupon;
import com.udemy.springcloud.repo.CouponRepository;


@Controller
public class CouponController {
    @Autowired
	CouponRepository repo;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/showCreateCoupon")
	public String showCreateCoupon() {
		return "createCoupon";
	}
	
	@PostMapping("/saveCoupon")
	public String save(Coupon coupon) {
		 repo.save(coupon);
		 return "createResponse";
	}
	
	@GetMapping("/showGetCoupon")
	public String showGetCoupon() {
		return "getCoupon";
	}
	
	@PostMapping("/getCoupon")
	public ModelAndView getCoupon(String code) {
		ModelAndView view=new ModelAndView("couponDetails");
		view.addObject(repo.findByCode(code));
		return view;
	}
}

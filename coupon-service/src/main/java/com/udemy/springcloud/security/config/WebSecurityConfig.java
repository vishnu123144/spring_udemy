package com.udemy.springcloud.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.udemy.springcloud.security.UserDetailServiceImpl;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	UserDetailServiceImpl userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin();
		http.authorizeRequests()
		.mvcMatchers(HttpMethod.GET, "/couponapi/coupons/{code:^[A-Z]*$}","/","/index","/showGetCoupon","/getCoupon","/couponDetails").hasAnyRole("USER","ADMIN")
		 .mvcMatchers(HttpMethod.GET, "/showCreateCoupon","/createCoupon","/createResponse").hasRole("ADMIN")
		 .mvcMatchers(HttpMethod.POST, "/getCoupon").hasAnyRole("ADMIN","USER")
		 .mvcMatchers(HttpMethod.POST, "/couponapi/coupons","/saveCoupon","/getCoupon").hasRole("ADMIN")
		 .anyRequest().denyAll().and().csrf().disable();
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
}

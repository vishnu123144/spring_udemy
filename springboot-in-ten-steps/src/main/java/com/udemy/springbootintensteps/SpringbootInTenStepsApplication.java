package com.udemy.springbootintensteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootInTenStepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SpringbootInTenStepsApplication.class, args);
		for(String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}

package com.udemy.springinfivesteps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.udemy.springinfivesteps.basic.BinarySearchImpl;
import com.udemy.springinfivesteps.scope.PersonDAO;

//@SpringBootApplication
@Configuration
@ComponentScan("com.udemy.springinfivesteps")
public class SpringInFiveStepsApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsApplication.class);

	public static void main(String[] args) {	
		
		try(AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SpringInFiveStepsApplication.class))
		{
//		BinarySearchImpl binarySearch=context.getBean(BinarySearchImpl.class);
//		BinarySearchImpl binarySearch1=context.getBean(BinarySearchImpl.class);
//		System.out.println(binarySearch);
//		System.out.println();
//		int result=binarySearch.binarySearch(new int[] {12,3,5}, 3);
//		System.out.println(result);
		
		PersonDAO person=context.getBean(PersonDAO.class);
		
		PersonDAO person2=context.getBean(PersonDAO.class);
		
		
//		System.out.println(person);
//		System.out.println(person2);
		
		LOGGER.info("{}",person);
		LOGGER.info("{}",person.getJdbcConnection());
		
		LOGGER.info("{}",person2);
		LOGGER.info("{}",person2.getJdbcConnection());
		
		}
		
		
	}

}

package com.udemy.springinfivesteps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.springinfivesteps.properties.SomeExternalProperties;
import com.udemy.springinfivesteps.xml.XmlPersonDao;

@Configuration
@ComponentScan("com.udemy.springinfivesteps")
@PropertySource("classpath:app.properties")
public class SpringInFiveStepsPropertiesApplication {
//	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsXmlApplication.class);

	public static void main(String[] args) {	
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringInFiveStepsPropertiesApplication.class);
		SomeExternalProperties properties=context.getBean(SomeExternalProperties.class);
		System.out.println(properties.returnServiceUrl());
	
		
		
	}

}

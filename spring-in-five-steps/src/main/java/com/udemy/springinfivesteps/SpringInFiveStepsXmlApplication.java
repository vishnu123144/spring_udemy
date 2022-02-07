package com.udemy.springinfivesteps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.udemy.springinfivesteps.xml.XmlPersonDao;

@Configuration
@ComponentScan("com.udemy.springinfivesteps")
public class SpringInFiveStepsXmlApplication {
//	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsXmlApplication.class);

	public static void main(String[] args) {	
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		XmlPersonDao person=context.getBean(XmlPersonDao.class);
		
		System.out.println(person);
		
		System.out.println(person.getXmlJdbcConnection());
		
		
	}

}

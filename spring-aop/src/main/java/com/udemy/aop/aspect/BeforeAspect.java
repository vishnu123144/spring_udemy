package com.udemy.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAspect {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	//what kind of method calls i would intercept
	//execution (* package .*.*(..))
	//weaving weaver
	@Before("com.udemy.aop.aspect.CommanPointcutConfig.dataLayerExecution()")//pointcut
	public void before(JoinPoint joinPoint) {
		//advice
		logger.info("checking for user access");
		logger.info("Allow access for {}",joinPoint);
	}

}

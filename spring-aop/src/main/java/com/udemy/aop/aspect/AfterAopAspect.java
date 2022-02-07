package com.udemy.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AfterAopAspect {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	//what kind of method calls i would intercept
	//execution (* package .*.*(..))
	//weaving weaver
	//afterReturning is called when the method is executed
	@AfterReturning(value = "com.udemy.aop.aspect.CommanPointcutConfig.dataLayerExecution()", 
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with value {}", joinPoint, result);
	}
	

	@After(value = "com.udemy.aop.aspect.CommanPointcutConfig.dataLayerExecution()")
	public void after(JoinPoint joinPoint) {
		logger.info("after execution of {}", joinPoint);
	}
}

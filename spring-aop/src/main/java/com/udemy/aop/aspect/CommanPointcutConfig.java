package com.udemy.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommanPointcutConfig {
	
	@Pointcut("execution(* com.udemy.aop.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.udemy.aop.business.*.*(..))")
	public void businessLayerExecution() {}

}

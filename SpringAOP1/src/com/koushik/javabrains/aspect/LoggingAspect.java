package com.koushik.javabrains.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.koushik.javabrains.model.Triangle;


@Aspect
public class LoggingAspect {

	/*@Before("execution(public String com.koushik.javabrains.model.Circle.getName())")
	public void loggingAdvice(){
		System.out.println("Logging Advice run:");
	}*/
	
	/*@Before("execution(* com.koushik.javabrains.model.*.get*())")
	public void loggingAdvice(){
		System.out.println("Logging Advice run:");
	}*/
	
	@Before("allGetters() && allCircleMethods()")
	public void firstAdvice(JoinPoint point){
		System.out.println("First Advice run:");
		
	}
	
	@Before("allGetters()")
	public void secondAdvice(JoinPoint joinpoint){
		System.out.println("Second Advice run:");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}

	@Pointcut("within(com.koushik.javabrains.model.Circle)")
	public void allCircleMethods(){}
	
}

package org.mnr.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect//this annotation lets spring container know that it is an aspect in the application
public class LoggingAspect {
	//Following annotation lets spring container know that it is an advice to be run on the scenario mentioned in the annotation attribute
//	@Before("execution(public String getName())")//this advice is called before the execution public String getName() methods without parameters in all classes
//	@Before("execution(public String get*())")// for all public getter methods without parameters which are public and returns string
//	@Before("execution(public * get*())")// for all public getter methods with no input params
	@Before("execution(* get*())")// for all getters with any access modifier without any arg
//	@Before("execution(public * get*(*))")// for all getters with arguments
//	@Before("execution(public * get*(..))")// for all getters with/without args
//	@Before("execution(public * org.mnr.aop.model.*.get*())") // for all getters of all classes inside specified package
//	@Before("execution(public String org.mnr.aop.model.Circle.getName())")// now this advice runs only before the execution of Circle class public String getName method
	public void loggingAdvice(){
		System.out.println("loggingAdvice run| get method called");
	}
	
	//multiple advices for single pointcut
	@Before("execution(* get*())")
	public void secondAdvice(){
		System.out.println("loggingAdvice run| second advice called");
	}
	// if there are more than two advices for any aspect, It is better to use pointcut
	// a pointcut is used to point to more than one advices
	
	@After("execution(* set*(*))")
	public void setterAdvice1(){
		System.out.println("set..1");
	}
//	@Before("allSetters()")
//	public void setterAdvice2(){
//		System.out.println("set..2");
//	}
//	
//	@Pointcut("execution(public void setName(String))")
//	public void allSetters(){}
}

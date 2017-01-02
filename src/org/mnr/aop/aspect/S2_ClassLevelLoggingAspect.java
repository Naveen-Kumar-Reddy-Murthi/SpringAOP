package org.mnr.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class S2_ClassLevelLoggingAspect {
	
	@Before("print()")
	public void debug1(){
		System.out.println("ADVICE-1");
	}
	
	@Before("execution(* get*())")
	public void debug2(){
		System.out.println("ADVICE-2");
	}
	
	@Pointcut("within(org.mnr.aop.model.Rectangle)")
//	@Pointcut("within(org.mnr.aop.model..*)")//for all the classes in model package and its sub packages
	public void print(){
		
	}
}

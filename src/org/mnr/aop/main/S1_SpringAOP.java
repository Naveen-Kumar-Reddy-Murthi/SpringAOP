package org.mnr.aop.main;

import org.mnr.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S1_SpringAOP {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ShapeService service = context.getBean("shapeService",ShapeService.class);
		System.out.println(service.getCircle().getName());
		System.out.println(service.getTriangle().getName());
		service.getTriangle().setName("naveen");
	}

}

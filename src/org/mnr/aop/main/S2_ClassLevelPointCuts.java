package org.mnr.aop.main;

import org.mnr.aop.model.Rectangle;
import org.mnr.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S2_ClassLevelPointCuts {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Rectangle rectangle = context.getBean("rectangle",Rectangle.class);
		System.out.println(rectangle.getName());
	

	}

}

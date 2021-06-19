package com.svp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.koushik.javabrains.service.ShapeService;


public class SpringAOP {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
	}
}

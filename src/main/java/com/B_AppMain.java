package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class B_AppMain {
	
	public static void main(String[] args) {
		System.out.println("Hello World !!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("b_spring.xml");

		B_Developer developer = (B_Developer) context.getBean("dev");
		developer.performCalculations();

	}

}

package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * This is Spring project and need to run as Java Application
 * 
 * Spring earlier uses BeanFactory which now has been deprecated Spring Boot
 * also uses Application Context to run application
 * 
 * @author Sheetal_Singh
 *
 */
public class A_AppMain {

	
	public static void beanCreationsOnInitialization() {
		// Old Spring Style 1 : Bean Factory
		// BeanFactory context = new XmlBeanFactory(new FileSystemResource("myspringconfig.xml"));
	

		// New Style : ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("a_spring.xml");
	}
	

	public static void passingPrimitiveObjectFromXml() {
		// New Style : ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("a_spring.xml");

		
		//Spring will create obj based on id given in spring xml
		A_Apple apple1 = (A_Apple) context.getBean("appleBean");
		apple1.testApple();
		//apple1.setPrice(20);
		System.out.println("1st Price: "+ apple1.getPrice());
		
		//Spring will return same object becasue id is same
		//Singleton: Two references points to same object in Spring Container
		A_Apple apple2 = (A_Apple) context.getBean("appleBean");
		System.out.println("2nd Price: "+ apple2.getPrice());
	}

	
	public static void passingReferenceObjectFromXml() {
		ApplicationContext context = new ClassPathXmlApplicationContext("a_spring.xml");

		A_Apple apple = (A_Apple) context.getBean("appleBean");
		apple.testApple();
		apple.testAppleMarket();
		System.out.println("Weight: "+ apple.getWeight());
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World !!!");

		//beanCreationsOnInitialization();
		//passingPrimitiveObjectFromXml();
		//passingReferenceObjectFromXml();
		
	}

}

package com.lu2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrive bean  from container
		Coach theCoach = applicationContext.getBean("myCoach", Coach.class);
		Coach alphaCoach = applicationContext.getBean("myCoach", Coach.class);
		
		// check if they are same
		
		boolean result = (theCoach == alphaCoach);
		
		
		System.out.println("\n pointing to the same object "+ result);
		
		System.out.println("\n Memory location of theCoach"+ theCoach);
		
		System.out.println("\n Memory location of theCoach"+ alphaCoach);
		
		applicationContext.close();
	}

}

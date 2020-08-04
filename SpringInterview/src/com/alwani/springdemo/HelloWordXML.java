package com.alwani.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alwani.beans.Person;

public class HelloWordXML {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextHello.xml");
		
		Person person1 = applicationContext.getBean("student",Person.class);
		System.out.println("Hello " + person1.getYourName());
		System.out.println("Your Age is " +person1.getYourAge());
	}
	
}

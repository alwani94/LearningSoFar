package com.alwani.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alwani.beans.Person;

public class HelloWorldInjectConst {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextConst.xml");
		
		Person s1 = applicationContext.getBean("student", Person.class);
		
		System.out.println(s1.getYourName());;
	}

}

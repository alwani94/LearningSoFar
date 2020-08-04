package com.alwani.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alwani.beans.Greeting;


public class HelloWordInjectSet {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationHelloSetter.xml");
		
		Greeting prof = applicationContext.getBean("professor",Greeting.class);
		
		System.out.println(prof.weWillGreet());
		
	}

}

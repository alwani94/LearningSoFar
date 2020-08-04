package com.lu2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		
		//Retrieve bean from spiring container
		TrackCoach coach = applicationContext.getBean("myTrackCoach", TrackCoach.class);
		
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getEmailAddress());
		
		System.out.println(coach.getTeam());
		
		applicationContext.close();
		
	}
}

package com.lu2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new CricketCoach(null);
		
		System.out.println(theCoach.getDailyWorkout());
		
	}
}

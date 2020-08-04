package com.lu2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService forturneSer;
	
	
	
	public BaseballCoach(FortuneService forturneSer) {
		this.forturneSer = forturneSer;
	}

	@Override
	public String getDailyWorkout() {
		return "Do dubbling for 30mins";
		
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it " + forturneSer.getFortune();
	}

}

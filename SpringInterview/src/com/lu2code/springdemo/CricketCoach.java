package com.lu2code.springdemo;

public class CricketCoach implements Coach{

	//define a private field for the dependency
	private FortuneService fortuneServe;
	
	
	public CricketCoach(FortuneService fortuneServe) {
		this.fortuneServe = fortuneServe;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Lets have Yo-Yo Test First";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServe.getFortune();
	}

}

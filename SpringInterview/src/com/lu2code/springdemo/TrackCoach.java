package com.lu2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneSer;

	private String emailAddress;

	private String team;


	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside Setter method of emailAddress TrackCoach");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Inside Setter method of emailAddress TrackCoach");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k now....";
	}


	public TrackCoach() {
		System.out.println("inside no-args consrtuctor of TrackCoach");
	}


	public void setFortuneSer(FortuneService fortuneSer) {
		System.out.println("Inside Setter method of TrackCoach");
		this.fortuneSer = fortuneSer;
	}

	// add an init method
	private void initalMethod() {
		// TODO Auto-generated method stub
System.out.println("I'm Initial Method");
	}
	
	private void endMethod() {
		// TODO Auto-generated method stub
		System.out.println("I'm End/destroy Method");
	}

	@Override
	public String getDailyFortune() {
		return fortuneSer.getFortune();
	}

}

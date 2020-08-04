package com.alwani.beans;

public class Student implements Person {
	
	private Greeting greet;
	
	public Student(Greeting greet) {
		super();
		this.greet = greet;
	}

	@Override
	public String getYourName() {
		// TODO Auto-generated method stub
		return "Himanshu Alwani" + greet.weWillGreet();
	}

	@Override
	public String getYourAge() {
		// TODO Auto-generated method stub
		return "25";
	}

}

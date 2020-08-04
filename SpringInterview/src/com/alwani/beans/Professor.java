package com.alwani.beans;

public class Professor implements Greeting {
	
	private Person person;
	
	

	public Person getPerson() {
		return person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}



	@Override
	public String weWillGreet() {
		// TODO Auto-generated method stub
		return "Good Morining " + person.getYourName();
	}
	

}

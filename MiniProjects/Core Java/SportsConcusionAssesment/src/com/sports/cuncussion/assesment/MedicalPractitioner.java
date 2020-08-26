package com.sports.cuncussion.assesment;

import java.util.ArrayList;

public class MedicalPractitioner {
//this will store 5 recent records of athlete
	// assuming medicalPractitioner is storing the previous records

	ArrayList<Athlete> records = new ArrayList<Athlete>();

	public ArrayList<Athlete> getRecords() {
		return records;
	}

	public void setRecords(ArrayList<Athlete> records) {
		this.records = records;
	}

	@Override
	public String toString() {
		return "MedicalPractitioner [records=" + records + "]";
	}



}

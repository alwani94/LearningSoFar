package com.sports.cuncussion.assesment;

import java.util.Arrays;

public class Athlete {
	// symptoms severity level
	/* Map<String,Integer> severityLevel = new HashMap<String,Integer>(); */
	int[] severityLevel = new int[22];

	public int[] getSeverityLevel() {
		return severityLevel;
	}

	public void setSeverityLevel(int[] severityLevel) {
		this.severityLevel = severityLevel;
	}

	@Override
	public String toString() {
		return "Athlete [severityLevel=" + Arrays.toString(severityLevel) + "]";
	}

}

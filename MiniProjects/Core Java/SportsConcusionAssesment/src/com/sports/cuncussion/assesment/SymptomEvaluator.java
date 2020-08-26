package com.sports.cuncussion.assesment;


import java.util.Scanner;

public class SymptomEvaluator {

	Scanner scan = new Scanner(System.in);

	MedicalPractitioner mp = new MedicalPractitioner();
	public void storeSymptoms() {
		int[] severityLevel = new int[22];
		Athlete a = new Athlete();

		for (int i = 0; i < ApplicationConstants.symptomsType.length; i++) {
			String display = "Please enter your " + ApplicationConstants.symptomsType[i] + " score";
			System.out.print(display);
			int space = display.length();
			for (int j = (55 - space); j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println("(none (0), mild(1-2), moderate(3-4), & severe(5-6))");
			int panicNum = scan.nextInt();
			panicNum = checkValidInput(panicNum);
			severityLevel[i] = panicNum;
		}
		a.setSeverityLevel(severityLevel);
		if(mp.records.size()>ApplicationConstants.totalRecordsStored) {
			mp.records.remove(0);
		}
		mp.records.add(a);
	}

	public int checkValidInput(int panicNum) {
		boolean checkValid = false;
		for (int j : ApplicationConstants.panicLevel) {
			if (panicNum == j) {
				checkValid = true;
				break;
			}
		}
		if (!checkValid) {
			System.out.println("\t Please enter a valid Input, "
					+ "It should be between range 0-6 w.r.t. (none (0), mild(1-2), moderate(3-4), & severe(5-6))");
			panicNum = scan.nextInt();
			checkValidInput(panicNum);
		}
		return panicNum;
	}

	public void displaySymptomsSummary() {
		// Total number of Symptoms//assuming 0 means no symptoms..done
		// Symptoms severity score...don't forget to handle 0 & 1 entry scenarios
		// Showing Total number of Symptoms from latest entry of symptoms
		
		int recordSize = mp.getRecords().size();
		if (!(recordSize > 0)) {
			System.out.println("Please enter some records First by pressing 1 option");
		} else {
			// Calculate Total number of Symptoms
			recordSize--;
			int[] ans=calTotalSymptoms(recordSize);
			if(ans !=null) {
				System.out.println("Total number of Symptoms are :"+ans[0]);
				System.out.println("Severity score :"+ans[1]);	
			}
		}
		String ratingOfAthlete =overAllRating();
		if(ratingOfAthlete!=null) {
			System.out.println(ratingOfAthlete);
		}
	}

	public String overAllRating() {
		String ratingOfAthlete = null;
		int recordSize = mp.getRecords().size();
		if (!(recordSize >= 2)) {
			System.out.println("We don't have enough records to determine your risk!");
		} else {
			recordSize--;
			int[] ans=calTotalSymptoms(recordSize);
			recordSize--;
			int[] ans1=calTotalSymptoms(recordSize);
			int totalSympDiff = ans[0] - ans1[0];
			int totalSeveDiff = ans[1] - ans1[1];
			if(totalSympDiff<3 && totalSeveDiff <10) {
				ratingOfAthlete="No Difference";
			}else if(totalSympDiff<3 && totalSeveDiff >= 10) {
				ratingOfAthlete="Unsure";
			}else if(totalSympDiff>=3 || totalSeveDiff >=15) {
				ratingOfAthlete="Very Different";
			}else {
				ratingOfAthlete="/t******This is default case******";
			}
		}
		return ratingOfAthlete;
	}
	
	public int[] calTotalSymptoms(int index){
		int[] ans = new int[2];
		int total_num_Symptoms = 0;
		int severityScore = 0;
		int[] temp = mp.getRecords().get(index).getSeverityLevel();
		for (int j : temp) {
			if (j != 0) {
				total_num_Symptoms++;
				severityScore += j;
			}
		}
		ans[0]=total_num_Symptoms;
		ans[1]=severityScore;
		return ans;
	}

	public void riskCondition() {
		String rating = overAllRating();
		if(rating!=null) {
			if(rating.equalsIgnoreCase("No Difference")) {
				System.out.println(ApplicationConstants.ANSI_GREEN + "No Difference" + ApplicationConstants.ANSI_RESET);
			}else if(rating.equalsIgnoreCase("Unsure")) {
				System.out.println(ApplicationConstants.ANSI_YELLOW +"Unsure"+ ApplicationConstants.ANSI_RESET);
			}else if(rating.equalsIgnoreCase("Very Different")) {
				System.err.println( "Very Different");
			}
		}
	}

}

package com.sports.cuncussion.assesment;

import java.util.Scanner;

public class ConcussionAssessmentUI {

	public static SymptomEvaluator evaluate = new SymptomEvaluator();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		do {
			displayMenu();
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				evaluate.storeSymptoms();
				break;

			case 2:
				evaluate.displaySymptomsSummary();
				break;

			case 3:
				evaluate.riskCondition();
				break;

			case 4:
				System.out.println("Exiting the program... ");
				System.exit(0);

				break;

			default:
				System.out.println("Invalid Input!!! Please Enter a vaild Input ");
			}

		} while (true);
	}

	static void displayMenu() {
		System.out.println("Welcome to Sport Concussion Assessment System Project");
		System.out.println("==================================");
		System.out.println("Please select one of the following options");
		System.out.println("\t\t  1. Enter Symptoms");
		System.out.println("\t\t  2. Display Symptoms Summary");
		System.out.println("\t\t  3. I am I at Risk?");
		System.out.println("\t\t  4. Exit");
		System.out.println("Please enter your choice (1-4)");

	}

}

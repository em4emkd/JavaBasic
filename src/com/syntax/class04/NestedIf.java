package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {
			System.out.println("How many doses you have?");

			if (dose == 1) {
				System.out.println("You need another shot");
			} else {
				System.out.println("You are fully vaccinated.");
			}

		} 
		
		else {
			System.out.println("No further questions");
		}
		
		System.out.println("---------------------------");
		
		
		/*
		 * declare a variable for allergy
		 * 
		 * if you have allergy--->
		 * 		if you have pollen
		 * 		if you have peanut
		 * 		if you have wheat
		 * if no allergy-->you are lucky
		 * 
		 * 
		 */
		
		boolean allergy=true;
		
		if(allergy) { //outer if
			System.out.println("Let`s check what allergies you have");
			
			String allergyType="pollen";
			
			if(allergyType.equals("pollen")) { //nested if
				System.out.println("Please stay home when trees are blooming");
			} else if(allergyType.equals("peanuts")) {
				System.out.println("Please don`t eat food that contains nuts");
			} else if(allergyType.equals("gluten")) {
				System.out.println("Please follow gluten free diet");
			} else {
				System.out.println("I don`t have a suggestion");
			}
			
		}
		else {
			System.out.println("You are lucky!");
		}
		

	}

}

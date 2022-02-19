package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {

		/*
		 * Create a Java program and call it a Donor. In order to be eligible to donate
		 * your blood you have to be 18 years old. Also once you identify age
		 * eligibility then we have to see if person matches weight requirements. If
		 * person weight it more than 110 lbs → then he/she is eligible, otherwise we
		 * cannot accept such a patient.
		 * 
		 */

		int age = 18;
		int weight = 105;

		if (age >= 18) {
			System.out.println("What is your weight?");

			if (weight > 110) {
				System.out.println("You are eligible to donate blood.");
			} else {
				System.out.println("Your weight should be more than 110 to be eligible to donate.");
			}

		} else {
			System.out.println("You are not eligible to donate blood.");
		}
		
		
		

		
	}
}

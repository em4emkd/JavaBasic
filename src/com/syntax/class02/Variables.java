package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		/*
		 * Create a Java program and name it Variables
		 * 
		 * In your program create different type of variables to store student’s
		 * information(name, last name, grade, city, state, phone number) and then print
		 * value of those variables in the format: My name is ___ and my last name is
		 * ____ I am A/B student I live in city__ and state____ And my phone number is
		 * ….. b) Change student’s city, state, phone number and grade. And print those
		 * updated values: Example: My name is __ and I moved to new city__ and new
		 * state__. My new phone number is ___
		 * 
		 */
		
		
		String name="Amy";
		String lastName="Johnson";
		char grade='A';
		String city="Reston";
		String state="VA";
		String phoneNumber="123-456-789";
		
		System.out.println("My name is "+name+" and my last name is "+lastName+". I am "+grade+" student. I live in "+city+", "+state+" and my phone number is "+phoneNumber+". " );
		
		grade='B';
		city="Orlando";
		state="FL";
		phoneNumber="123-456-123";
		
		System.out.println("My name is "+name+" and i moved to new city "+city+" and new state "+state+" and new phone number "+phoneNumber );

	}

}

package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {

		/*
		 * we need to declare a boolean var hungry yes or no
		 * 
		 * if we are hungry-->i am going to ear otherwise-->i am going to drink a tea
		 * 
		 */

		boolean hungry = false;

		if (hungry == true) { //if(hungry)
			System.out.println("I am going to eat");
		} else {
			System.out.println("I am going to drink a tea");
		}
		
		System.out.println("******************");
		
		boolean traffic=true;
		
		if(traffic) {
			System.out.println("I am coming home late");
		} else {
			System.out.println("No traffic, i am on time");
		}
		
		System.out.println("******************");
		/*
		 * define a var to store a browser
		 * 
		 * if browser is chrome-->we are executing tests on chrome
		 * otherwise-->i am not executing any test cases
		 */
		
		//== for string is .equals
		
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("We are executing tests on chrome");
		} else {
			System.out.println("We are not executing any test cases");
		}
		
		

	}

}

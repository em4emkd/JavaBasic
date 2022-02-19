package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		String day = "Saturday";

		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java Class");
		}

		System.out.println("Code outiside of if statement");

		System.out.println("*********************************");
		/*
		 * let`s ask user what day is today
		 * 
		 * based on the day lets define which class we have
		 * 
		 * if(mon or fri)-->no class today else if(tue or wed)-->manual else if(thur)-->
		 * review else if(sat or sun)-->java class
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("What day is today?");
		day = scan.next();

		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("No Class today");
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("We have Manual Testing");
		} else if (day.equals("Thursday")) {
			System.out.println("We have review class");
		} else if (day.equals("Saturday") || day.equals("Sundayy")) {
			System.out.println("We have Java Class");
		} else {
			System.out.println("Invalid Day");
		}

	}

}

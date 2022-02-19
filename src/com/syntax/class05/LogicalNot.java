package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		// Logical NOT ! operator is used to reverse the condition

		boolean value = !true;
		System.out.println(value);

		boolean traffic = false;

		if (!traffic) {
			System.out.println("I will come on time to work");
		}

		System.out.println("--------------------------------------");

		String day = "Saturday";
		if (!day.equals("Saturday")) {
			System.out.println("Today is not Saturday");
		}

		boolean checkBoxSelected = false;

		if (!checkBoxSelected) {
			System.out.println("I will write code to click on that check box");
		}

		System.out.println("--------------------------------------");

		String java = "easy";
		if (!java.equals("hard")) {
			System.out.println("You are genius");
		}

		System.out.println("-----------THE END--------------------");

	}

}

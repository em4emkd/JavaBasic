package com.syntax.class05;

public class LogicalAnd {
	public static void main(String[] args) {

		// Logical operator && (and)

		boolean likeJava = true;
		boolean understandJava = true;

		// all conditions need to be true to execute the code
		if (likeJava && understandJava) {
			System.out.println("This is best combination");
		}
		System.out.println("End of Code");

		/*
		 * we want to compare 3 numbers
		 * 
		 * num1>num2 && num1>num3 -->num1 is the largest
		 * 
		 * what if num2>num1 && num2>num3 -->num2 is the largest
		 * 
		 * what if num3>num1 && num3>num2 -->num3 is the largest
		 * 
		 */

		int num1 = 3;
		int num2 = 4;
		int num3 = 5;

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest number");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is the largest number");
		}

	}

}

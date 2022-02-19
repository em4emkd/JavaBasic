package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		/*
		 * Print nums from 1 to 50 excep those that are divisible by 3
		 */

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}

			System.out.print(i + " ");

		}

		System.out.println();
		System.out.println("---------------------");

		/*
		 * Create a program that will keep asking user to apply for a credit card. As
		 * soon as you get "yes" from a user program should stop asking.
		 */

		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			
			System.out.println("Please apply for a credit card");
			answer = scan.next();

		} while (!"yes".equalsIgnoreCase(answer));

		System.out.println("Perfect! Here is your card");

	}

}

package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		/*
		 * for loop most widely used used when we know how many time we want to repeat a
		 * block of code ex. i want to say hello 5 times
		 */

		/*
		 * 1.initialization (int i=1) 
		 * 2.condition (i<=5 check for condition & if true gets inside that is step 3 ) 
		 * 3.increment or decrement (i++ step 4)
		 */

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
		}

		System.out.println("---print num from 1 to 20----");

		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println("---print num from 10 to 25----");

		for (int i = 10; i <= 25; i++) {
			System.out.print(i + " ");
		}

		System.out.println("---print num from 50 to 1----");

		for (int i = 50; i >= 1; i--) {
			System.out.print(i + " ");
		}

	}

}

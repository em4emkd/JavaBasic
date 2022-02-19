package com.syntax.class07;

public class Task {

	public static void main(String[] args) {

		// Task
		System.out.println("Print only even nums from 1 to 30");

		int i = 2;

		while (i <= 30) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println();
		System.out.println("-----------------------");

		int j = 1;

		while (j <= 30) {

			if (j % 2 == 0) {
				System.out.print(j + " ");
			}

			j++;
		}

		System.out.println();
		System.out.println("End of Code");

		
		//Print numbers from 1 to 100 in 1 line with space

		int a = 1;

		while (a <= 100) {
			System.out.print(a + " ");
			a++;
		}

		System.out.println();
		
		//Print numbers from 100 to 1

		int b = 100;

		while (b >= 1) {
			System.out.print(b + " ");
			b--;
		}

		System.out.println();

		// Print even numbers from 20 to 100

		int c = 20;

		while (c <= 100) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
			c++;
		}
		
		System.out.println();

		// Print only odd numbers from 100 to 1

		int d = 100;

		while (d >= 1) {
			
			if (d % 2 != 0) {

				System.out.print(d + " ");

			}
			d--;
			
		}

	}

}

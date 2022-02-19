package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 7; i++) {

			if (i == 3) {
				continue;// skip current iteration/cycle

			}

			System.out.println("Hello " + i);

		}

		System.out.println("------------------");

		for (int i = 1; i < 10; i++) {

			if (i == 4 || i==7) {
				continue;
			}

			System.out.print(i + " ");

		}

	}

}

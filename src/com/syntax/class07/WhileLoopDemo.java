package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;

		while (i <= 5) {
			System.out.println(i);
			i++;
		}

		System.out.println("The value of i outside of while loop " + i);
		System.out.println("End of code");

		// Print values from 2 to 20;

		int c = 2;

		while (c <= 20) {
			System.out.println(c);
			c++;
		}

		System.out.println("The End");

		
		//Print values from 1 to 50 in 1 line
		
		int y = 1;

		while (y <= 50) {
			System.out.print(y+" ");
			y++;
		}
		
		System.out.println();
		System.out.println("The End");
		
		
		
		int j = 20;

		while (j>=1) {
			System.out.print(j+" ");
			j--;
		}
		
		System.out.println();
		System.out.println("The End");

	}

}

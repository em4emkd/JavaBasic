package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * do while loop->repeats a block of code as long as condition is true
		 * we use while and do while loops when we don`t know how many times we want to 
		 * repeat a block of code
		 * 
		 */
		
		int num=10;
		
		while(num<=5) {
			System.out.println("Hello");
			num++;
		}
		
		System.out.println("-------DO WHILE----------");
		//do while prints at least one time even if the condition is false
		
		int num1=10;
		
		do {
			System.out.println("Hello");
			num1++;
		} while(num1<=5);
		
		
		System.out.println("----Print numbers from 1 to 30 using do while loop----");
		
		int num2=1;
		
		do {
			System.out.print(num2+" ");
			num2++;
		} while (num2<=30);

	}
}

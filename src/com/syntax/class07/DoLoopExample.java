package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		
		/*
		 * create a secret num
		 * 
		 * we want user to guess our secret num
		 * 
		 * the moment user guessed my secret num->my program should stop
		 * otherwise it should continue asking to guess my number
		 */
		
		int secretNum=12;
		
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		
		do {
			System.out.println("Please enter a number to win");
			guessNumber=scan.nextInt();
			
		} while(guessNumber!=secretNum);
		
		System.out.println("Congrats!");

	}
}

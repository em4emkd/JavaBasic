package com.syntax.class07;

import java.util.Scanner;

public class SecretNumUsingWhileLoop {

	public static void main(String[] args) {
		/*
		 * 	/*
		 * create a secret num
		 * 
		 * we want user to guess our secret num
		 * 
		 * the moment user guessed my secret num->my program should stop
		 * otherwise it should continue asking to guess my number
		 */
		
		int secretNum=12;
		
		Scanner scan=new Scanner(System.in);
		int guessNum;
		
		System.out.println("Please enter a number to win");
		guessNum=scan.nextInt();
		
		
		while(guessNum!=secretNum) {
			System.out.println("Please enter a number to win");
			guessNum=scan.nextInt();
			
		}
		
		System.out.println("Congrats!");

	}

}

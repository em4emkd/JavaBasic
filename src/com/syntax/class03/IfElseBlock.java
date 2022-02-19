package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		
		int num1=100;
		int num2=50;
		
		//which number is largest
		
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		} 
		
		else {
			System.out.println(num2+" is larger than "+num1);
		}
		
		
		int temp=45;
		
		/*
		 * if temp is more than 45-->i am going for a walk
		 * therwise i am staying at home
		 */
		
		
		if(temp>45) {
			System.out.println("I am going for a walk");
		}
		else {
			System.out.println("I am staying at home");
		}
		
		
		/* 
		 * I need a var that stores a gender
		 * if gender if f--> use front of the train
		 * otherwise please use the back of the train
		 */
		
		char gender='f';

		if(gender=='f') {
			System.out.println("Please use the front of the train");
		} else {
			System.out.println("Please use the back of the train");
		}

	}

}

package com.syntax.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		// first we need to create a variable=box=container
		
		/*
		 * to create a variable we need:
		 * 		1. specify dataType
		 * 		2. give a name
		 */
		
		//data types that represent whole numbers
		
		byte box1 = 127;
		
		short box2 = 32767;
		
		int box3 = 327677666; //int is most widely used
		
		long box4 = 405712345678999l;
		
		//data types that represent decimal numbers
		
		float price=12.99f; //we need to add f/F when using float data type
		//float store up to 5/6 decimal values
		
		double price1=13.9988888888; //most used for decimal nums
		//double can hold more than 6 decimal numbers

		
		//to represent a single character 
		
		char gender = 'F';
		char sign = '$';

		//to represent yes or no
		
		boolean snow=false;
		boolean tired=true;
		
		
		System.out.println(price1);//referring to a variable(no quotes)
		
		System.out.println("price 1");
		
		System.out.println(sign);
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(price);
		System.out.println(gender);
		System.out.println(snow);
		System.out.println(tired);
		
		
	}

}

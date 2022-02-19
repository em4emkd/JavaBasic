package com.syntax.class04;

import java.util.Scanner;//we need to import scanner into our class

public class UserInput {

	public static void main(String[] args) {
		
		//Scanner is a non primitive 
		
		Scanner input=new Scanner(System.in);//creating a Scanner; input is the name we give, it can be anything 	
		
		System.out.println("Please enter your name:");
		
		//If you want to capture single String->use next();
		
		String name=input.next();//type String and hit enter
		
		System.out.println("Your name is "+name);
		
		
		//if we want to capture int val -> nextInt()
		
		System.out.println(name+" please enter your age");
		
		int age=input.nextInt();
		
		System.out.println("Your name is "+name+" and your age is "+age);
		

	}

}

package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		
		/*
		 * create a variable and assign value
		 * declare a variable and initialize
		 * identifier=name
		 */
		
		
		//one way of doing it
		int age = 25;
		
		
		//second way of doing it
		int num; //declare a variable
		num=10; //assign a values
		num=100;//reassign the value

		int n1, n2, n3;//all 3 variable are of int type
		
		n1=10; //we initialize/assign the value
		n2=20;
		n3=30;
		
		//cmd+d-->will remove entire line
		
		age=26; //reassigning the value of age
		
		System.out.println(age);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(num);
		
		/*
		 * JAVA Rules:
		 * 
		 * 1. do not use keywords as identifier(name)
		 * 2. do not start a name with a number or special char
		 * 3. Java allows to use _ OR $ as identifier, but you shouldn`t use it
		 * 
		 */
		
		double $price=1.99;
		double _value=2.99;
		
		/*
		 * Not JAVA rules, but we prefer to follow:
		 * 
		 * 1. variable names should start with lower case
		 * give vars meaningful name
		 * 2. class names should start with upper case
		 * 3. if name has 2 or more words -->follow camel casing
		 * 
		 */
		
		
	}

}

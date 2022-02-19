package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {

		// +, -, *, /, %; shorthand operators work with the math operators

		int num = 100;
		num = num + 100;

		System.out.println(num);

		num += 100;// same as num=num+100;

		System.out.println(num);

		num -= 20;
		System.out.println(num);

		num /= 10;
		System.out.println(num);

		num %= 2;
		System.out.println(num);

		/*
		 * 1. Declare variable and increase it’s value by 500 and then by 200 using
		 * shorthand operator
		 * 2. Declare variable and decrease it’s value by 60 using shorthand operator
		 * 3. Declare variable cakePiece=11 and divide the value of that variable between 4
		 * people using shorthand operator 
		 * 4. Declare variable cake=25 and divide cake
		 * between 7 people . Using shorthand operator found out how many pieces of cake
		 * left after it was distributed equally among 7 people
		 */
		
		
		//Task 1
		int var=100;
		var+=500;
		var+=200;
		
		System.out.println(var);
		
		//Task 2
		int var1=100;
		var1-=60;
		System.out.println(var1);
		
		//Task 3
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		//Task 4
		int cake=25;
		cake%=7;
		System.out.println(cake);
		

	}

}

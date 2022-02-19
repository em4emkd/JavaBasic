package com.syntax.class02;

public class OperatorsTaskOne {

	public static void main(String[] args) {

		/*
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values.
		 * Your program should say. “The _______ of 2 numbers ___ and ___ is equal to
		 * _____”
		 */

		double num1 = 6.6;
		double num2 = 2.2;

		double add = num1 + num2;
		double sub = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;

		System.out.println("The addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + add);
		System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub);
		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + mul);
		System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + div);

	}

}

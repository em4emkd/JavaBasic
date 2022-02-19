package com.syntax.class09;

public class AllValuesFromArrays {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[1]);

		// how many elements inside array?
		int size = grades.length;
		
		System.out.println("Numbers of elements is = " + size);

		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}

	}

}

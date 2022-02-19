package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {

		// we can use for each loop to iterate/loop through the entire array
		String[] cities = { "DC", "Boston", "Miami", "NY", "LA" };

		for (String city : cities) {

			System.out.println(city);

		}
		

		System.out.println("---------------------------");

		int[] numbers = { 10, 20, 30, 40 };

		for (int num : numbers) {// take each element from your array and store it inside a var
			System.out.println(num);
		}

		
		System.out.println("---------------------------");

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };

		for (char grade : grades) {
			System.out.print(grade + " ");
		}

	}
}

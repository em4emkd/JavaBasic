package com.syntax.class09;

public class ValFromArray {

	public static void main(String[] args) {

		//if value is Miami --> i want to live in Miami
		
		String[] cities = { "DC", "Miami", "NY", "LA" };

		for (int i = 0; i < cities.length; i++) {
			//System.out.print(cities[i] + ", ");
			
			if(cities[i].equals("Miami")) {
				System.out.println("I want to live in Miami");
			}
			
		}

		
		
		
		
		
	}

}

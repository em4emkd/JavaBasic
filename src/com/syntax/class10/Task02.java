package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of countries. While retrieving all values
		 * from the array print the capital for each country.
		 */
		
		String capital;
		String[] countries= {"Macedonia", "Bulgaria", "Serbia", "Croatia"};
		
		for(String country:countries) {
			
			switch(country) {
			
			case "Macedonia":
				capital="Skopje";
				break;
			case "Bulgaria":
				capital="Sofia";
				break;
			case "Serbia":
				capital="Belgrade";
				break;
			case "Croatia":
				capital="Zagreb";
				break;
			default:
				capital="Undefined";
			
			}
			
			System.out.println("The capital of "+country+" is "+capital);
			
		}
		
		
	}

}

package com.syntax.class06;

public class SwitchStatement {

	public static void main(String[] args) {
		
		//Switch statement is another conditional statement
		//Switch case is value based , it`s faster then if
		
		/*
		 * switch(variable){
		 * 
		 * case value1:
		 * 		code A;
		 * 		break;
		 * case value2:
		 * 		code B;
		 * 		break;
		 * default:
		 * 		code C;
		 * 		break
		 * }
		 */
		
		int day = 7;
		String dayName;

		if (day == 1) {
			dayName = "Monday";
		} else if (day == 2) {
			dayName = "Tuesday";
		} else if (day == 3) {
			dayName = "Wednesday";
		} else if (day == 4) {
			dayName = "Thursday";
		} else if (day == 5) {
			dayName = "Friday";
		} else if (day == 6) {
			dayName = "Saturday";
		} else if (day == 7) {
			dayName = "Sunday";
		} else {
			dayName = "Invalid";
		}

		System.out.println(dayName);

		System.out.println("--------------------------------");

		switch (day) {

		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid";
			break;
		}

		System.out.println(dayName);

	}
}

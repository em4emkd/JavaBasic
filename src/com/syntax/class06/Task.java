package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		/*
		 * Ask a user their enter their country and capture it.
		 * Once val are captured print which language user speaks
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.nextLine();
		
		String language;
		
		switch(country.toLowerCase()) {
		
		case "usa":
			language="English";
			break;
		case "germany":
			language="German";
			break;
		case "macedonia":
			language="Macedonian";
			break;
		case "turkey":
			language="Turkish";
			break;
		default:
			language="Unknown Info";
		

		}
		
		System.out.println("In "+country+" people speak "+language);
		
		
	}

}

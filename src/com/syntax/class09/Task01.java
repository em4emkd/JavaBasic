package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 * 
		 * 
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 * 
		 * 
		 * Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using elements of array: “Saturday is Java coding Day”.
		 */
		
		//Task 1
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		//Task1
		
		char[] grades1={'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grades1[1]);
		
		System.out.println("---------------------------");
		
		//Task2
		
		String[] names=new String[8];
		
		names[0]="Manana";
		names[2]="Sarkar";
		names[3]="Mykl";
		names[4]="Cece";
		names[5]="Monique";
		names[6]="Zakirullah";
		names[7]="Emilija";
		System.out.println(names[7]);
		
		//Task2
		String[] names1= {"Manana", "Sarkar", "Mykl", "Cece", "Monique", "Zakirullah", "Emilija"};
		System.out.println(names1[6]);
		
		
		//Task3
		String[] words=new String[5];
		
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		//Task3
		
		String[] words1= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words1[1]+" "+words1[4]+" "+words1[0]+" "+words1[3]+" "+words1[2]);
		
	
		

	}

}

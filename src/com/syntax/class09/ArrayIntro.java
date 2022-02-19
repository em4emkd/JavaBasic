package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=1;
		
		//create an array
		int[] numbers=new int[4];
		
		
		//storing values/elements inside an area
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		//print 99
		System.out.println(numbers[3]);
		
		System.out.println(numbers[3]+numbers[0]);
		
		//I want to print an array of countries

		String[] countries=new String[5];
		
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Macedonia";
		countries[3]="Serbia";
		countries[4]="Turkey";
		
		//countries[5]="Moldova";
		
		System.out.println(countries[0]+countries[2]);
		
		
		System.out.println("--------------------");
		
		String[] names=new String[5];
		
		names[1]="Orsan";
		names[2]="Dana";
		names[3]="Gulnar";
		
		System.out.println(names[0]);//null/empty
		System.out.println(names[1]);
		System.out.println(names[4]);
		
		
		names[1]="Violet";
		System.out.println(names[1]);
		
		
		//create an array to store 4 different prices
		//find the average of how much we spent
		
		double[] prices=new double[4];
		
		prices[0]=1.22;
		prices[1]=2.22;
		prices[2]=3.22;
		prices[3]=4.22;
		
		
		double average=prices[0]+prices[1]+prices[2]+prices[3]/4;
		System.out.println(average);
		
	}

}

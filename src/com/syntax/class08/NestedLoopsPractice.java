package com.syntax.class08;

public class NestedLoopsPractice {

	public static void main(String[] args) {
		
		System.out.println("------Car Mileage------");
		
		for(int a=0; a<=9; a++) {
			
			for(int b=0; b<=9; b++) {
				
				for(int c=0; c<=9; c++) {
					
					System.out.println(a+" "+b+" "+c );
				}
			}
		}

	}

}

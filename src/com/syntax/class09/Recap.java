package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		
		for(int i=0; i<=4; i++) {
			
			System.out.println("A");
			
			//continue;
			
			System.out.println("B");
			
		}
		
		
		System.out.println("-------------------------");
		
		//inner loop resets 

		for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=3; j++) {
				
				System.out.println("Hello");
				break;
			}
			
			
			System.out.println("Good Morning ");
			
		}
	}

}

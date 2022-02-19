package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		
		int time=10;
		
		if(time<12) {
			System.out.println("Morning"); //prints one time
		}
		
		System.out.println("---------------------");
		
		while(time<12) {
			System.out.println("Morning");
			time++;
		}
		
		System.out.println("End of code");

	}

}

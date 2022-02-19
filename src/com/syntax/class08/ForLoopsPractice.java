package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello "+i);
		}
		
		System.out.println("---MULTIPLICATION TABLE---");
		
		/*
		 * 3x1=3
		 * 3x2=6
		 * 3x3=9...
		 */
		
		int num=3;
		int result;
		for(int i=1; i<=10; i++) {
			
			result=num*i;
			System.out.println(num+" x "+i+" = "+result);
			
		}
		
		System.out.println("---WHAT IS THE OUTPUT---");
		
		for(int i=0; i<=10; i+=3) {
			
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("---WHAT IS THE OUTPUT---");
		
		int sum=0;
		for(int i=1; i<=5; i++) {
			
			sum+=i;//sum=sum+i;
		}
		System.out.println(sum);
		
		System.out.println("---WHAT IS THE OUTPUT---");
		
		int value=1;
		
		for(int i=1; i<4; i++) {
			
			value*=i;
		}
		System.out.println(value);
		
		/*
		 * find the sum of all even and odd numbers from 1 to 50
		 */
		
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd = sumOdd + i;
			}
		}
		System.out.println("The sum of all even num is " + sumEven + " and the sum of all odd nums is " + sumOdd);

		
		System.out.println("ANOTHER WAY TO FIND SUM OF EVEN AND ODD");
		
		int sumEven1 = 0;

		for (int i = 2; i <= 50; i += 2) {
			sumEven1 += i;
		}
		System.out.println(sumEven1);

		int sumOdd1 = 0;

		for (int i = 1; i <= 50; i += 2) {
			sumOdd1 += i;
		}
		System.out.println(sumOdd1);
		
	}
}

package com.syntax.class05;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		 
		 Scanner scan=new Scanner(System.in);

		   System.out.println("Do you need a loan?");
		   boolean boo=scan.nextBoolean();


		   if(boo){
		    System.out.println("What is your credit score?");
		    int score=scan.nextInt();
		    
		     if(score<600){
		       System.out.println("The eligibility is Not eligible");
		     }else if(score>=600 && score<=700){
		       System.out.println("The eligibility is Maybe eligible");
		     } else if(score>=701 && score<=800){
		       System.out.println("The eligibility is Eligible");
		     } else if(score>801){
		       System.out.println("The eligibility is Definitely eligible");
		     }

		   } else {
		     System.out.println("Unknown");
		   }



		 
		
		    
		    

	}

}

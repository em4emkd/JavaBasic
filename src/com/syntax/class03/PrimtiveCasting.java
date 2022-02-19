package com.syntax.class03;

public class PrimtiveCasting {

	public static void main(String[] args) {
		
	//main+cmd+space --> auto complete main method
	// casting means changing one data type to another
		//2 types of casting:
		// widening/implicit/automatic:from smallest to bigger:
		
		//byte->short->int->long->float->double
		
		// narrowing/explicit/ manual
		
		
		//widening or implicit
		//we store int value 10 inside double variable	
		int i=10;
		double d=10;
		
		System.out.println(i);
		System.out.println(d);
		
		
		//int num=10.0;//Type mismatch: cannot convert from double to int
		
		
		//narrowing or explicit casting
		//we store double val 10.99 into int var 
		int num=(int)10.99;
		System.out.println(num);
		
		float f=10.99f;
		System.out.println(f);
		
		byte b=(byte)128;
		System.out.println(b);
		
		int number=(int)1156878768;
		System.out.println(number);
		
	}

}

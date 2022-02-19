package com.syntax.class10;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		int[][] numbers = { 
				{ 10, 20, 30, 40 }, 
				{ 100, 200, 300, 400 }, 
				{ 1000, 2000 } 
			};
		
		int size=numbers.length;//how many arrays/raws inside the 2d array
		System.out.println(size);//3
		
		int sizeOf1Array=numbers[0].length;//size of inside array
		System.out.println(sizeOf1Array);//4
		
		System.out.println("-------------------------------");
		//Retrieving all elements from 2d array
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				
				System.out.print(numbers[i][j]+" ");
				
			}
			
			System.out.println();
		}

	}

}

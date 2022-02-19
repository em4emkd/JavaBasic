package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {
		
		String[][] foods= {
				{"redbull", "burger", "steak", "fries"}, 
				
				{"curry", "biriyani", "butter chicken"}, 
				
				{"noodles", "pad thai", "tom yum"}, 
				
				{"pasta", "pizza"}
			};
		
		//iterate over every array/row
		for(int row=0; row<foods.length; row++) {
			
			//iterate over every column of specified row
			for(int col=0; col<foods[row].length; col++) {
				
				System.out.print(foods[row][col]+" ");
			} 
			
			System.out.println();
		}
		
		System.out.println("--All Vals from 2D array using Enhanced For Loop--");
		
		
		for(String[] food:foods) {//grabbing each array
			
			for(String foo:food) {//grabbing each element from selected array
				
				System.out.print(foo+" ");
			}
			
			System.out.println();
		}
		
		
		
		

	}

}

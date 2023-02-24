package com.java.array.programs;

public class ArraysProgramPractice {
	
	public static void main(String[] args) {
		//1. How to find the missing number in integer array of 1 to 100?
		printMissingElementFromArray(new int[]{1, 2, 3, 4, 6}, 6);
		
		
	}
	
	public static void printMissingElementFromArray(int[] arr, int count) {
		
		/**
		 * step 1. sum all the 1-count
		 */
		int sum = 0;
		for(int i = 1; i<=count; i++) {
			//sum= sum+i;
			
			sum+=i;
		}
		System.out.println(sum);
		int arraySum = 0;
		
		// step 2. sum actual array element
		
		for(int i = 0; i<arr.length; i++) {
			arraySum+=arr[i];
			//arraySum=arraySum+arr[i];
		}
		
		System.out.println(arraySum);
		
		System.out.println("Missing Element:"+(sum-arraySum));
	}

}

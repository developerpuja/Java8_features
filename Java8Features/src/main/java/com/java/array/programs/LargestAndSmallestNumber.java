package com.java.array.programs;


public class LargestAndSmallestNumber {
	
	public static void main(String[] args) {
		int[] arr = {-20, 34, 21, -87, 92};
		
		largestAndSmallest(arr);
		
		//How to find all pairs on integer array whose sum is equal to given number?
		int[] arr1 = {5, 3, 7, 8, 1, 3, 4};
		
		//using normal iterations
		//findElementWithGivenSum(arr1, 9);
		
		// using hashset
		
		findElementWithGivenSumHashtable(arr1, 9);
		
	}

	private static void findElementWithGivenSumHashtable(int[] arr1, int sum) {
		// check if array length is less than 2
		
		if(arr1.length < 2) {
			return;
		}
		
		//Set<Integer> set = new HashSet<>(arr1);
		
//		for (int num : arr1) {
//			int target = sum-num;
//			if(set.contains(target)) {
//				System.out.println("Pair of num with givem sum is: "+ target+", "+ num);
//			} 
//		}
		
	}

	private static void findElementWithGivenSum(int[] array, int sum) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if((array[i]+array[j]) == sum) {
					System.out.println("Pair of num with givem sum is: "+ array[i]+", "+ array[j]);
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) { 
			int first = array[i]; 
			for (int j = i + 1; j < array.length; j++) { 
				int second = array[j]; 
				if ((first + second) == sum) { 
					System.out.printf("(%d, %d) %n", first, second); 
					}
				} 
			}
	}

	private static void largestAndSmallest(int[] arr) {
		// TODO Auto-generated method stub
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num > largest) {
				largest = num;
				
			} else if(num < smallest) {
				smallest = num;
			}
		}
		
		System.out.println("Largest: "+largest+" Smallest: "+smallest);
	}
	
	

}

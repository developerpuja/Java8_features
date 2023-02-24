package com.java.practice.program;

import java.util.Arrays;

public class ArrayPracticeProgram {

	public static void main(String[] args) {
		// sort an array
		//sortAnArray();
		//Write a Java program to sum values of an array
		//sumArrayElements();
		//Write a Java program to print the following grid
		//printGrid(10);
		//Write a Java program to calculate the average value of array elements.
		//findAverageValue();
		// Write a Java program to test if an array contains a specific value.
		//checkTheElement(4);
		// Write a Java program to remove a specific element from an array.
		//removeTheGivenElement(4);
		//Write a Java program to insert an element (specific position) into an array.
		addAnElementAtSpecificPosition(17, 3);
		//Write a Java program to remove duplicate elements from an array
		
	}

	private static void addAnElementAtSpecificPosition(int n, int pos) {
		int[] intArr = {12, 4, 1, 23, 4, 10};
		int[] newArr = new int[intArr.length+1];
		
		for(int i = 0; i< intArr.length; i++) {
			
			if(i< pos) {
				newArr[i] = intArr[i];
			}else if(i == pos) {
				newArr[i]= n ;
				//i++;
			} 
			newArr[i+1] = intArr[i];
		} 
		
		for(int i = 0; i< newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		
	}

	private static void removeTheGivenElement(int n) {
		int[] intArr = {12, 4, 1, 23, 4, 10};
		for(int i = 0; i<intArr.length ; i++) {
			if(intArr[i] == n) {
				
				break;
			}
		}	
		
	}

	private static void checkTheElement(int n) {
		int[] intArr = {12, 1, 23, 4, 10};
		int count = 0;
		for(int i = 0; i<intArr.length ; i++) {
			if(intArr[i] == n) {
				System.out.println("Array contains the given");
				break;
			}
			count++;
		}
		
		System.out.println(count);
		
	}

	private static void findAverageValue() {
		int[] intArr = {12, 1, 23, 4, 10};
		int sum = Arrays.stream(intArr).sum();
		System.out.println(sum);
		int avg = sum/(intArr.length);
		System.out.println(avg);
		
	}

	private static void printGrid(int n ) {
		for(int i = 0; i<n ; i++) {
			System.out.println("- - - - - - - - - - ");
		}
		
	}

	private static void sumArrayElements() {
		int[] intArr = {12, 1, 23, 4, 10};
		int sum = 0;
		for (int i=0; i< intArr.length; i++) {
			sum+= intArr[i];
		}
		
		System.out.println("Integer sum: "+sum);
		
	}

	private static void sortAnArray() {
		int[] intArr = {12, 1, 23, 4, 10};
		int temp;
		
		for(int i = 0; i<intArr.length; i++) {
			for(int j = i+1; j<intArr.length-1; j++) {
				if(intArr[i] > intArr[j]) {
					temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

}

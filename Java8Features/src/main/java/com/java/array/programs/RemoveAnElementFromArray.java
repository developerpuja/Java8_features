package com.java.array.programs;

public class RemoveAnElementFromArray {
	
	public static void main(String[] args) {
		removeElementFromArray(3);
	}

	private static void removeElementFromArray(int n) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1, 4, 3, 6, 7};
		int[] newArray = new int[arr.length-1];
		
		for(int i = 0, k= 0; i< arr.length; i++ ) {
			if(arr[i] != n) {
				newArray[k]= arr[i];
				k++;
			}
		}
		
		for(int i = 0; i< arr.length; i++ ) {
		System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i< newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		
	}

}

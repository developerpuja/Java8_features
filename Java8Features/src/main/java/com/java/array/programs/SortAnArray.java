package com.java.array.programs;

public class SortAnArray {
	
	public static void main(String[] args) {
		int[] arr = {-20, 34, 21, -87, 92};
		//linear sort
		SortAnArray0(arr);
		System.out.println();
		SortAnArray1(arr);
	}

	private static void SortAnArray1(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length-1;j++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	
	}
	

	private static void SortAnArray0(int[] arr) {
		int temp;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length-1;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

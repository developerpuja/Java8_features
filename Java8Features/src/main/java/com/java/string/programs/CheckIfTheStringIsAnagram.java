package com.java.string.programs;

import java.util.Arrays;

public class CheckIfTheStringIsAnagram {

	public static void main(String[] args) {
		
		checkAnagram("keep", "peek");

	}

	private static void checkAnagram(String string, String string2) {
		if(string.length() != string2.length()) {
		   return;
		}
		// sort both the strings
		char[] charArr1 = string.toCharArray();
		char[] charArr2 = string2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		//check equality of 2 arrays using == operator
		System.out.println(Arrays.equals(charArr1, charArr2));
		
		
		
		// compare each element in char array using loop
		
		for (int i =0; i < string.length(); i++) {
			System.out.println(charArr1[i]);
		}
		
		for (int i =0; i < string.length(); i++) {
			System.out.println(charArr2[i]);
		}
		
	}

}

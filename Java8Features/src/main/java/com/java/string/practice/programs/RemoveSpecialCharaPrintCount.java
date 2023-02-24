package com.java.string.practice.programs;

public class RemoveSpecialCharaPrintCount {

	public static void main(String[] args) {
		String str = "He is a very very good boy, isn't he?";
		
		String[] str1 = str.split(" ");
		
		String newStr = str.replace("[, ' ?]", "");
		
		System.out.println(newStr);
		
		for (int i = 0; i <= str1.length -1; i++ ) {
			System.out.println(str1[i]);
		}
	}
}

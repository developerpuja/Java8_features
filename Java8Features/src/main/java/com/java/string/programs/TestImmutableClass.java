package com.java.string.programs;

import java.util.Arrays;
import java.util.List;

public class TestImmutableClass {
	
	public static void main(String[] args) {
		List<String> favColors = Arrays.asList("Red", "White", "Black", "Blue");
		String name = "Puja";
		
		ImmutableClass class1 = new ImmutableClass(1, name , favColors);
		favColors.add("brown");
		//name = "Nikhil";
		
		System.out.println(class1.getId());
		System.out.println(class1.getName());
		System.out.println(class1.getFavColors());
		
		
		
		class1 = new ImmutableClass(2, "Pam", favColors);
		
//		String s1 = "Puja";
//		System.out.println(s1);
//		s1 = "Nikhil";
//		System.out.println(s1);
		
		System.out.println(class1.getId());
		System.out.println(class1.getName());
		System.out.println(class1.getFavColors());
	}

}

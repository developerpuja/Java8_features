package com.java.string.practice.programs;

public class CountOvelsSpacesConsonentDigits {
	public static void main(String[] args) {
		String s = "Hello Puja how are you this is 2023 ";
		// aeiou AEIOU
		//countEverything(s);
		deleteAllTheConsonent(s);
	}

	private static void deleteAllTheConsonent(String s) {
		String vowels = "aeiouAEIOU";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i< s.length(); i++) {
			char ch = s.charAt(i);
			
			if(vowels.indexOf(ch) != -1) {
				sb.append(ch);
			}
		}
		
		System.out.println(sb.toString());
		
	}

	private static void countEverything(String s) {
		int ovelCount = 0;
		int spaces = 0;
		int digit = 0;
		int consonent = 0;
		
		for(int i = 0; i< s.length(); i++) {
			char ch = s.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
					|| ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U') {
				ovelCount++;
			} else if(Character.isDigit(ch)) {
				digit++;
			} else if(Character.isWhitespace(ch)) {
				spaces++;
			}else {
				consonent++;
			}
		}
		
		System.out.println("Digit count: "+digit);
		System.out.println("Spaces count: "+spaces);
		System.out.println("Ovel count: "+ovelCount);
		System.out.println("Consonent count: "+consonent);
	}

}

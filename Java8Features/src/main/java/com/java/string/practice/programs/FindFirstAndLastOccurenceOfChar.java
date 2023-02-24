package com.java.string.practice.programs;

public class FindFirstAndLastOccurenceOfChar {

	public static void main(String[] args) {
		//printFirstAndLastOccurencesofGivenChara("Hello world", 'o');
		printFirstAndLastOccurencesofGivenChara1AndComma("Hello, world", 'o');
	}

	private static void printFirstAndLastOccurencesofGivenChara1AndComma(String string, char c) {
		int first_o = -1;
		int last_o = -1;
		int first_comma = -1;
		int last_comma = -1;
		
		for(int i = 0; i<string.length(); i++) {
			if(string.charAt(i) == 'o') {
				if(first_o == -1) {
					first_o = i;
				}
				
				last_o = i;
			}
			
			if(string.charAt(i) == ',') {
				if(first_comma == -1) {
					first_comma = i;
				}
				
				last_comma = i;
			}
		}
		
		System.out.println("First Occu: "+ first_o+" Last Occu: "+last_o +"first_comma: "+first_comma+"last_comma: "+last_comma);
		
	}

	private static void printFirstAndLastOccurencesofGivenChara(String s, char c) {
		int first = 0;
		int last = 0;
		
		
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) == 'o') {
				first = i;
				break;
			}
		}
		
		System.out.println(s.length());
		
		for(int i = s.length()-1; i>0; i--) {
			if(s.charAt(i) == 'o') {
				last = i;
				break;
			}
		}
		
		System.out.println("First Occu: "+ first+"Last Occu: "+last);
		
	}

}

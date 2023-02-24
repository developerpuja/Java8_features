package com.java.string.practice.programs;

public class ReverseStringReserveSpaces {
	
	public static void main(String[] args) {
		//reverseString("Puja Vasant Shingare");
		reverseString1("Puja Vasant Shingare");
		reverseString1("1 22 333 4444 55555");
	}
	
	private static void reverseString1(String string) {
		String newString =  "";
		
		for(int i = string.length()-1; i >=0; i--) {
			String s = string.charAt(i)+"";
			
			newString= newString+s;
		}
		
		System.out.println(newString);
	}

	static void reverseString(String instr) {
		char[] input = instr.toCharArray();
		char[] result = new char[input.length];
		int j = result.length-1;
			
		for (int i = 0; i < input.length; i++){
				result[j] = input[i];
				j--;
	
		}
		 System.out.println(instr+" --->"+String.valueOf(result));
	}

}

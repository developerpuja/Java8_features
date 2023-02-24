package com.java.array.programs;

public class maxRepeatingChar {
	
	public static void main(String[] args) {
		
		maxRepeating("aaaabbbbbaaccde");
	}

	private static void maxRepeating(String string) {
		// TODO Auto-generated method stub
		
		int len = string.length();
		char res = string.charAt(0);
		int count = 0, curCount = 1;
		
		for(int i = 0; i<len; i++) {
			if(i < len-1 && string.charAt(i) == string.charAt(i+1)) {
				curCount++;
			} else {
				if(curCount > count) {
					count = curCount;
					res = string.charAt(i);
				}
				curCount = 1;
			}
		}
		
		System.out.println("Max Repeated char:"+res+": "+ count);
		
	}

}

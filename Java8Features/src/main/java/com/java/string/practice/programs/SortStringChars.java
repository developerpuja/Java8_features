package com.java.string.practice.programs;

public class SortStringChars {

	public static void main(String[] args) {
		String str = "ahgjktrbdc";
		char temp = 0;
		char[] charArr = str.toCharArray();
		
		
		for(int i = 0 ; i < charArr.length; i++) {
			for(int j = i+1; j < charArr.length; j++) {
				if(charArr[i] > charArr[j]) {
					temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
					
				}
			}
		}
		
		for(int k=0;k<charArr.length;k++){
			System.out.print(charArr[k]);
			}
	}
}

package com.java.string.practice.programs;

public class ConvertNameInitials {
	// input: Puja Vasant Shingare output: P.V.Shingare
	
	public static void main(String[] args) {
		String name = "Puja Vasant Shingare";
		String name1 = "Aditya Vinod Waral";
		
		convertNameInitials(name);
		convertNameInitials(name1);
	}

	private static void convertNameInitials(String name) {
		String newName = name.charAt(0)+"";
		newName = newName+". ";
		String last_word = "";
		String[] arr = name.split(" ");
		
		for(int i = 0; i< name.length(); i++) {
			if(name.charAt(i) == ' ' && name.charAt(i+1) != ' ' && i+1 < name.length()) {
				newName = (newName+name.charAt(i+1)).toUpperCase();
				newName = newName+". ";
				break;
			}
			
		}
		
		for(int i = arr.length-1; i>=0; i--) {
			if(last_word == "")
				last_word = arr[i];
			break;
			//System.out.println(last_word);
		}
		String shortName = newName+last_word;
		System.out.println(shortName);
	}

}

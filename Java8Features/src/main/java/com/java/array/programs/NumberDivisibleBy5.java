package com.java.array.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberDivisibleBy5 {

	// Given list of numbers, print number which are divisible by 5
	
	
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers1 = Arrays.asList(5, 10, 8, 9, 6, 7, 10, 8, 5, 9, 15, 20, 25, 11, 23, 25);

		// numbers.stream().filter(num -> num%5 == 0).forEach(System.out::println);
        
         //Write a program to find occurrence of each number in list
		 Map<Integer, Long> occurence = numbers1.stream().sorted().collect(Collectors.groupingBy(num->num, Collectors.counting()));
		 
		for(Map.Entry<Integer, Long> entry: occurence.entrySet()) {
			System.out.println("Key: "+entry.getKey() +" Value: "+entry.getValue());
		}
		
		
		String s = "Hello Puja how are you you are great person";
		
		String newString = s.replaceAll(" ", "");
		
		System.out.println(newString);
		
		String[] strArray = newString.split("");
		
		Map<String, Long> map = Arrays.stream(strArray).sorted().collect(Collectors.groupingBy(ch->ch, Collectors.counting()));
        
        for(Map.Entry<String, Long> entry: map.entrySet()){
        	System.out.println("char: "+entry.getKey() +" Occurances: "+entry.getValue());
        }
        
        //Write a program to find third largest number from list
        
         List<Integer> thirdLargestNum = Arrays.asList(5, 10, 8, 9, 6, 7, 10, 8, 5, 9, 15, 20, 25, 11, 23, 25);
         
         //List<Integer> sortedList = thirdLargestNum.stream().sorted().distinct().toList();
         
       //  System.out.println(sortedList.get(sortedList.size()-3));

	}

}

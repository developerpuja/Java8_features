package com.java8.features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamOperations {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5);
		
		List<Integer> squareNumber = number.stream().map(x -> x*x).collect(Collectors.toList());
        int even = number.stream().filter(x -> x%2 == 0).reduce(0,(ans,i)-> ans+i);
        
        System.out.println(even);
        System.out.println(squareNumber);
        
        
        
        
        /// convert the String list into the integer list
        
        List<String> strList = Arrays.asList("123","34","45","56","12","41");
        String[] strArray = {"123","34","45","56","12","41"};
        Stream<String> stream = Arrays.stream(strArray);
        
        Stream<String> newStream = Stream.of(strArray);
        
        List<Integer> intList = strList.stream().map(str -> Integer.parseInt(str)).collect(Collectors.toList());
        System.out.println(intList);
	}

}

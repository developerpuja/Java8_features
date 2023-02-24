//package com.java.stream.practice;
//
//import java.util.Arrays;
//import java.util.List;
//
//
//import org.springframework.util.comparator.Comparators;
//
//
//public class StreamStringOperations {
//
//	/*
//	 * Ex:  Requirement: filter element whose length is greater than 5 and collect in list
//	 * Get unique cities and print
//	   Get unique numbers and print
//	   Print cities in natural sorting order and reverse sorting order
//	   Print first 5 elements of numbers and cities
//       Print all elements of numbers and cities after 3rd element
//
//	 */
//
//	public static void main(String[] args) {
//		List<String> courses = List.of("Spring 6", "Spring Boot 10", "API" , "Microservices", "AWS",
//				"PCF","Azure", "Docker", "Kubernetes");
//
//		List<String> cities = Arrays.asList("nagpur", "pune", "akola", "latur", "buldhana", "paithan", "nagalgaon", "pune", "akola", "akola");
//
//		//filter element whose length is greater than 5 and collect in list
//
//		List<String> length5 = courses.stream().filter(str -> str.length() > 5).toList();
//		System.out.println(length5);
//
//		//Get unique cities and print
//
//		List<String> uniqueCities = cities.stream().distinct().toList();
//		System.out.println("Unique Cities: "+ uniqueCities);
//
//		//Print cities in natural sorting order and reverse sorting order
//
//		System.out.println(cities.stream().sorted().toList());
//
//		System.out.println(cities.stream().sorted(Comparators.comparable().reversed()).toList());
//
//		//System.out.println(cities.stream().);
//
//
//
//
//
//
//	}
//
//}

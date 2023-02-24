package com.java.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntegerListOperation {
	
	/**
	 *  
	 *  int[] intArr = { 1, 256, 53, 65,00, 22, 33, 56, 9, 100,00 };
		Collect only even number
		Collect numbers which are divisible by 5 to the list
		Collect then numbers without zero
		Print Only Odd Numbers from the List
		Create a List with Even Numbers Filtered from the Numbers List
		Print the cubes of odd numbers
	 */
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 256, 53, 65,0, 22, 33, 56, 9, 100, 00);
		
		//1. Add all element using stream
		
		System.out.println(list.stream().reduce(0, (e1,e2) -> e1+e2));
		
		//2. add only even number
		
		System.out.println(list.stream().filter(n-> n%2 ==0).reduce(0, (e1,e2)-> e1+e2));
		
		//3. Collect only even number in new list
		
		List<Integer> newList =list.stream().filter(n-> n%2 == 0).collect(Collectors.toList());
		System.out.println(newList);
		
//		//4. Collect numbers which are divisible by 5 to the list
//
//		List<Integer> divByFive = list.stream().filter(n-> n % 5 == 0).toList();
//		System.out.println("divisible by 5 to the list: "+divByFive);
//
//		// 5. Collect zero
//
//		List<Integer> onlyZeros = list.stream().filter(n-> n == 0).toList();
//		System.out.println("numbers without zero: "+onlyZeros);
//
//		// 6. Collect without zero
//		List<Integer> zeros = list.stream().filter(n -> n != 0).toList();
//		System.out.println("zeros: "+zeros);
//
//		// 7. Only cube of Odd Numbers from the List
//
//		List<Long> cubeOfOdds = list.stream().filter(n -> n%2 !=0).map(p -> (long)Math.pow(p, 3)).toList();
//
//		System.out.println("cube of Odd Numbers from the List "+cubeOfOdds);
		
		// 8.Find the sum of all odd numbers of a list

		// 9.Square every number in a list and find the sum of squares
		
		 int sum = list.stream().filter(n -> n%2 !=0).reduce(0, (n1, n2)-> n1+n2);
		 System.out.println("sum of all odd numbers of a list: "+ sum);


		 // Print first 5 elements of numbers and cities
		list.stream().limit(5).forEach(System.out::print);

		// all elements of numbers and cities after 3rd element

		System.out.println();

		list.stream().skip(2).forEach(System.out::print);

		// 9.Square every number in a list and find the sum of squares
		System.out.println();
		System.out.println("Power********************************************");

		list.stream().map(n -> (long) Math.pow(n,2)).collect(Collectors.toList()).forEach(System.out::println);
	}

}

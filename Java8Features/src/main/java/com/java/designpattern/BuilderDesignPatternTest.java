package com.java.designpattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BuilderDesignPatternTest {
	
	public static void main(String[] args) {
//		CarBuilderDP builderDP = new CarBuilderDP.CarBuilder()
//				.color("red")
//				.horsepower(234)
//				.setYear(1995).setModel("lambo")
//				.build();
//		
//		System.out.println(builderDP.toString());
//		
//		List<Integer> numbers = Arrays.asList(5, 10, 8, 9, 6, 7, 10, 8, 5, 9, 15, 20, 25, 11, 23, 25);
//		List<Integer> sortedNumbers= numbers.stream().sorted().distinct().collect(Collectors.toList());
//		
//		System.out.println(sortedNumbers.get(sortedNumbers.size()-3));
//		
//		System.out.println(sortedNumbers);
		
		
		
		
		Employee e = new Employee.EmployeeBuilder().setId(1).setS("").build();
	}
	

}

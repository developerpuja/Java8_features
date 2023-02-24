package com.java.stream.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Exercises on Employee class:
 * 1.       Get the employees whose salary is greater than 50000 and collect them into list.
 * 2.       Get Employee name and collect into list.
 * 3.       Sort the employees whose id even
 * 4.       group employee by designation print designation and no of employee
 */

public class StreamOperationsOnEmployeeObject {
	
	public static void main(String[] args) {
		List<Employee> employeeList = getEmployeeList();

		//1. Get the employees whose salary is greater than 50000 and collect them into list.
		List<Employee> employeeHighSalary = employeeList.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());
		System.out.println(employeeHighSalary);

		// 2.Get Employee name and collect into list.

		List<String> empNameList = employeeList.stream().map(e-> e.getName()).collect(Collectors.toList());
		System.out.println(empNameList);

		//employees whose id even
		List<Employee> evenIdEmp = employeeList.stream().filter(e -> e.getId() % 2 == 0).collect(Collectors.toList());
		System.out.println(evenIdEmp);

		// employees whose name start with P
		List<Employee> nameP = employeeList.stream().filter(p -> p.getName().charAt(0) == 'P').collect(Collectors.toList());
		System.out.println(nameP);


		// 4. group employee by designation print designation and no of employee
		Map<Object, Long> map = employeeList.stream().collect(Collectors.groupingBy(e-> e.getDesignation(), Collectors.counting()));

		System.out.println(map);

		//4 sort employee ages
		List<Employee> sortedBySal = employeeList.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).collect(Collectors.toList());
        System.out.println(sortedBySal);
	}


	private static List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		Employee employee1 = new Employee(1, "Puja", "Engineer", 50000);
		Employee employee2 = new Employee(2, "Jay", "Designer", 60000);
		Employee employee3 = new Employee(3, "Sudha", "Architect", 70000);
		Employee employee4 = new Employee(4, "Neha", "Advocate", 50000);
		Employee employee5 = new Employee(5, "Vedu", "Athlete", 2000);
		Employee employee6 = new Employee(6, "Raha", "Designer", 90000);
		Employee employee7 = new Employee(7, "Sona", "Engineer", 20000);
		Employee employee8 = new Employee(8, "Mona", "Architect", 30000);
		Employee employee9 = new Employee(9, "Swara", "chef", 40000);
		Employee employee10 = new Employee(10, "Myra", "Engineer", 50000);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		employeeList.add(employee6);
		employeeList.add(employee7);
		employeeList.add(employee8);
		employeeList.add(employee9);
		employeeList.add(employee10);

		return  employeeList;
	}

}

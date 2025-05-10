//package com.java8.features.Streams;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//import org.springframework.util.comparator.Comparators;
//
//public class StreamTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/**
//		 * Stream is sequence of element from source here source can be array or collections
//		 * stream is used to process or filter the collection it has some methods, we can pipeline those methods to get the
//		 * desired output, using stream we can perform 2 types of operation
//		 * 1. Intermediate operations -> intermediate operations always return stream
//		 * map(), filter(), sorted()
//		 *
//		 * 2. terminal operations -> terminal operations is use to convert stream in other forms like Array List, Set, map
//		 * forEach(), collect(), match(), count(), reduce().
//		 */
//
//		Predicate<Employee> predicate = new Predicate<Employee>() {
//
//			@Override
//			public boolean test(Employee t) {
//				// TODO Auto-generated method stub
//				if (t.getSalary() > 20000) {
//					return true;
//				} else {
//					return false;
//				}
//			}
//		};
//
//		// FILTER EXAMPLES
//		List<Employee> higherSalaryEmp = new ArrayList<>();
//
//		List<Employee> employees = new ArrayList<>();
//		Employee employee1 = new Employee(1, "John", "john@gmail.com", "java", 40000);
//		Employee employee2 = new Employee(1, "Jacob", "jacob@gmail.com", "ui", 20000);
//		Employee employee3 = new Employee(1, "Jonas", "jonas@gmail.com", "ux", 30000);
//		Employee employee4 = new Employee(1, "Saviyana", "saviyana@gmail.com", "ops", 25000);
//		Employee employee5 = new Employee(1, "eli", "eli@gmail.com", "servicenow", 70000);
//		Employee employee6 = new Employee(1, "suhana", "suhana@gmail.com", "dotnet", 40000);
//		Employee employee7 = new Employee(1, "Saviyana", "suhana@gmail.com", "dotnet", 40000);
//		Employee employee8 = new Employee(1, "suhana", "suhana@gmail.com", "dotnet", 40000);
//		Employee employee9 = new Employee(1, "jonas", "suhana@gmail.com", "dotnet", 40000);
//		Employee employee10 = new Employee(1, "suhana", "suhana@gmail.com", "dotnet", 40000);
//		Employee employee11 = new Employee(1, "eli", "suhana@gmail.com", "dotnet", 40000);
//		Employee employee12 = new Employee(1, "suhana", "suhana@gmail.com", "dotnet", 40000);
//
//
//
//
//
//		employees.add(employee6);
//		employees.add(employee5);
//		employees.add(employee4);
//		employees.add(employee3);
//		employees.add(employee2);
//		employees.add(employee7);
//		employees.add(employee8);
//		employees.add(employee9);
//		employees.add(employee10);
//		employees.add(employee11);
//		employees.add(employee12);
//
//		employees.stream().filter(predicate).forEach(e->{System.out.println(e.getName()+" "+e.getSalary());});
//
//		List<Employee> sortedSalary = employees.stream().sorted((e1, e2) -> e1.getSalary()-e2.getSalary()).toList();
//
//		sortedSalary.forEach(e1->{System.out.println(e1.getSalary());});
//
//
//
//		//collect the employee in map having same name where key is name and list of employee having same name
//
//
//		//nameemployees.stream().collect(Collectors.groupingBy(employee -> employee.getName());
//
//		employees.stream().collect(Collectors.groupingBy(Employee::getName)
//
//	}
//
//}

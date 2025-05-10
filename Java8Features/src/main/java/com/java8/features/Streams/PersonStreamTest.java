package com.java8.features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.logging.log4j.util.PropertySource.Comparator;
import org.springframework.util.comparator.Comparators;

public class PersonStreamTest {
	
	public static void main(String[] args) {
		Person p1 = new Person(1, 22, "Puja", "Female");
		Person p2 = new Person(2, 24, "Hamza", "Male");
		Person p3 = new Person(3, 10, "Sona", "Female");
		Person p4 = new Person(4, 13, "Ajay", "Male");
		
		List<Person> listPerson = new ArrayList<>();
		listPerson.add(p4);
		listPerson.add(p3);
		listPerson.add(p2);
		listPerson.add(p1);
		
		List<Person> female = listPerson.stream().filter(person-> person.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
		//List<Person> sorted = listPerson.stream().sorted(Comparator.comparing(Person:: getAge));
		
		//sortedByAge=list.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		
	}

}

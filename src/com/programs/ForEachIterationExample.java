package com.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import com.entities.Person;

public class ForEachIterationExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Rahul", "Kumar", 29),
				new Person("Krishna", "Kumar", 28),
				new Person("Aparna", "Kumari", 3)
				);
		
		Collections.sort(people, ( o1,  o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
		
		
		System.out.println("Print people whose name starts with A..");
		//printConditionally(people, (p) -> System.out.println(p));
		
		people.forEach(p -> System.out.println(p));
				
	}

	private static void printConditionally(List<Person> people, Consumer<Person> person) {
		for(Person p: people) {
			person.accept(p);
		}
	}

	

}
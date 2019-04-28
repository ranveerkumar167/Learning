package com.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.entities.Person;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Rahul", "Kumar", 29),
				new Person("Krishna", "Kumar", 28),
				new Person("Aparna", "Kumari", 3)
				);
		
		Collections.sort(people, ( o1,  o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
		
		System.out.println("Print all people.");
		printAllPeopleDetails(people);
		
		System.out.println("Print people whose name starts with A..");
		printConditionally(people, (p) -> p.getFirstName().startsWith("A"));
		
		System.out.println("Print people whose name starts with R..");
		printConditionally(people, (p) -> p.getFirstName().startsWith("R"));
		
		System.out.println("Print people whose name starts with K..");
		printConditionally(people, (p) -> p.getFirstName().startsWith("K"));
				
	}

	private static void printConditionally(List<Person> people, Condition c) {
		for(Person p: people) {
			if(c.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAllPeopleDetails(List<Person> people) {
		for(Person p : people) {
			System.out.print(p.toString());
		}
		
	}

}

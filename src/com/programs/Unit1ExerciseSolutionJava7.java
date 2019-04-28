package com.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.entities.Person;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Rahul", "Kumar", 29),
				new Person("Krishna", "Kumar", 28),
				new Person("Aparna", "Kumari", 3)
				);
		
		Collections.sort(people);
		
		System.out.println("Print all people.");
		printAllPeopleDetails(people);
		
		System.out.println("Print people whose name starts with A..");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				
				return p.getFirstName().startsWith("A");
			}
			
			
		});
		
		System.out.println("Print people whose name starts with R..");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("R");
			}
		});
		
		System.out.println("Print people whose name starts with K..");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("K");
			}
		});
				
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

interface Condition{
	boolean test(Person p);
}
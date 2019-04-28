package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.entities.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		
		List<Person> group1 = Arrays.asList(
				new Person("Charles", "Dickens", 60)
				,new Person("Lewis", "Caroll", 30)
				,new Person("Thomas", "Haus", 50)
				,new Person("Sachin", "Tendulkar", 40)
				,new Person("Rahul", "Drawid", 50) 
				);
		
		List<Person> group2 = Arrays.asList(
				new Person("Tom", "Hanks", 50)
				,new Person("Jack", "Marley", 30)
				,new Person("Scarlett", "Johansson", 50)
				,new Person("Kate", "Winslet", 40)
				);
		
		
		//1. Checks if all elements matches a given predicate
		boolean b = group1.stream().allMatch(p -> p.getFirstName().length()> 0);
		System.out.println("All match: "+b);
		
		//2. Any match check
		boolean c = group2.stream().anyMatch(p -> p.getAge()> 40);
		
		System.out.println("Any match:" + c);
		
		Stream<Person> stream1 = group1.stream();
		Stream<Person> stream2 = group2.stream();
		
		Stream<Person> stream3 = Stream.concat(stream1, stream2);
		stream3.forEach(p -> System.out.println(p.getFirstName()));
		
		System.out.println("Count is : " + group1.stream().count());
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
		
		intList.stream()
		.peek(p -> System.out.println("into 2 : " + p * 3))
		.forEach(p -> System.out.println("for each: " + p));
		
		System.out.println("end output");
		//3, 6, 9, 12, 15, 18 
		//6, 12, 18
		intList.stream()
		.map(p -> p * 3)
		.filter(p -> p % 2 ==0)
		.forEach(p -> System.out.println("Output is: " + p));
		
	}

}

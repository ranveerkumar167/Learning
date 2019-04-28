package com.programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import com.entities.Person;

public class _01WritePerson {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Rahul", "Kumar", 29),
				new Person("Krishna", "Kumar", 28),
				new Person("Aparna", "Kumari", 3)
				);
		
		System.out.println(Person.noOfPeople);
		
		try {
			FileOutputStream fo = new FileOutputStream("_01Person.txt");
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(people);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

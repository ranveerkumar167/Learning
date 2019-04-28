package com.programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.entities.Person;

public class _01ReadPerson {

	public static void main(String[] args) {

		try {
			FileInputStream fo = new FileInputStream("_01Person.txt");
			ObjectInputStream os = new ObjectInputStream(fo);
			List<Person> people =  (List<Person>) os.readObject();
			System.out.println(people.toString());
			System.out.println(Person.noOfPeople);
			os.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

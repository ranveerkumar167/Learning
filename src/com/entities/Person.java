package com.entities;

import java.io.Serializable;

public class Person implements Serializable, Comparable<Person>{
	
	public static int noOfPeople;

	private String firstName;
	private String lastName;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		noOfPeople++;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]\n";
	}
	
	public int getNoOfPeople() {
		return noOfPeople;
	}
	@Override
	public int compareTo(Person p) {
		return this.firstName.compareTo(p.getFirstName());
	}
	
}

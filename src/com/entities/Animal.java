package com.entities;

public abstract class Animal {

	private Integer age;
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Animal() {
		System.out.println("Animal class instantiated");
	}
	
	public void eats() {
		System.out.println("Animal eating");
	}
}

package com.entities;

public class Carnivores extends Animal {
	public Carnivores() {
		System.out.println("Carnivores instantiated");
	}
	
	public void eats() {
		System.out.println("Eats other animals!");
	}
}

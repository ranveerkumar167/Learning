package com.entities;

public abstract class Herbivores extends Animal {

	public Herbivores() {
		System.out.println("Herbivores instantiated");
	}
	
	public void eats() {
		System.out.println("Eats grass!");
	}
}

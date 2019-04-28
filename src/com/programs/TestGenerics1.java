package com.programs;

import com.entities.Animal;
import com.entities.Cat;
import com.entities.Dog;

public class TestGenerics1 {
	
	public static void main(String[] args) {
		new TestGenerics1().go();
	}

	private void go() {
		Animal[] animals = {new Cat(), new Dog(), new Cat()};
		Dog[] dogs = {new Dog(), new Dog(), new Dog()};
		takeAnimals(animals);
		takeAnimals(dogs);
	}

	private void takeAnimals(Animal[] animals) {
		for(Animal animal: animals) {
			animal.eats();
		}
	}

}

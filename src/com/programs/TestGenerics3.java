package com.programs;

import java.util.ArrayList;

import com.entities.Animal;
import com.entities.Cat;
import com.entities.Dog;

public class TestGenerics3 {
	
	public static void main(String[] args) {
		new TestGenerics3().go();
	}

	private void go() {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		
		takeAnimals(animals);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		takeAnimals(dogs);
		
		
		ArrayList<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		cats.add(new Cat());
		
		takeAnimals(cats);
	}

	private <T extends Animal> void takeAnimals(ArrayList<T> animals) {
		for(Animal animal: animals) {
			animal.eats();
			if (animal instanceof Dog) {
				Dog dog = (Dog) animal;
				dog.bark();
			} else if (animal instanceof Cat) {
				Cat cat = (Cat) animal;
				cat.meow();
			}
		}
	}

}

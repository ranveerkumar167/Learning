package com.programs;

import java.util.ArrayList;

import com.entities.Animal;
import com.entities.Cat;
import com.entities.Dog;

public class TestGenerics2 {
	
	public static void main(String[] args) {
		new TestGenerics2().go();
	}

	private void go() {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		
		takeAnimals(animals);
	}

	private void takeAnimals(ArrayList<Animal> animals) {
		for(Animal animal: animals) {
			animal.eats();
		}
	}

}

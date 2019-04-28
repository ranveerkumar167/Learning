package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.entities.Deer;

public class TestAnimal {

	public static void main(String[] args) {
		Deer deer = new Deer(10, "deer1");
		Deer deer1 = new Deer(9, "deer1");
		
		deer.eats();
		
		List<Deer> flockOfDeers = new ArrayList<Deer>();
		
		flockOfDeers.add(deer);
		flockOfDeers.add(deer1);
		
		System.out.println(deer.getAge());
		System.out.println(deer1.getAge());
		
		System.out.println( deer == deer1);
		
		System.out.println( deer.equals(deer1));
		
		Collections.sort(flockOfDeers);
		
		System.out.println(flockOfDeers);
		
		Set<Deer> setofDeers = new HashSet<Deer>();
		
		setofDeers.addAll(flockOfDeers);
		
		System.out.println(setofDeers);
	}

}

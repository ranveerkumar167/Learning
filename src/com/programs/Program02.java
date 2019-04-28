package com.programs;

import com.entities.ClassA;

public class Program02 {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		System.out.println(classA.toString());
		System.out.println(ClassA.sum(4, 5));
		
		System.out.println( String.format("This is %,.3f", 1000000.34342) );
	}
}

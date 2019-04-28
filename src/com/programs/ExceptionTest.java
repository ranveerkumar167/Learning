package com.programs;

import java.util.function.BiConsumer;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int[] someNumber = {1,2,3,4,5};
		int key = 2;
		
		calculate(someNumber, key,(k, v) -> System.out.println(k * v));

	}

	private static void calculate(int[] someNumber, int key, BiConsumer<Integer, Integer> biConsumer) {
		for(int i : someNumber) {
			biConsumer.accept(i, key);
		}
		
	}

}

package com.programs;

public class Greeter {

	public static void main(String[] args) {
		Greeting myLambda = () -> System.out.println("Hello Lambda World..!");
		greet( myLambda);
		myLambda.perform();
	}

	private static void greet(Greeting g) {
		g.perform();
		System.out.println("Hello World!");
	}

}

interface Greeting{
	void perform();
}
package com.programs;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				printMessage();
				
			}
		});
		
		thread.run();
		
		Thread thread2 = new Thread(() -> printMessage()) ;
		
		thread2.run();

	}
	
	public static void printMessage() {
		System.out.println("Hello World!");
	}

}

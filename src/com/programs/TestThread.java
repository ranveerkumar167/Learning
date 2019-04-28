package com.programs;

import com.entities.MyRunnable;

public class TestThread {

	public static void main(String[] args) {

		Runnable runnable = new MyRunnable();
		
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("Back in main");
	}

}

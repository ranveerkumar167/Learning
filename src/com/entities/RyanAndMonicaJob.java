package com.entities;

public class RyanAndMonicaJob implements Runnable {

	private BankAccount account = new BankAccount();
	
	public static void main(String[] args) {
		RyanAndMonicaJob andMonicaJob = new RyanAndMonicaJob();
		
		Thread one = new Thread(andMonicaJob);
		Thread two = new Thread(andMonicaJob);
		one.setName("Ryan");
		two.setName("Monica");
		one.start();
		two.start();
	}
	
	@Override
	public void run() {
	for (int i = 0; i <6; i++) {
		makeWithdrawl(10);
		if(account.getBalance()<0) {
			System.out.println("Overdrawn!");
		}
	}	
		
	}

	private  void makeWithdrawl(int amount) {
		if(account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			System.out.println(Thread.currentThread().getName() + " is going to sleep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " woke up");
			try {
				account.withdraw(amount);
			} catch (BalanceLessExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				System.out.println(e.getMessage());
			}
			System.out.println("Remaining balance " + account.getBalance());
			System.out.println(Thread.currentThread().getName() + " completes withdrawl of " + amount);
		}else {
			System.out.println("Not enough for " + Thread.currentThread().getName() );
		}
	}

}

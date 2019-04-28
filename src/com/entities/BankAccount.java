package com.entities;

public class BankAccount {
	
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) throws  BalanceLessExceptions{
		if(amount < 10000) {
			throw new BalanceLessExceptions("Balance is less than 10000");
		}else {
			balance = balance - amount;
		}
		
	}

}

package com.javaproblem.savingaccount;

public class SavingAccount {
	double balance , interest;

	public SavingAccount(double balanceInput, double interestInput) {
		
		this.balance = balanceInput;
		this.interest = interestInput;
	}
	
	public void balanceCheck() {
		System.out.println("=========================================");
		System.out.println("Balance : " + this.balance);
		System.out.println("=========================================");
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Yeahh ! Amount deposited successfully.");
	}
	
	public void withdraw(double amount) {
		if(amount <= this.balance) {
			this.balance -= amount;
			System.out.println("Yeahh ! Amount withdrawal successfully.");
		}else {
			System.out.println("\nOPPS ! Low Balance. Can't Withdraw.");
		}
	}
	
}

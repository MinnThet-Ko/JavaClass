package com.day1;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
		System.out.println("Initial balance: $" + this.balance);
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		System.out.println("Depositing: $" + amount);
		this.balance += amount;
		System.out.println("New balance: $" + this.balance);
	}

	public void withdrawal(double amount) {
		System.out.println("Withdrawal: $" + amount);
		this.balance -= amount;
		System.out.println("New balance: $" + this.balance);
	}
}

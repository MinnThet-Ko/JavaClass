package com.day1;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(1000.00);
		bankAccount.deposit(500);
		bankAccount.withdrawal(200);
	}
}

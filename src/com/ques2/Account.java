package com.ques2;

public class Account {
	private Owner owner;
	private float balance;
	private String number;

	public Account() {
	}

	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}

	public Account(Account acc) {
		this.balance = acc.balance;
		this.number = acc.number;
		Date dob = new Date(acc.owner.getDateOfBirth().getDate(), acc.owner.getDateOfBirth().getMonth(),
				acc.owner.getDateOfBirth().getYear());
		this.owner = new Owner(acc.owner.getName(), acc.owner.getNic(), dob);

	}

	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}

	public void print() {
		System.out.println("Owner:"+owner);
		System.out.println("Balance:"+balance);
		System.out.println("Number:"+ number);
	}

	public float getBalance() {
		return balance;
	}

	public void deposit(float amount) {
		balance+=amount;
	}

	public void withdraw(float amount) {
		balance-=amount;
	}

}
package com.ques2;

public class SavingAccount extends Account {
	private float interestRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(Owner owner, float balance, String number, float interestRate) {
		super(owner, balance, number);
		this.interestRate = interestRate;
	}

	public SavingAccount(SavingAccount acc) {
		super(acc);
		this.interestRate = acc.interestRate;
	}

	public float getInterestRate() {
		return interestRate;
	}

//	@Override
//	public String toString() {
//		return "SavingAccount [interestRate=" + interestRate + ", toString()=" + super.toString() + "]";
//	}
	
	public void print() {
		super.print();
		System.out.println("Interest Rate="+ interestRate);
		
	}


}
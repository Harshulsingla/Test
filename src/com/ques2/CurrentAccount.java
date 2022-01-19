package com.ques2;

public class CurrentAccount extends Account {
	private float minBalance;

	public CurrentAccount() {
		super();
// TODO Auto-generated constructor stub
	}

	public CurrentAccount(CurrentAccount account) {
		super(account);
		this.minBalance = account.minBalance;
	}

	public CurrentAccount(Owner owner, float balance, String number, float minBalance) {
		super(owner, balance, number);
		this.minBalance = minBalance;
	}

//	@Override
//	public String toString() {
//		return "CurrentAccount [minBalance=" + minBalance + ", toString()=" + super.toString() + "]";
//	}
	
	public void print() {
		super.print();
		System.out.println("MinBalance:"+minBalance);
		
	}

	public float getCharges() {
		final int i=5;
		return i;
	}

}

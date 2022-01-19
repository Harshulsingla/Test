package com.ques2;

public class AccountApp {
	public static void main(String[] args) {
		
		Date date=new Date(15,12,2022);
		Owner owner=new Owner("Harshul","15674",date);
		
		SavingAccount account1=new SavingAccount(owner,7654.0f,"576489", 4.0f);
		account1.print();
		System.out.println("------------------------------------");
		CurrentAccount account2=new CurrentAccount(owner,1550,"01234567",50000);
		account2.print();
		
		}
	
}

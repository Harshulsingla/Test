package com.ques2;

public class Owner {
	private String name;
	private Date dateOfBirth;
	private String aadhar;

	public Owner() {
	}

	public Owner(String name, String nic, Date dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.aadhar = nic;
	}

	Owner(Owner o1) {
		this.name = o1.name;
		this.dateOfBirth = new Date(o1.dateOfBirth.getDate(), o1.dateOfBirth.getMonth(), o1.dateOfBirth.getYear());
		this.aadhar = o1.aadhar;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", DateOfBirth=" + dateOfBirth + ", Aadhar=" + aadhar;
	}

	public void print() {
		System.out.println("Name:"+name);
		System.out.println("DateOfBirth:"+dateOfBirth);
		System.out.println("Aadhar:"+ aadhar);
	}

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getNic() {
		return aadhar;
	}

}


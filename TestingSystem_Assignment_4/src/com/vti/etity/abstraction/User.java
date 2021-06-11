package com.vti.etity.abstraction;

public abstract class User {
	private String name;
	
	protected void name() {
		
	}
	Double salaryRatio;
	
	
	public User(String name, double salaryRatio) {
		super();
		this.name = name;
		this.salaryRatio = salaryRatio;
	}	
	
	public abstract Double calculatePay();

	public void displayInfor() {
		System.out.println("Name" + name);
		System.out.println("Radio Salary" + salaryRatio);
		System.out.println("Lương chi trả" + calculatePay());
	}
	
}

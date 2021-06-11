package com.vti.etity.abstraction;

public class Employee extends User{

	
	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
		

	}

	@Override
	public Double calculatePay() {
		// TODO Auto-generated method stub
		return salaryRatio * 420;
	}
}
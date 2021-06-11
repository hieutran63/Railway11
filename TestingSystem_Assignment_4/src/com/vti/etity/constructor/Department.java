package com.vti.etity.constructor;

public class Department {
	private int 	id;
	private String  name;
	
	public Department(){
		
	}

	public Department(String name) {
		super();
		this.name = name;
		this.id = 0;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

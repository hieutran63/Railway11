package com.vti.etity.polymorphism;

public class Student implements IStudent{
	int id;
	String name;
	public int group;
	
	public Student() {
		
	}
	
	public Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	@Override
	public void diemDanh() {
		System.out.println(name + "điểm danh");
	}

	@Override
	public void hocBai() {
		System.out.println(name + "đang học bài");
	}

	@Override
	public void donVeSinh() {
		System.out.println(name + "đi dọn vệ sinh");	
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name= " + name + ", group=" + group + "]";
	}
	
}

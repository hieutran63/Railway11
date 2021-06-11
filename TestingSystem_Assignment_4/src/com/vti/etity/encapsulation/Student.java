package com.vti.etity.encapsulation;

public class Student {
	private int id;
	private String name;
	private String homeTown;
	private float diem;
	
	//Câu b
	public Student(String name, String homeTown) {
		super();
		this.name = name;
		this.homeTown = homeTown;
		this.diem = (float) 0;	
	}

	//Câu c
	public float getDiem() {
		return diem;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}
	
	//Câu d
	public void congDiem(float diemCong) {
		this.diem = diem + diemCong;
	}

	//Câu e
	@Override
	public String toString() {
		String diemhocluc = "";
		
		if(diem < 4) {
			diemhocluc = "Yếu";
		}else if(diem >= 4 && diem < 6) {
			diemhocluc = "Trung Binh";
		}else if(diem >= 6 && diem < 8) {
			diemhocluc = "Khá";
		}else {
			diemhocluc = "Giỏi";
		}
		return "Student [name=" + name + ", diemhocluc=" + diemhocluc + "]";
	}

}
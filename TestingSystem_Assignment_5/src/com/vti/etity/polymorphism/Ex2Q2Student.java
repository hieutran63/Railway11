package com.vti.etity.polymorphism;

import java.util.Scanner;

public class Ex2Q2Student extends Person{
	int maSV;
	int diemTB;
	String email;
	
	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public int getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(int diemTB) {
		this.diemTB = diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin Student");
		super.inputInfo();
		System.out.println("Mã SV: ");
		this.maSV = scanner.nextInt();
		System.out.println("Điểm TB: ");
		this.diemTB = scanner.nextInt();
		System.out.println("Email: ");
		this.email = scanner.next();
	}

	@Override
	public String showInfo() {
		
		return super.showInfo() +"\nEx2Q2Student [maSV = " + maSV + ", diemTB = " + diemTB + ", email = " + email + "]";
	}
	
	public boolean Schoolarship() {
		return diemTB > 8.0 ? true : false;
	}
}

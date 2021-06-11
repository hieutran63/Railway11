package com.vti.etity.polymorphism;

import java.util.Scanner;

public class Person {
	String name;
	String gioiTinh;
	String ngaySinh;
	String diaChi;
	
	public Person() {
		super();
	}
	
	public Person(String name, String gioiTinh, String ngaySinh, String diaChi) {
		super();
		this.name = name;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin Person: ");
		System.out.println("Name: " );
		this.name = scanner.nextLine();
		System.out.println("Giới tính: " );
		this.gioiTinh = scanner.nextLine();
		System.out.println("Ngày sinh: " );
		this.ngaySinh = scanner.nextLine();
		System.out.println("Địa chỉ: ");
		this.diaChi = scanner.nextLine();
	}
	
	public String showInfo() {
		return "Person [name = " + name + ", gioiTinh = " + gioiTinh + ", ngaySinh = " + ngaySinh + ", diaChi = " + diaChi
				+ "]";
	}
	
	
	

	
	
}

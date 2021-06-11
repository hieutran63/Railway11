package com.vti.etity.inheritance;

import java.util.Scanner;

public class NhanVien extends CanBo {
	String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public NhanVien() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập Công Việc: ");
		congViec = scanner.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNhanVien [congViec = " + congViec + "]";
	}
	
	
}

package com.vti.etity.polymorphism;

public class HinhChuNhat {
	float a;
	float b;
	
	public float tinhChuvi(float a, float b) {
		System.out.println("Chu vi hình chữ nhật: ");
		return (a + b) * 2;
	}
	
	public float tinhDienTich(float a, float b) {
		System.out.println("Diện tích hình chữ nhật: ");
		return a * b;
	}
	
	
}

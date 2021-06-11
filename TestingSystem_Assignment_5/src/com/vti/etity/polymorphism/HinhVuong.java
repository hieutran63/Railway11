package com.vti.etity.polymorphism;

public class HinhVuong extends HinhChuNhat{

//	@Override
//	public float tinhChuvi(float a, float b) {
//		System.out.println("Chu vi hình vuông: ");
//		return super.tinhChuvi(a, b);
//	}
//	
//	@Override // có cùng tham số
//	public float tinhDienTich(float a, float b) {
//		System.out.println("Chu vi hình vuông: ");
//		return super.tinhDienTich(a, b);
//	}
	
	
	//(cách khác) dùng 1 float a
	public float tinhChuvi(float a) {
		System.out.println("Chu vi hình vuông: ");
		return this.tinhChuvi(a, a);
	}
	
	public float tinhDienTich(float a) {
		System.out.println("Diện tích hình vuông: ");
		return this.tinhDienTich(a, a);
	}
}

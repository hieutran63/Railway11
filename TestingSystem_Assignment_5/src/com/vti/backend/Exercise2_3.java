package com.vti.backend;

import com.vti.etity.polymorphism.HinhChuNhat;
import com.vti.etity.polymorphism.HinhVuong;

public class Exercise2_3 {
	public void question3() {
		HinhChuNhat hcn = new HinhChuNhat();
		float c = hcn.tinhChuvi(3, 4);
		System.out.println(c);
		float d = hcn.tinhDienTich(3, 4);
		System.out.println(d);
		
		HinhVuong hv = new HinhVuong();
		float e = hv.tinhChuvi(5);
		System.out.println(e);
		float f = hv.tinhDienTich(5);
		System.out.println(f);
	}
}

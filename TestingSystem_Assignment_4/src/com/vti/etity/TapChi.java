package com.vti.etity;

import java.util.Scanner;

public class TapChi extends TaiLieu{
	int soPhatHanh;
	int thangPhatHanh;
	
	
	public int getSoPhatHanh() {
		return soPhatHanh;
	}


	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}


	public int getThangPhatHanh() {
		return thangPhatHanh;
	}


	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}


	public TapChi() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập số phát hành: ");
		soBanPhatHanh = scanner.nextInt();
	}


	@Override
	public String toString() {
		return super.toString() + "\nTapChi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + "]";
	}

	
}

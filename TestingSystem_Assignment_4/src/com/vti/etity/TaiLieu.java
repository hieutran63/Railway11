package com.vti.etity;

import java.util.Scanner;

public class TaiLieu {
	int maTaiLieu;
	String tenNXB;
	int soBanPhatHanh;
	
	
	public int getMaTaiLieu() {
		return maTaiLieu;
	}


	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}


	public TaiLieu(int maTaiLieu, String tenNXB, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNXB = tenNXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}


	public TaiLieu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mời bạn nhập mã tài liệu: ");
		maTaiLieu = scanner.nextInt();
		System.out.println("Mời bạn nhập tên nhà xuất bản: ");
		tenNXB = scanner.next();
		System.out.println("Mời bạn nhập số bản phát hành: ");
		soBanPhatHanh = scanner.nextInt();
	}


	@Override
	public String toString() {
		return "TaiLieu [maTaiLieu=" + maTaiLieu + ", tenNXB=" + tenNXB + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}
	
	
}

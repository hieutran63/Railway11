package com.vti.etity.inheritance;

import java.util.Scanner;

import com.vti.etity.constructor.Gender;

public class CongNhan extends CanBo{
	int bac;

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	public CongNhan() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào Bậc");
		bac = scanner.nextInt();
	}
	
	
	public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.bac = bac;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCongNhan [bac=" + bac + "]";
	}
	
	
}

package com.vti.etity.inheritance;

import java.util.Scanner;

import com.vti.etity.constructor.Gender;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;
	

	public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public int getTuoi() {
		return tuoi;
	}


	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	
	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public CanBo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mời bạn nhập vào họ và tên: ");
		hoTen = scanner.nextLine();
		System.out.println("Mời bạn nhập vào tuổi: ");
		tuoi = scanner.nextInt();
		System.out.println("Mời bạn nhập vào giới tính(0: NAM, 1: NỮ, 2: KHÁC)");
		gioiTinh = scanner.next();
//		Gender loaiGioiTinh = null;
//		switch (gioiTinh) {
//		case 1:
//			loaiGioiTinh = Gender.NAM;
//			break;
//		case 2:
//			loaiGioiTinh = Gender.NỮ;
//			break;
//		case 3:
//			loaiGioiTinh = Gender.KHÁC;
//			break;
//		}
		System.out.println("Mời bạn nhập vào địa chỉ: ");
		diaChi = scanner.next();
		
	}

	@Override
	public String toString() {
		return "CanBo [hoTen = " + hoTen + ", tuoi = " + tuoi + ", gioiTinh = " + gioiTinh + ", diaChi = " + diaChi + "]";
	}
	
	
	
}

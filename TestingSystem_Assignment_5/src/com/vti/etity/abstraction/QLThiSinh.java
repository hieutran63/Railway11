package com.vti.etity.abstraction;

public class QLThiSinh {
	int soBaoDanh;
	String hoTen;
	String diaChi;
	int mucUuTien;
	
	KhoiThi khoiThi;

	public int getSoBaoDanh() {
		return soBaoDanh;
	}

	public QLThiSinh(String hoTen, String diaChi, int mucUuTien, KhoiThi khoiThi) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.khoiThi = khoiThi;
	}

	@Override
	public String toString() {
		return "QLThiSinh [soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien="
				+ mucUuTien + ", khoiThi=" + khoiThi.getSubject() + "]";
	}
	
	
}

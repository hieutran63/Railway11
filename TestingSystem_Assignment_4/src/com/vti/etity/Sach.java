package com.vti.etity;

import java.util.Scanner;

public class Sach extends TaiLieu{
	String tenTacGia;
	int soTrang;
	
	
	
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	
	public Sach(int maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}
	
	public Sach() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập tên tác giả: ");
		tenTacGia = scanner.next();
		System.out.println("Mời bạn nhập số trang: ");
		soTrang = scanner.nextInt();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSach [tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + "]";
	}
	
	
}

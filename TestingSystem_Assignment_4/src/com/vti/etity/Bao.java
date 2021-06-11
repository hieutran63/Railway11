package com.vti.etity;

import java.time.LocalDate;
import java.util.Scanner;

public class Bao extends TaiLieu{
	int ngayPhatHanh;

		
	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}


	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}


	public Bao(int maTaiLieu, String tenNXB, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}


	public Bao() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập ngày phát hành: ");
		ngayPhatHanh = scanner.nextInt();
	}


	@Override
	public String toString() {
		return super.toString() + "\nBao [ngayPhatHanh=" + ngayPhatHanh + "]";
	}

	
	

	
}

package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.etity.abstraction.ITuyenSinh;
import com.vti.etity.abstraction.QLThiSinh;

public class TuyenSinh implements ITuyenSinh{
	List<QLThiSinh> listQLThiSinh;
	Scanner scanner;
	
	public TuyenSinh() {
		listQLThiSinh = new ArrayList<QLThiSinh>();
		scanner = new Scanner(System.in);
	}
	
	public void addQLThiSinh() {
		System.out.println("Nhập tên thí sinh: ");
		String hoTen = scanner.nextLine();
		System.out.println("Nhập địa chỉ thí sinh: ");
		String diaChi = scanner.nextLine();
		System.out.println("Nhập mục ưu tiên: ");
		int mucUuTien = scanner.nextInt();
		System.out.println("Nhập khối thi: ");
		String khoiThi = scanner.next();
		QLThiSinh qlThiSinh = new QLThiSinh(hoTen, diaChi, mucUuTien, null); 
		listQLThiSinh.add(qlThiSinh);
	}
	
	public void showInfoQLThiSinh() {
		for (QLThiSinh qlThiSinh : listQLThiSinh) {
			System.out.println(qlThiSinh);
		}
	}

	
	public void findBySoBaoDanh(int soBaoDanh) {
		System.out.println("Nhập số báo danh: ");
		
		for (QLThiSinh qlThiSinh : listQLThiSinh) {
			if (qlThiSinh.getSoBaoDanh() == soBaoDanh) {
				System.out.println(qlThiSinh);
			}
		}
		
	}


	
	
}

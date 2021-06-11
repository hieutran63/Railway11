package com.vti.backend;

import java.util.Scanner;

public class Exercise1_2 {
	public void question2() {
		Scanner scanner = new Scanner(System.in);
		TuyenSinh tuyensinh = new TuyenSinh();
		
		System.out.println("Mời bạn nhập vào chức năng mong muốn: ");
		System.out.println("1. Thêm mới thí sinh");
		System.out.println("2. Hiện thị thông tin của thí sinh và khối thi của thí sinh");
		System.out.println("3. Tìm kiếm theo số báo danh ");
		System.out.println("4. Thoát khỏi chương trình.");
	
		while(true) {
			System.out.println("Mời bạn chọn chức năng: ");
			int choose = scanner.nextInt();
			
			switch (choose) {
			case 1:
				tuyensinh.addQLThiSinh();
				break;
			case 2:
				tuyensinh.showInfoQLThiSinh();
				break;
			case 3:
				tuyensinh.findBySoBaoDanh(choose);
				break;
			case 4:
				return;
			default:
				break;
			}
		}
	}

}
	
	
	
	

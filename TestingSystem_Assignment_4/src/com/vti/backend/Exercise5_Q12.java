package com.vti.backend;

import java.util.Scanner;

import com.vti.etity.inheritance.QLCB;

public class Exercise5_Q12 {
	public void question1_2() {
		Scanner scanner = new Scanner(System.in);
		QLCB qlcb = new QLCB();
		
		System.out.println("Mời bạn nhập vào chức năng muốn dùng");	
		System.out.println("1.Thêm mới cán bộ.");
		System.out.println("2.Tìm kiếm theo họ tên.");
		System.out.println("3.Hiện thị thông tin về danh sách các cán bộ.");
		System.out.println("4.Nhập vào tên của cán bộ và delete cán bộ đó.");
		System.out.println("5.Thoát khỏi chương trình.");
		while(true) {
			System.out.println("Mời bạn chọn chức năng");
			int choose = scanner.nextInt();
			
			switch (choose) {
			case 1:
				qlcb.addCanBo();
				break;
			case 2:
				qlcb.findByName();
				break;	
			case 3:
				qlcb.printListCanBo();
				break;
			case 4:
				qlcb.deleteCanBo();
				break;
			case 5:
				return;
	
			default:
				System.out.println("Bạn đã nhập sai. Bạn chỉ được nhập từ 1 đến 5!");
				break;
			}
		}
	}
	
	
}

package com.vti.backend;

import java.util.Scanner;

import com.vti.etity.QLTV;

public class Exercise5_Q4 {
	public void question4() {
		Scanner scanner = new Scanner(System.in);
		QLTV qltv = new QLTV();
		
		System.out.println("Mời bạn nhập vào chức năng muốn dùng");
		System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo");
		System.out.println("2. Xoá tài liệu theo mã tài liệu");
		System.out.println("3. Hiện thị thông tin về tài liệu.");
		System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
		System.out.println("5. Thoát khỏi chương trình.");
	while(true) {
		System.out.println("Mời bạn nhập chức năng");
		int choose = scanner.nextInt();
		
		switch (choose) {
		case 1:
			qltv.addTaiLieu();
			break;
		case 2:
			qltv.deleteMaTaiLieu();		
			break;
		case 3:
			qltv.printListTaiLieu();
			break;
		case 4:
			qltv.findByCatergory();
			break;
		case 5:
			return;
		default:
			System.out.println("Bạn đã nhập sai. Bạn chỉ nhập từ 1 đến 5");
			break;
		}
	}
	}
}

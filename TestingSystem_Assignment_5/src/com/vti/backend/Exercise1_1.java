package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.etity.abstraction.News;

public class Exercise1_1 {
	public void question1() {
		Scanner scanner = new Scanner(System.in);
		MyNews mynews = new MyNews();
		
		System.out.println("Mời bạn nhập vào chức năng muốn dùng: ");
		System.out.println("1. Insert news ");
		System.out.println("2. View list news");
		System.out.println("3. Average rate");
		System.out.println("4. Exit");
		
		while(true) {
			System.out.println("Mời bạn chọn chức năng: ");
			int choose = scanner.nextInt();
			
			switch (choose) {
			case 1:
				mynews.insertNews();
				break;
			case 2:
				mynews.viewListNews();
				break;
			case 3:
				mynews.averageRate();
				break;
			case 4:
				return;
			default:
				System.out.println("Bạn đã nhập sai. Bạn chỉ được nhập từ 1 đến 4!");
				break;
			}
		}
	}
}

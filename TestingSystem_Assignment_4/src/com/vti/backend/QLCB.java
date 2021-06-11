package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.etity.inheritance.CanBo;

public class QLCB {
	List<CanBo> dsCanBo = new ArrayList<CanBo>();  
	//mảng dsCanBo" lưu trữ những cán bộ được tạo ra
	
	//Thêm mới cán bộ
	public void addNewCanBo(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cán bộ: ");
		String name = scanner.nextLine();
		
		CanBo canbo1 = new CanBo(name,0, "", "");
		dsCanBo.add(canbo1);
		//add của ArrayList: dùng để thêm mới phần tử
	}
	
	//Tìm kiếm họ tên cán bộ
	public void searchByName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cán bộ muốn tìm: ");
		String name = scanner.nextLine();
		
		for (CanBo canBo : dsCanBo) {
			//indexOf: so sánh chuỗi, nếu chuỗi 1 chứa chuỗi con
			//Thì trả về 1 giá trị >= 0, nếu ko chứa trả về -1
			//toLowerCase: viết thường
			if(canBo.getHoTen().toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				System.out.println(canBo);
			}
				
		}
	}
	
	//Hiện thị thông tin về danh sách các cán bộ
	public void showInfoDsCanBo() {
		for (CanBo canBo : dsCanBo) {
			System.out.println(canBo);
		}
	}
	
	//Nhập tên cán bộ và xóa nó đi
	public void deleteByName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cán bộ muốn xóa: ");
		String name = scanner.nextLine();
		
		for (int i = 0; i < dsCanBo.size(); i++) {      //size(): động
			if(dsCanBo.get(i).getHoTen().toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				dsCanBo.remove(i);
				i = i - 1;
			}
		}
		System.out.println(dsCanBo);
	}
	
}

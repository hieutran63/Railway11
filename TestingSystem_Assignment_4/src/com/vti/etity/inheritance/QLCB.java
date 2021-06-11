package com.vti.etity.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
	
	private List<CanBo> canBos;
	private Scanner scanner;
	
	public QLCB() {
		canBos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void addCanBo() {
		System.out.println("Bạn muốn thêm bao nhiên cán bộ: ");
		int x = scanner.nextInt();
			for (int i = 0; i < x; i++) {
				System.out.println("Bạn muốn nhập vào công nhân (nhập 1),"
						+ "Kỹ sư (nhập 2), Nhân viên (nhập 3)");
				int choose = scanner.nextInt();
				switch (choose) {
				case 1:
					canBos.add(new CongNhan());
					break;
				case 2:
					canBos.add(new KySu());
					break;
				case 3:
					canBos.add(new NhanVien());
					break;
				}	
				System.out.println("Nhập thành công cán bộ " + (i + 1));
				
			}
		System.out.println("addCanBo");
	}
	
	public void findByName() {
		System.out.println("Nhập vào tên muốn tìm kiếm: ");
		String findByName = scanner.next();
		for (CanBo canBo : canBos) {
			if(canBo.getHoTen().equals(findByName)) {
				System.out.println(canBo);
			}
		}
		
	}
	
	public void printListCanBo() {
		for (CanBo canBo : canBos) {
			System.out.println(canBo);
		}
			
		System.out.println("---------------------");
	}
	
	public void deleteCanBo(String inputName) {
		System.out.println("Nhập tên cần xóa thông tin" );
		String delName = scanner.next();
		canBos.removeIf(CanBo -> CanBo.getHoTen().equals(delName));
		printListCanBo();
		System.out.println("Bạn đã xóa thành công!");
	}
	
	public void deleteCanBo() {
		String inputName = scanner.nextLine();
		deleteCanBo(inputName);
	}
	
}

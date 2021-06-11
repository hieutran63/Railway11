package com.vti.etity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTV {
	private List<TaiLieu> taiLieus;
	private Scanner scanner;

	public QLTV() {
		taiLieus = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	public void addTaiLieu() {
		System.out.println("Bạn muốn thêm bao nhiêu tài liệu: ");
		int x = scanner.nextInt();
			for (int i = 0; i < x; i++) {
				System.out.println("Bạn muốn thêm tài liệu vào Sách (nhập 1)"
						+ "Tạp chí (nhập 2), Báo (nhập 3)");
				int choose = scanner.nextInt();
				switch (choose) {
				case 1:
					taiLieus.add(new Sach());
					break;
				case 2:
					taiLieus.add(new TapChi());
					break;
				case 3:
					taiLieus.add(new Bao());
					break;
				default:
					break;
				}
				System.out.println("Thêm mới thành công" + (i + 1));
			}
				
		}
	
	public void deleteMaTaiLieu() {
		System.out.println("Nhập mã tài liệu cần xóa: ");
		String delMa = scanner.nextLine();
		for (int i = 0; i < taiLieus.size(); i++) {
			if(taiLieus.get(i).equals(delMa));
				taiLieus.remove(i);
		}
		printListTaiLieu();
		System.out.println("Bạn đã xóa thành công!");
	}
	
	public void printListTaiLieu() {
		for (TaiLieu taiLieu : taiLieus) {
			System.out.println(taiLieu);
		}
	}
	
	public void findByCatergory() {
		
	}
}
	
		


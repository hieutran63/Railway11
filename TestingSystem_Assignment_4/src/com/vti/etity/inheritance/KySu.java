package com.vti.etity.inheritance;

import java.util.Scanner;

import com.vti.etity.constructor.Gender;

public class KySu extends CanBo{
	String nganhDaoTao;

	
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	public KySu() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập ngành Đào Tạo");
		nganhDaoTao = scanner.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nKySu [nganhDaoTao = " + nganhDaoTao + "]";
	}

	

	

	
	
	
	
	
}

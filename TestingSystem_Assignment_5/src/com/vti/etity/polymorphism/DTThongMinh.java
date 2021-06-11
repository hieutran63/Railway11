package com.vti.etity.polymorphism;

public class DTThongMinh extends DTDiDong{
	
	public void suDung3G() {
		System.out.println("Sử dụng 3G .....");
	}
	
	public void chupHinh() {
		System.out.println("Chụp hình .....");
	}
	
	
	@Override
	public void tanCong() {
		System.out.println("Rơi là vỡ .....");
	}
}

package com.vti.etity.polymorphism;

public abstract class DTDiDong implements IVuKhi{
	
	public void nghe() {
		System.out.println("Đang nghe ...");
	}
	
	public void goi() {
		System.out.println("Đang gọi ...");
	}
	
	public void guiTinNhan() {
		System.out.println("Đang gửi tin nhắn ...");
	}
	
	public void nhanTinNhan() {
		System.out.println("Đang nhận tin nhắn ...");
	}

	
}

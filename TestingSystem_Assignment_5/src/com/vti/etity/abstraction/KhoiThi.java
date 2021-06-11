package com.vti.etity.abstraction;

public class KhoiThi {
	String name;
	String subject;
	
	public KhoiThi(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		switch (subject) {
		case "A":
			subject = "Toán, Lý, Hóa";
			break;
		case "B":
			subject = "Toán, Hóa, Sinh";
			break;
		case "C":
			subject = "Văn, Sử, Địa";
			break;
		}
		return subject;
	}

	
	
	
}



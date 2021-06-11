package com.vti.backend;

import com.vti.etity.encapsulation.Student;
import com.vti.etity.inheritance.HighSchoolStudent;

public class Excercise4 {
	public void question1() {
		Student student1 = new Student("TTH", "HN");
		System.out.println(student1.getDiem());
				
		student1.setDiem(6.5f);
		System.out.println(student1);
		
		student1.congDiem(2);
		System.out.println(student1);
		
	}
	
	public void question3() {
		HighSchoolStudent highSchoolStudent = new HighSchoolStudent(1, "Nam", "Chuyên Văn", "Đai học Công nghệ");
		System.out.println(highSchoolStudent);
	}
}

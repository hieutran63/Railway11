package com.vti.backend;

import com.vti.etity.polymorphism.Student;

public class Exercise2_1 {
	public void question1() {
		//a) Tạo 10 học sinh, chia thành 3 nhóm 
		Student[] dsStudent = new Student[10];
		
		for (int i = 0; i < dsStudent.length; i++) {
			dsStudent[i] = new Student(i + 1, "Nguyễn Văn A" + (i +1), i%3 + 1);	
		}	
		
		//b) Kêu gọi cả lớp điểm danh.
		for (int i = 0; i < dsStudent.length; i++) {
			dsStudent[i].diemDanh();
		}
		
		//c) Gọi nhóm 1 đi học bài
		for (int i = 0; i < dsStudent.length; i++) {
			if(dsStudent[i].group == 1) dsStudent[i].hocBai();
		}
		
		//d) Gọi nhóm 2 đi dọn vệ sinh
		for (int i = 0; i < dsStudent.length; i++) {
			if(dsStudent[i].group == 2) dsStudent[i].donVeSinh();
		}
		}
}

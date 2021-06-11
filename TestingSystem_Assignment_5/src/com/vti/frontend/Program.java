package com.vti.frontend;

import com.vti.etity.polymorphism.HinhChuNhat;
import com.vti.etity.polymorphism.HinhVuong;
import com.vti.etity.polymorphism.MyMath;
import com.vti.etity.polymorphism.Student;

public class Program {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		students[0] = new Student(1, "Studen1", 1);
		students[1] = new Student(2, "Studen2", 1);
		students[2] = new Student(3, "Studen3", 3);
		students[3] = new Student(4, "Studen4", 2);
		students[4] = new Student(5, "Studen5", 3);
		students[5] = new Student(6, "Studen6", 1);
		students[6] = new Student(7, "Studen7", 2);
		students[7] = new Student(8, "Studen8", 1);
		students[8] = new Student(9, "Studen9", 3);
		students[9] = new Student(10, "Studen10",1);
		
		/*for (Student student : students) {
			student.diemDanh();
		}
		
		for (Student student : students) {
			if(student.getGroup() == 1) {
				student.hocBai();
			}
		}
		
		for (Student student : students) {
			if(student.getGroup() == 2) {
				student.donVeSinh();
			}
		}*/
		
		
	}
}

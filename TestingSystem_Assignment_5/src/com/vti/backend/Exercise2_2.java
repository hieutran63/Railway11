package com.vti.backend;

import java.util.Scanner;

import com.vti.etity.polymorphism.Person;
import com.vti.etity.polymorphism.Student;
import com.vti.etity.polymorphism.Ex2Q2Student;


public class Exercise2_2 {
	public Exercise2_2(){
		Scanner scanner = new Scanner(System.in);
	}
	
	public void question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn chọn chức năng mong muốn: ");
		System.out.println("1. Các thông tin Person");
		System.out.println("2. Các thông tin Student");
		System.out.println("3. Exit");
		while(true) {
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				demoPerson();
				break;
			case 2:
				demoStudent();
				break;
			case 3:
				return;
			default:
				System.out.println("Bạn nhập số sai, mời bạn nhập lại: ");
				break;
			}
		}
		
	}
	
	public void demoPerson() {
		Person person = new Person();
		person.inputInfo();
		System.out.println("Thông tin Person vừa nhập vào: ");
		System.out.println(person.showInfo());
	}
	
	public void demoStudent() {
		Ex2Q2Student student1 = new Ex2Q2Student();
		student1.inputInfo();
		System.out.println("Thông tin Student vừa nhập vào: ");
		System.out.println(student1.showInfo());
		if(student1.Schoolarship()) {
			System.out.println("Sinh viên này đạt học bổng");
		}else {
			System.out.println("Sinh viên này không đạt học bổng");
		}
	}
}

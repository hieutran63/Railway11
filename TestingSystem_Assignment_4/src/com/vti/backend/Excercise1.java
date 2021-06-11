package com.vti.backend;

import java.time.LocalDate;

import com.vti.etity.constructor.Account;
import com.vti.etity.constructor.Department;
import com.vti.etity.constructor.Group;
import com.vti.etity.constructor.Position;
import com.vti.etity.constructor.PositionName;

public class Excercise1 {
	public void question1(){
		Department department1 = new Department();
		System.out.println(department1);
			
		Department department2 = new Department("NVA");
		System.out.println(department2);	
	}
	
	public void question2() {
		Account account1 = new Account();
		System.out.println(account1);
		
		Account account2 = new Account(1, "nva@gmail.com", "NVA");
		System.out.println(account2);
		
		Account account3 = new Account(2, "nvb@gmail.com", "NVB", new Position());
		System.out.println(account3);
		
		Account account4 = new Account(3, "nvc@gmail.com", "NVC", new Position(), LocalDate.of(2021, 3, 18));
		System.out.println(account4);
	}
	
	public void question3() {
		Group group1 = new Group();
		System.out.println(group1);
		
		Group group2 = new Group("Group1", new Account(), LocalDate.now(), new Account[] {});
		System.out.println(group2);

		Group group3 = new Group("Group2", new Account() , LocalDate.now(), new String[] {"Cường","Công"});
		System.out.println(group3);
	}
}


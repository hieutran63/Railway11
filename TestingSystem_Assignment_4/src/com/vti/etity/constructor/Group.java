package com.vti.etity.constructor;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;

public class Group {
	private int 	  id;
	private String    name;
	private Account	  creator;
	private LocalDate createDate;
	
	private Account[] accounts;
	
	public Group(){
		
	}

	public Group(String name, Account creator, LocalDate createDate, Account[] accounts) {
		super();
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}

	public Group(String name, Account creator, LocalDate createDate, String[] usernames) {
		super();
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		//this.accounts = accounts;
		if(usernames != null && usernames.length > 0) {
			//khởi tạo mảng accounts gờm (username.length phần tử)
			Account[] accounts = new Account[usernames.length];
			
			//mỗi 1 username
			for (int i = 0; i < usernames.length; i++) {
				accounts[i] = new Account(0, "", usernames[i]);
			}
			this.accounts = accounts;
		}
	}
	
	
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator + ", createDate=" + createDate
				+ ", accounts=" + Arrays.toString(accounts) + "]";
	}
	 
	
}

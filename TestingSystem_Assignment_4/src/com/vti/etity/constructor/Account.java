package com.vti.etity.constructor;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;


public class Account {
	private int Id;
	private String email;
	private String userName;
	private String fullName;
	private Department department;
	private Position position;
	private LocalDate createDate;

	//Câu a
	public Account() {
		
	}

	//Câu b
	public Account(int id, String email, String fullName) {
		super();
		Id = id;
		this.email = email;
		this.fullName = fullName;
	}

	//Câu c
	public Account(int id, String email, String fullName, Position position) {
		super();
		Id = id;
		this.email = email;
		this.fullName = fullName;
		this.position = position;
		this.createDate = LocalDate.now();
	}


	public Account(int id, String email, String fullName, Position position, LocalDate createDate) {
		super();
		Id = id;
		this.email = email;
		this.fullName = fullName;
		this.position = position;
		this.createDate = createDate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [Id=" + Id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", position=" + position + ", createDate=" + createDate + "]";
	}

	

	
}

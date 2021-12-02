package com.order.entity;
/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;*/

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Data//since we are lombook @data is enough no need getter and setter
@Entity
@Table(name = "USER_TBL")
public class User {
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Id
    private int id;
    private String userName;
    private String password;
    
	public User(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
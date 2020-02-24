package com.engine.foodfunengine.Entity;

import java.math.BigInteger;

public class User {
	private BigInteger id;
	private String user_account;
	private  String user_password;
	private  String user_nickname;
	private BigInteger user_icon;
	private BigInteger user_sort;
	private String user_email;
	private String user_phone;
	private Integer user_admin;
	private Integer state;
	private String mood;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getUser_account() {
		return user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public BigInteger getUser_icon() {
		return user_icon;
	}

	public void setUser_icon(BigInteger user_icon) {
		this.user_icon = user_icon;
	}

	public BigInteger getUser_sort() {
		return user_sort;
	}

	public void setUser_sort(BigInteger user_sort) {
		this.user_sort = user_sort;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public Integer getUser_admin() {
		return user_admin;
	}

	public void setUser_admin(Integer user_admin) {
		this.user_admin = user_admin;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}


}
package com.Mvc2.MvcDemo2.Model;

public class User {
	
	private int userId;
	private String userName;
	
	private String userMail;
	private long contactNo;
	public User() {
		super();
	}
	public User(int userId, String userName, String userMail, long contactNo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
		this.contactNo = contactNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
	

}

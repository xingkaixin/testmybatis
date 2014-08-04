package com.xingkaixin.model;

public class User {
	  private int userId;
	  private String userName;
	  private String passwords;
	  private String comments;
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
	  public String getPasswords() {
	      return passwords;
	  }
	  public void setPasswords(String passwords) {
	      this.passwords = passwords;
	  }
	  public String getComments() {
	      return comments;
	  }
	  public void setComments(String comments) {
	      this.comments = comments;
	  }
	}
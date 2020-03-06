package com.waq.training.user;

import javax.persistence.Entity;
import javax.persistence.Id;

//#1
@Entity
public class UserP {
	String userName, userAddress, userGender;
	
//#2
	@Id
	String userId;
	
	UserP(){
		
	}
	
	public UserP(String userName, String userAddress, String userGender, String userId) {

		this.userName = userName;
		this.userAddress = userAddress;
		this.userGender = userGender;
		this.userId = userId; 
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

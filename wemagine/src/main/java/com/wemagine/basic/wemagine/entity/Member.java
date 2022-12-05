package com.wemagine.basic.wemagine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="member")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bid", unique = true, nullable = false )
	private int bid;
	
	@Column( length = 50, nullable = false )
	private String datetime;
	
	@Column(name = "user_type", length = 30, nullable = false)
	private String userType; 
	
	@Column(name = "user_id", length = 50, nullable = false)
	private String userId;
	
	@Column(name = "user_name", length = 50, nullable = false)
	private String userName;
	
	@Column(name = "user_pwd", length = 255, nullable = false)
	private String userPwd;

	
	
	public int getBid() {
		return bid;
	}



	public void setBid(int bid) {
		this.bid = bid;
	}



	public String getDatetime() {
		return datetime;
	}



	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}



	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserPwd() {
		return userPwd;
	}



	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}



	public Member(int bid, String datetime, String userType, String userId, String userName, String userPwd) {
		super();
		this.bid = bid;
		this.datetime = datetime;
		this.userType = userType;
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
	}



	public Member() {};
	
	
}

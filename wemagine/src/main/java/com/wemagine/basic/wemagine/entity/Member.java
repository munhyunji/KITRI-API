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
	
	@Column(name = "userType", length = 30, nullable = false)
	private String user_type; 
	
	@Column(name = "userId", length = 50, nullable = false)
	private String user_id;
	
	@Column(name = "user_name", length = 50, nullable = false)
	private String userName;
	
	@Column(name = "user_pwd", length = 255, nullable = false)
	private String user_pwd;

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

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public Member(int bid, String datetime, String user_type, String user_id, String userName, String user_pwd) {
		super();
		this.bid = bid;
		this.datetime = datetime;
		this.user_type = user_type;
		this.user_id = user_id;
		this.userName = userName;
		this.user_pwd = user_pwd;
	}
	
	public Member() {};
	
	
}

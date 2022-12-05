package com.wemagine.basic.wemagine.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
	
	private int bid;
	private String datetime;
	private String user_type;
	private String uset_id;
	private String user_name;
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
	public String getUset_id() {
		return uset_id;
	}
	public void setUset_id(String uset_id) {
		this.uset_id = uset_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	
	public MemberDto(int bid, String datetime, String user_type, String uset_id, String user_name, String user_pwd) {
		super();
		this.bid = bid;
		this.datetime = datetime;
		this.user_type = user_type;
		this.uset_id = uset_id;
		this.user_name = user_name;
		this.user_pwd = user_pwd;
	}
	
	public MemberDto() {};
	
	
}

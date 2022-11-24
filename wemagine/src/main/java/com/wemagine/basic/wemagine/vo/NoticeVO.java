package com.wemagine.basic.wemagine.vo;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ToString
public class NoticeVO {

		private int bid;
		private String datetime;
		private String userId;
		private String userName;
		private String title;
		private String content;
		private String file1;
		private String file1_name;
		private String file2;
		private String file2_name;
		private String file3;
		private String file3_name;
		private String file4;
		private String file4_name;
		private String file5;
		private String file5_name;		
		private int views;
		private int is_head;
		private int is_open;
		
		
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
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getFile1() {
			return file1;
		}
		public void setFile1(String file1) {
			this.file1 = file1;
		}
		public String getFile1_name() {
			return file1_name;
		}
		public void setFile1_name(String file1_name) {
			this.file1_name = file1_name;
		}
		public String getFile2() {
			return file2;
		}
		public void setFile2(String file2) {
			this.file2 = file2;
		}
		public String getFile2_name() {
			return file2_name;
		}
		public void setFile2_name(String file2_name) {
			this.file2_name = file2_name;
		}
		public String getFile3() {
			return file3;
		}
		public void setFile3(String file3) {
			this.file3 = file3;
		}
		public String getFile3_name() {
			return file3_name;
		}
		public void setFile3_name(String file3_name) {
			this.file3_name = file3_name;
		}
		public String getFile4() {
			return file4;
		}
		public void setFile4(String file4) {
			this.file4 = file4;
		}
		public String getFile4_name() {
			return file4_name;
		}
		public void setFile4_name(String file4_name) {
			this.file4_name = file4_name;
		}
		public String getFile5() {
			return file5;
		}
		public void setFile5(String file5) {
			this.file5 = file5;
		}
		public String getFile5_name() {
			return file5_name;
		}
		public void setFile5_name(String file5_name) {
			this.file5_name = file5_name;
		}
		public int getViews() {
			return views;
		}
		public void setViews(int views) {
			this.views = views;
		}
		public int getIs_head() {
			return is_head;
		}
		public void setIs_head(int is_head) {
			this.is_head = is_head;
		}
		public int getIs_open() {
			return is_open;
		}
		public void setIs_open(int is_open) {
			this.is_open = is_open;
		}
		
		
	
		
}

package com.wemagine.basic.wemagine.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.wemagine.basic.wemagine.dto.NoticeDto;

import lombok.AccessLevel;
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
@Table(name="`board|basic|notice|notice`")
public class Notice {
	
	//Builder 디자인 패턴중 하나인 빌더패턴방식으로 객체성성할수 있게해줌
	//Entity 클래스 : 실제 DB와 매칭될 클래스들이며 JPA를 사용할경우 Entity클래스의 수정을 통해 DB데이터 작업
	//JPA가 관리하는 클래스가 되고 JPA를 통해서 테이블과 매핑할 클래스는 반드시 @Entity를 붙여야한다.
	
	//@id = primaryKey , @GeneratedValue = pk값을 DB에게 위임한다..
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bid", unique = true, nullable = false )
	private int bid;
	
	@Column(length = 15, nullable = false )
	private Date datetime;
	
	@Column(name = "user_id", length = 50, nullable = false )
	private String userId;
	
	@Column(name = "user_name", length = 30, nullable = false )
	private String userName;
	
	@Column(length = 100, nullable = false )
	private String title;
	
	@Column(length = 65535, nullable = false )
	private String content;
	
	@Column(length = 255, nullable = true )
	private String file1;
	
	@Column(length = 255, nullable = true )
	private String file1_name;
	
	@Column(length = 255, nullable = true )
	private String file2;
	
	@Column(length = 255, nullable = true )
	private String file2_name;
	
	@Column(length = 255, nullable = true )
	private String file3;
	
	@Column(length = 255, nullable = true )
	private String file3_name;
	
	@Column(length = 255, nullable = true )
	private String file4;
	
	@Column(length = 255, nullable = true )
	private String file4_name;
	
	@Column(length = 255, nullable = true )
	private String file5;
	
	@Column(length = 255, nullable = true )
	private String file5_name;
	
	@Column(length = 255, nullable = true )
	private int views;
	
	@Column(length = 255, nullable = true )
	private int is_head;
	
	@Column(name = "is_open", length = 255, nullable = true )
	private int isOpen;
	
		
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
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

	public int getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(int isOpen) {
		this.isOpen = isOpen;
	}

	public Notice(int bid, Date datetime, String userId, String userName, String title, String content, String file1,
			String file1_name, String file2, String file2_name, String file3, String file3_name, String file4,
			String file4_name, String file5, String file5_name, int views, int is_head, int isOpen) {
		super();
		this.bid = bid;
		this.datetime = datetime;
		this.userId = userId;
		this.userName = userName;
		this.title = title;
		this.content = content;
		this.file1 = file1;
		this.file1_name = file1_name;
		this.file2 = file2;
		this.file2_name = file2_name;
		this.file3 = file3;
		this.file3_name = file3_name;
		this.file4 = file4;
		this.file4_name = file4_name;
		this.file5 = file5;
		this.file5_name = file5_name;
		this.views = views;
		this.is_head = is_head;
		this.isOpen = isOpen;
	}



	public Notice() {
		
	}


	
	//Builder 패턴
	/* 
	 * 생성자 인자로 너무많은 인자가 넘겨지는경우 확인힘듬/ 인스턴스는 특정인자를 줘야할때 특정인자값을 null로 줘야하는데 가독성 측면에서 좋지않다..
	 * 매개변수가 늘어날수록 생성되어있는 것을을 수정하기 어려워지기 때문에 Builder 패턴으로 작성해준다
	 */
	
	
	
	
	
	
	
	
	
	
	
}

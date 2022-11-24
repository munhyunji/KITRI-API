package com.wemagine.basic.wemagine.dto;


import lombok.Builder;
import lombok.Data;

@Data
public class NoticeDto {

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
	
	@Builder
	public NoticeDto(int bid, String datetime, String userId, String userName, String title, String content,
			String file1, String file1_name, String file2, String file2_name, String file3, String file3_name,
			String file4, String file4_name, String file5, String file5_name, int views, int is_head, int is_open) {
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
		this.is_open = is_open;
	}
	
	

			
}

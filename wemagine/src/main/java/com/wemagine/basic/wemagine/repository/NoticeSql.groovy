package com.wemagine.basic.wemagine.repository

class NoticeSql {
	public static final String SELECT = """
		SELECT * FROM `board|basic|notice|notice` WHERE 1=1
	""";
	
	public static final String BID_CONDITION = """
		AND bid = :bid
	""";
		
	//:columnName => 파라메터 전달
	public static final String ISOPEN_CONDITION = """
		AND is_open = :is_open	
	""";
	
	public static final String INSERT = """
		INSERT INTO `board|basic|notice|notice` (
			datetime,
			user_id,
			user_name,
			title,
			content,
			file1,
			file1_name,
			file2,
			file2_name,
			file3,
			file3_name,
			file4,
			file4_name,
			file5,
			file5_name,
			views,
			is_head,
			is_open
				) VALUES (
			:datetime,
			:user_id,
			:user_name,
			:title,
			:content,
			:file1,
			:file1_name,
			:file2,
			:file2_name,
			:file3,
			:file3_name,
			:file4,
			:file4_name,
			:file5,
			:file5_name,
			:views,
			:is_head,
			:is_open

		)
	""";
	
	
	public static final String UPDATE = """
		UPDATE  `board|basic|notice|notice` SET
			Datetime = :datetime,
			User_id = :user_id,
			User_name = :user_name,
			Title = :title,
			Content = :content,
			File1 = :file1,
			File1_name = :file1_name,
			File2 = :file2,
			File2_name = :file2_name,
			File3 = :file3,
			File3_name = :file3_name,
			File4 = :file4,
			File4_name = :file4_name,
			File5 = :file5,
			File5_name = :file5_name,
			Views = :views,
			Is_head = :is_head,
			Is_open = :is_open

			WHERE 1=1 
			
	""";
		
	public static final String DELETE = """
		DELETE FROM `board|basic|notice|notice` WHERE 1=1 
	
	""";
}
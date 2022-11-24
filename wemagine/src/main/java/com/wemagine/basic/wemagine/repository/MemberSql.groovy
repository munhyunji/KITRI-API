package com.wemagine.basic.wemagine.repository

class MemberSql {
	
	public static final String SELECT = """
		SELECT * FROM MEMBER WHERE 1=1 
	""";
	
	public static final String BID_CONDITION = """
		AND BID = :bid
	""";
	
}

package com.wemagine.basic.wemagine.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wemagine.basic.wemagine.vo.NoticeVO;

public class NoticeRowMapper implements RowMapper<NoticeVO> {
	
	// RowMapper 원하는형태의 결과값을 반환할수있다 -> 객체로 반환할수있음..?? 
	
	@Override
	public NoticeVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		NoticeVO noticeVo = new NoticeVO();
		noticeVo.setBid(rs.getInt("bid"));
		noticeVo.setDatetime(rs.getNString("datetime"));
		noticeVo.setUserId(rs.getNString("user_id"));
		noticeVo.setUserName(rs.getNString("user_name"));
		noticeVo.setTitle(rs.getNString("title"));
		noticeVo.setContent(rs.getString("content"));
		noticeVo.setFile1(rs.getNString("file1"));
		noticeVo.setFile1_name(rs.getNString("file1_name"));
		noticeVo.setFile2(rs.getNString("file2"));
		noticeVo.setFile2_name(rs.getNString("file2_name"));
		noticeVo.setFile3(rs.getNString("file3"));
		noticeVo.setFile3_name(rs.getNString("file3_name"));
		noticeVo.setFile4(rs.getNString("file4"));
		noticeVo.setFile4_name(rs.getNString("file4_name"));
		noticeVo.setFile5(rs.getNString("file5"));
		noticeVo.setFile5_name(rs.getNString("file5_name"));
		noticeVo.setViews(rs.getInt("views"));
		noticeVo.setIs_head(rs.getInt("is_head"));
		noticeVo.setIs_open(rs.getInt("is_open"));
					
		return noticeVo;
	}
	
	
	

}

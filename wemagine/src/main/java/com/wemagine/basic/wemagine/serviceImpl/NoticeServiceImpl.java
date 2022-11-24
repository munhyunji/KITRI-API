package com.wemagine.basic.wemagine.serviceImpl;

import java.util.List;

import com.wemagine.basic.wemagine.vo.NoticeVO;

public interface NoticeServiceImpl {
	
	public List<NoticeVO> getNoticeList();
	
	public List<NoticeVO> getNoticeListIsopen(int is_open);
	
	public List<NoticeVO> getNotice(int bid);
	
	//등록
	public Object insert(NoticeVO noticeVO);
	
	//수정
	public int update(NoticeVO noticeVO);
	
	//삭제
	public int delete(int bid);
	
	
	
		
}

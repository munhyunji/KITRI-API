package com.wemagine.basic.wemagine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wemagine.basic.wemagine.repository.NoticeRepository;
import com.wemagine.basic.wemagine.serviceImpl.NoticeServiceImpl;
import com.wemagine.basic.wemagine.vo.NoticeVO;

@Service
public class NoticeService implements NoticeServiceImpl{

		//Repository 객체선언
		private final NoticeRepository noticeRepository;
		
		@Autowired
		public NoticeService(NoticeRepository noticeRepository) {
			this.noticeRepository = noticeRepository;
		}
		
		//공지사항 리스트 조회
		@Override
		public List<NoticeVO> getNoticeList() {
			return noticeRepository.selecList();
		}

		//공지사항 조건 조회
		@Override
		public List<NoticeVO> getNoticeListIsopen(int is_open) {
			
			return noticeRepository.selectListIsopen(is_open);
		}
		
		//공지사항 정보 
		@Override
		public List<NoticeVO> getNotice(int bid) {
			return noticeRepository.getNotice(bid);
		}
		
		//공지사항 입력
		@Override
		public NoticeVO insert(NoticeVO noticeVO) {
			
			return noticeRepository.insert(noticeVO);
		}

		//공지사항 수정
		@Override
		public int update(NoticeVO noticeVO) {
		
			return noticeRepository.update(noticeVO);
		}

		//공지사항 삭제
		@Override
		public int delete(int bid) {
			
			return noticeRepository.delete(bid);
		}
		
}

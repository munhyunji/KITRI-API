package com.wemagine.basic.wemagine.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import org.omg.CORBA.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wemagine.basic.wemagine.dto.NoticeDto;
import com.wemagine.basic.wemagine.entity.Notice;
import com.wemagine.basic.wemagine.repository.NoticeJpaRepository;
import com.wemagine.basic.wemagine.service.NoticeService;
import com.wemagine.basic.wemagine.vo.NoticeVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j // lombok이 제공하는 기능 (= private final Logger log = LoggerFactory.getLogger(getClass()); )
@RestController
@RequestMapping("notice")
public class NoticeController {
	
	private final Logger log = LoggerFactory.getLogger(getClass()); 
	
	private final NoticeService noticeService;	
	private final NoticeJpaRepository noticeJpaRepository;
	

	public NoticeController(NoticeService noticeService, NoticeJpaRepository noticeJpaRepository) {
		super();
		this.noticeService = noticeService;
		this.noticeJpaRepository = noticeJpaRepository;
	}

	//공지사항 리스트 조회 - JPA
	@GetMapping("/noticeList")
	public List<Notice> noticeAll() {
		return noticeJpaRepository.findAll();
	}
	
	//공개된 공지사항만 조회 - JPA
	@GetMapping("/{is_open}")
	public List<Notice> findNoticeBybid(@PathVariable("is_open") int is_open) {		
		return noticeJpaRepository.findByIsOpen(is_open);
		
	}
	
	/*@PostMapping("/noticeFindByBid")
	public Notice save() {
		Notice notice = Notice.builder() 			
			.datetime(LocalDate.now())
			.user_id("문현지")
			.user_name("mhg0904")
			.title("테스트 공지 작성")
			.content("테스트 공지 내용")
			.views(1)
			.is_head(0)
			.is_open(1);
	
	}*/

	//공지사항 삭제
		@GetMapping("/noticedelete/{bid}") 
		public void noticeDelete(@PathVariable(value="bid")int bid) {
			 noticeJpaRepository.deleteById(bid);
		}
	
		
	//------Service
		
		
	//공지사항
	/*@GetMapping("/noticeList")
	public Object noticeList() {
		System.out.println("noticeList 실행");
		List<NoticeVO> noticeList = noticeService.getNoticeList();		
		return noticeList;
	}
	
	
	@GetMapping("/noticeListIsOpen")
	public Object noticeListIsOpen(@RequestParam("is_open") int is_open) {
		
		System.out.println("noticeListByParam 실행");
		List<NoticeVO> noticeListIsopen = noticeService.getNoticeListIsopen(is_open);
		return noticeListIsopen;
	}
	
	
	@GetMapping("/{bid}")
	public Object getNotice(@PathVariable("bid") int bid) {
		
		System.out.println("getNotice 실행");
		log.debug("?");
		List<NoticeVO> getNotice = noticeService.getNotice(bid);
		
		return getNotice;
	}*/
	
	// 공지사항 작성
	/*@PostMapping(value="noticeAdd")
	public ResponseEntity<NoticeVO> noticeAdd(@RequestBody NoticeVO noticeVO) {
		
		try {
			log.debug("noticeAdd={}", noticeVO.toString());
			return new ResponseEntity<>(noticeService.insert(noticeVO), HttpStatus.OK);
		
		} catch (Exception e) {
			log.error(e.toString());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/
	
	//공지사항 수정
	@PostMapping(value="noticeEdit")
	public ResponseEntity<String> noticeEdit(@RequestBody NoticeVO noticeVO) {
		
		try {
			log.debug("noticeEdit={}", noticeVO.toString());
			int updatedCnt = noticeService.update(noticeVO);
			return new ResponseEntity<>(String.format("%d updated", updatedCnt ), HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	

	/*@PostMapping(value="noticeDelete")
	public ResponseEntity<String> noticeDelete(@RequestParam(value="bid")int bid) {
		try {
			int deleteCnt = noticeService.delete(bid);
			log.debug("noticeDelete={}", deleteCnt );
			return new ResponseEntity<>(String.format("%d deleted", deleteCnt), HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/
	
	

}

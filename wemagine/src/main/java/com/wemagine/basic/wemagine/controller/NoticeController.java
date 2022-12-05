package com.wemagine.basic.wemagine.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.omg.CORBA.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
@RequestMapping("/notice")
public class NoticeController {
	
	private final Logger log = LoggerFactory.getLogger(getClass()); 
	
	private final NoticeService noticeService;	
	private final NoticeJpaRepository noticeJpaRepository;
	

	public NoticeController(NoticeService noticeService, NoticeJpaRepository noticeJpaRepository) {
		super();
		this.noticeService = noticeService;
		this.noticeJpaRepository = noticeJpaRepository;
	}

	//공지사항 리스트 
	@GetMapping("/notice")
	public List<Notice> noticeAll() {
		return noticeJpaRepository.findAll();
	}
	
	//공지사항 조회 - JPA
	@GetMapping("/notice/{bid}")
	public Optional<Notice> getNotice(@PathVariable(value="bid") int bid) {		
		return noticeJpaRepository.findById(bid);
		
	}
	
	//공지사항 작성
	@PostMapping("/notice")
	public Notice noticeWrite(@RequestBody Notice notice) {
		return noticeJpaRepository.save(notice);
		
	}
	
	//공지사항 수정
	@PutMapping("/notice")
	public ResponseEntity<String> noticeEdit(@RequestBody NoticeVO noticeVO) {
		
		try {
			log.debug("noticeEdit={}", noticeVO.toString());
			int updatedCnt = noticeService.update(noticeVO);
			return new ResponseEntity<>(String.format("%d updated", updatedCnt ), HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	//공지사항 삭제
	@DeleteMapping("/notice/{bid}") 
	public void noticeDelete(@PathVariable(value="bid")int bid) {
		noticeJpaRepository.deleteById(bid);
	}
		
	

}

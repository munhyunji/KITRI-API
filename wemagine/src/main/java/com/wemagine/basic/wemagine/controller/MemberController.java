package com.wemagine.basic.wemagine.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wemagine.basic.wemagine.dto.MemberDto;
import com.wemagine.basic.wemagine.entity.Member;
import com.wemagine.basic.wemagine.repository.MemberJpaRepository;
import com.wemagine.basic.wemagine.service.MemberService;
import com.wemagine.basic.wemagine.vo.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/member")
public class MemberController {
	
	private final Logger log = LoggerFactory.getLogger(getClass()); 
	
	private final MemberService memberService;
	private final MemberJpaRepository memberJpaRepository;

	public MemberController(MemberService memberService, MemberJpaRepository memberJpaRepository) {
		super();
		this.memberService = memberService;
		this.memberJpaRepository = memberJpaRepository;
	}
	
	//회원목록
	@GetMapping("/members")
	public List<Member> memberList() {
		return memberJpaRepository.findAll();
	}
	
	//회원 조회
	@GetMapping("/members/{bid}")
	public Member getMember(@PathVariable(value="bid")int bid) {
		return memberJpaRepository.findById(bid);
	}
	
	//회원 등록
	@PostMapping("/members")
	public Member memberJoin(@RequestBody Member member) {		
		return memberJpaRepository.save(member); 
	}
	
	//회원 수정
	@PutMapping("/members")
	public Member memberEdit(@RequestBody Member member) {
		return memberJpaRepository.save(member);
	}
	
	//회원삭제
	@DeleteMapping("/members/{bid}")
	public void memberDelete(@PathVariable(value="bid")int bid) {
		 memberJpaRepository.deleteById(bid);
	}
	
	
	
	
	
}

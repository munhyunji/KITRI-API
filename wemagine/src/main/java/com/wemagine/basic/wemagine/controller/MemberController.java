package com.wemagine.basic.wemagine.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wemagine.basic.wemagine.entity.Member;
import com.wemagine.basic.wemagine.repository.MemberJpaRepository;
import com.wemagine.basic.wemagine.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("Member")
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
	@GetMapping("/memberList")
	public List<Member> memberList() {
		return memberJpaRepository.findAll();
	}
	
	//회원 조회
	@GetMapping("/{bid}")
	public Member getMember(@PathVariable(value="bid")int bid) {
		return memberJpaRepository.findById(bid);
	}
	
	
	
	
}

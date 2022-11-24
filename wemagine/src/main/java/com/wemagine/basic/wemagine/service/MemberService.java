package com.wemagine.basic.wemagine.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wemagine.basic.wemagine.repository.NoticeRepository;
import com.wemagine.basic.wemagine.serviceImpl.MemberServiceImpl;
import com.wemagine.basic.wemagine.vo.NoticeVO;
import com.wemagine.basic.wemagine.vo.MemberVO;


@Service
public class MemberService implements MemberServiceImpl {
	
	@Override
	public MemberVO getMember() {
			MemberVO member = new MemberVO();
			member.setDatetime("2022-11-24");
			member.setUser_type("user");
			member.setUset_id("test1234");
			member.setUser_name("스프링유저");
			member.setUser_pwd("1234");
			
		return member;
	}
	
	
	
	

}

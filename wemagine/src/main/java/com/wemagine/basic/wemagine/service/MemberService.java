package com.wemagine.basic.wemagine.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wemagine.basic.wemagine.dto.MemberDto;
import com.wemagine.basic.wemagine.entity.Member;
import com.wemagine.basic.wemagine.repository.MemberJpaRepository;
import com.wemagine.basic.wemagine.repository.NoticeRepository;
import com.wemagine.basic.wemagine.serviceImpl.MemberServiceImpl;
import com.wemagine.basic.wemagine.vo.NoticeVO;
import com.wemagine.basic.wemagine.vo.MemberVO;


@Service
public class MemberService implements MemberServiceImpl {
	 	
	@Override
	public Member insertMember(MemberDto memberDto) {
		Member member = new Member();
		member.setDatetime(memberDto.getDatetime());
		member.setUserType(member.getUserType());
		member.setUserId(member.getUserId());
		member.setUserPwd(member.getUserPwd());
		member.setUserName(member.getUserName());
		
		return member;
	}
	
	
	
	

}

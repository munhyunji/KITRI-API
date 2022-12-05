package com.wemagine.basic.wemagine.serviceImpl;

import com.wemagine.basic.wemagine.dto.MemberDto;
import com.wemagine.basic.wemagine.entity.Member;
import com.wemagine.basic.wemagine.vo.MemberVO;

public interface MemberServiceImpl {
	
	public Member insertMember(MemberDto memberDto);
	
}

package com.wemagine.basic.wemagine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wemagine.basic.wemagine.dto.MemberDto;
import com.wemagine.basic.wemagine.entity.Member;

public interface MemberJpaRepository extends JpaRepository<Member, Integer>{
	
	//기본적으로 CRUD사용가능
	Member findById(int bid);

	Member save(MemberDto memberDto);
}

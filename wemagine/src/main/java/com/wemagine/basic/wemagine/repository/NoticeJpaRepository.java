package com.wemagine.basic.wemagine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wemagine.basic.wemagine.dto.NoticeDto;
import com.wemagine.basic.wemagine.entity.Notice;
import com.wemagine.basic.wemagine.vo.NoticeVO;

//JpaRepository<DTO 클래스, PK 타입>
//JpaRepository를 상속받도록 함으로써 기본적인 동작이 모두 가능해짐 
//save(), findAll(), get(), findById, exist, deleteByid 등... 
public interface NoticeJpaRepository extends JpaRepository<Notice, Integer> {
	
	//Entity 필드값으로 조회메서드를 추가하고싶은경우 findBy~ 선언하면 JPA가 알아서 구현핸준다 
	
	

}

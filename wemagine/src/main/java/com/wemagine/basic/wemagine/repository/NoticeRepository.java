package com.wemagine.basic.wemagine.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.wemagine.basic.wemagine.vo.NoticeVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class NoticeRepository {
	
	// Repository는 Database의 CRUD와 같은 부분을 담당한다
	// 쿼리문을 관리하기위해 Groovy라이브러리를 다운받고 SQL문을 작성함.
	
	private final Logger log = LoggerFactory.getLogger(getClass()); 
	
	private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;	
	private final NoticeRowMapper noticeRowMapper;
		
	
	public NoticeRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
		this.noticeRowMapper = new NoticeRowMapper();
	}
	
	public List<NoticeVO> selecList() {
		 
		//쿼리에 파라미터를 넘길필요가 없으므로  EmptySqlParameterSource.INSTANCE를 던집니다.		
		return namedParameterJdbcTemplate.query(NoticeSql.SELECT,
				EmptySqlParameterSource.INSTANCE, this.noticeRowMapper);
		
		//조회된 데이터 한줄한줄을 cityRowMapper를 통해 매핑해줍니다.
		
	}
	
	public List<NoticeVO> selectListIsopen(int is_open) {
		
		//쿼리문 합체
		String qry = NoticeSql.SELECT 
					+ NoticeSql.ISOPEN_CONDITION;
		//파라미터 전달
		SqlParameterSource param = new MapSqlParameterSource("is_open", is_open);
		
		return namedParameterJdbcTemplate.query(qry, param, this.noticeRowMapper);
		
	}
	
	public List<NoticeVO> getNotice(int bid) {
		
		String qry = NoticeSql.SELECT
					+ NoticeSql.BID_CONDITION;
		
		SqlParameterSource param = new MapSqlParameterSource("bid", bid);
		
		return namedParameterJdbcTemplate.query(qry, param, this.noticeRowMapper);
	}
	
	
	public NoticeVO insert(NoticeVO noticeVO) {
		
		//entity 테이블에 삽입하고나서 엔티티에게 할당된 아이디값을 전달받고싶은경우에 자동으로 생성된 키값을 구할수있는방법 Keyholder =bid
		KeyHolder keyholder = new GeneratedKeyHolder();
		
		//파라미터 전달
		SqlParameterSource param = new MapSqlParameterSource("datetime", LocalDateTime.now())
									.addValue("user_id", noticeVO.getUserId())
									.addValue("user_name", noticeVO.getUserName())
									.addValue("title", noticeVO.getTitle())
									.addValue("file1", noticeVO.getFile1())
									.addValue("file1_name", noticeVO.getFile1_name())
									.addValue("file2", noticeVO.getFile2())
									.addValue("file2_name", noticeVO.getFile2_name())
									.addValue("file3", noticeVO.getFile3())
									.addValue("file3_name", noticeVO.getFile3_name())
									.addValue("file4", noticeVO.getFile4())
									.addValue("file4_name", noticeVO.getFile4_name())
									.addValue("file5", noticeVO.getFile5())
									.addValue("file5_name", noticeVO.getFile5_name())
									.addValue("content", noticeVO.getContent())
									.addValue("views", noticeVO.getViews())
									.addValue("is_head", noticeVO.getIs_head())
									.addValue("is_open", noticeVO.getIs_open());
			int effectedRows = namedParameterJdbcTemplate.update(NoticeSql.INSERT, param, keyholder);
			log.debug("{} inserted, new id = {}", effectedRows, keyholder.getKey() );
			System.out.println( Integer.toString(effectedRows));
			noticeVO.setBid(keyholder.getKey().intValue());
			noticeVO.setFile1("file_name11");
			
		return noticeVO;
	}
	
	
	public int update(NoticeVO noticeVO) {
		String qry = NoticeSql.UPDATE +
					 NoticeSql.BID_CONDITION;
		
		SqlParameterSource param = new MapSqlParameterSource("bid", noticeVO.getBid())
									.addValue("datetime", LocalDateTime.now()) 
									.addValue("user_id", noticeVO.getUserId())
									.addValue("user_name", noticeVO.getUserName())
									.addValue("title", noticeVO.getTitle())
									.addValue("file1", noticeVO.getFile1())
									.addValue("file1_name", noticeVO.getFile1_name())
									.addValue("file2", noticeVO.getFile2())
									.addValue("file2_name", noticeVO.getFile2_name())
									.addValue("file3", noticeVO.getFile3())
									.addValue("file3_name", noticeVO.getFile3_name())
									.addValue("file4", noticeVO.getFile4())
									.addValue("file4_name", noticeVO.getFile4_name())
									.addValue("file5", noticeVO.getFile5())
									.addValue("file5_name", noticeVO.getFile5_name())
									.addValue("content", noticeVO.getContent())
									.addValue("views", noticeVO.getViews())
									.addValue("is_head", noticeVO.getIs_head())
									.addValue("is_open", noticeVO.getIs_open());
		int effectedRows = namedParameterJdbcTemplate.update(qry, param);
		log.debug("{} updated", effectedRows);
		
		return namedParameterJdbcTemplate.update(qry, param);
	}

	public int delete(int bid) {
		String qry = NoticeSql.DELETE +
					 NoticeSql.BID_CONDITION;
		
		SqlParameterSource param = new MapSqlParameterSource("bid", bid);
		
		int effectedRows = namedParameterJdbcTemplate.update(qry, param);
		log.debug("{} deleted", effectedRows);
		
		return namedParameterJdbcTemplate.update(qry, param);
	}
		
		
		
}

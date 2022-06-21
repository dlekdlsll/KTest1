package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
//		List<BoardVO> list = mapper.getList();
//		for (BoardVO vo: list) {
//			log.info(list);
//		}
		mapper.getList().forEach(vo -> log.info(vo));
		
	}
	
	@Test
	public void testGetListWithPaging() {
		Criteria cri = new Criteria();
		cri.setType("TW");
		cri.setKeyword("테스트");
		mapper.getListWithPaging(cri).forEach(vo -> log.info(vo));
	}
	
	@Test
	public void testCount() {
		Criteria cri = new Criteria();
		log.info("글 개수는 : " + mapper.count(cri));
		cri.setType("TW");
		cri.setKeyword("테스트");
		log.info("글 개수는 : " + mapper.count(cri));
	}
	
	@Test
	public void testCount1() {
		BoardVO vo = new BoardVO();
		vo.setWriter("user00");
		log.info("유저 글 개수 확인 : " + mapper.count1(vo));
	}
	
	@Test
	public void testQuiz1() {
		log.info("보자:"+mapper.quiz1());
	}
	
	@Test
	public void testQuiz2() {
//		log.info("제목, 작성자만(중복제거):"+mapper.quiz2());
		for (BoardVO vo: mapper.quiz2()) {
			log.info(vo.getTitle() + "   " + vo.getWriter());
		}
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("제목");
		vo.setContent("내용");
		vo.setWriter("테스터1");
		mapper.insert(vo);
	}
	
	@Test
	public void testRead() {
		log.info("보자:"+mapper.read(1l));
	}
	
	@Test
	public void testDelete() {
		log.info("삭제된 글의 개수는 : " + mapper.delete(3L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(5L);
		vo.setTitle("수정제목");
		vo.setContent("수정내용");
		vo.setWriter("수정자");
		
		log.info("수정된 글의 개수는 : " + mapper.update(vo));
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("제목");
		vo.setContent("내용");
		vo.setWriter("테스터1");
		mapper.insertSelectKey(vo);
		log.info("등록된 글 번호는 " + vo.getBno());
	}
	
}

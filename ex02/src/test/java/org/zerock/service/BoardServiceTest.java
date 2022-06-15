package org.zerock.service;

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
public class BoardServiceTest {
	
	@Autowired
	private BoardService service;
	
	// 목록보기
	@Test
	public void testGetList() {
		Criteria cri = new Criteria();
		service.getList(cri).forEach(vo -> log.info(vo));
	}
	
	// 글 등록
	@Test
	public void testRegister() {
		BoardVO vo = new BoardVO();
		vo.setContent("새로운 내용");
		vo.setTitle("새로운 제목");
		vo.setWriter("새 작성자");
		service.register(vo);
	}
	
	// 글 삭제
	@Test
	public void testRemove() {
		log.info("삭제가 되었나? : " + service.remove(2L));
	}
	
	// 글 수정
	@Test
	public void testModify() {
		BoardVO vo = new BoardVO();
		vo.setBno(10L);
		vo.setTitle("수정제목");
		vo.setContent("수정내용");
		vo.setWriter("수정자");
		
		log.info("수정이 잘 되었나? : " + service.modify(vo));
	}
	
	// 글 상세보기
	@Test
	public void testGet() {
		log.info("글 상세 내용 : "+service.get(10L));
	}
	
}

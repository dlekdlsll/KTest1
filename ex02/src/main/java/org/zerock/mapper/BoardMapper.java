package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.CountVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
	
	// 목록보기
	public List<BoardVO> getList();
	
	// 목록보기(페이지 처리)
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	// 글 등록	- cf> 등록, 삭제, 수정일 경우 리턴이 int이면 처리된 글의 개수가 반납된다.
	public void insert(BoardVO vo);
	
	// 글 등록 (등록된 글번호를 알아야 하는 경우. 즉, PK값을 알아야 하는 경우)
	public void insertSelectKey(BoardVO vo);

	// 글 상세보기
	public BoardVO read(Long bno);
	
	// 글 삭제
	public int delete(Long bno);
	
	// 글 수정
	public int update(BoardVO vo);
	
	// 임의추가 - 글 목록 개수
	public Long count(Criteria cri);

	// 임의추가 - 랭킹
	public List<CountVO> rank();
	
	// 임의추가 - 유저 작성글 개수
//	public Long count1(String user);
	public Long count1(BoardVO vo);
	
	public List<CountVO> quiz1();
	
	public List<BoardVO> quiz2();

	public Long countDistinct();
	
	public List<BoardVO> description();
}

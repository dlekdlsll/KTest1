package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.CountVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	// 글 등록
	public void register(BoardVO vo);
	
	// 글 상세보기
	public BoardVO get(Long bno);
	
	// 글 수정
	public boolean modify(BoardVO vo);
	
	// 글 삭제
	public boolean remove(Long bno);
	
	// 목록보기
	public List<BoardVO> getList(Criteria cri);
	
	// 글 갯수 보기
	public Long count();
	
	// 작성자 랭킹 보기
	public List<CountVO> rank();
}

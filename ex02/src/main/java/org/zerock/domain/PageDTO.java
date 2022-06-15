package org.zerock.domain;

import lombok.Data;

@Data
public class PageDTO {

	// 페이지바 이전가기, 이후가기, 시작값, 끝값
	private boolean prev, next;
	private int startPage, endPage;
	
	private Long total;	// 전체 개수
	private Criteria cri; 	// 몇 개씩 보여줄지, 현재페이지
	
	public PageDTO(Criteria cri, Long total) {
		this.cri = cri;
		this.total = total;
		
//		endPage = 올림(현재페이지/10) 올림 * 10
		endPage = (int)Math.ceil(cri.getPageNum()/10.0) * 10;
		startPage = endPage-9;
		prev = startPage > 1;
		
		// 진짜 마지막 페이지바 번호 = 올림(전체글개수/한페이지 보여줄 개수)
		int realEnd = (int)Math.ceil((double)total / cri.getAmount());
		
		if (endPage > realEnd)	// 마지막 페이지바 번호가 실제페이지가 번호보다 크다면
			endPage = realEnd;	// 마지막 페이지바 번호를 실제 페이지바 값으로 변경
		
		next = endPage < realEnd;
	}
	
	
}

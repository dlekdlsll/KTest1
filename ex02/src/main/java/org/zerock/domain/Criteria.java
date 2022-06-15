package org.zerock.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Criteria {
	// 페이지 번호, 한 페이지당 개수
	private int pageNum = 1;
	private int amount = 10;
	
	// 기본 생성자 -> 기본값 1, 10
	public Criteria() {
		
	}
	
}

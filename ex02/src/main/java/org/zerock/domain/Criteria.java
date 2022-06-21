package org.zerock.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Criteria {
	// 페이지 번호, 한 페이지당 개수
	private int pageNum = 1;
	private int amount = 10;
	
	// 검색에 관련된 정보 추가(검색조건 type, 검색어 keyword)
	// ex > 제목 T, 작성자 W, 내용 C	제목과 작성자로 검색 
	private String type;
	private String keyword;
	
	// 기본 생성자 -> 기본값 1, 10
	public Criteria() {
		
	}
	
	// 여러 검색조건인 문자열을 분리해서 문자열 배열로 만들기
	public String[] getTypeArr() {
		return type==null? new String[] {}: type.split("");
	}
	
}

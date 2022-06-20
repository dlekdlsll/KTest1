package org.zerock.domain;

import lombok.Data;

@Data
public class CountVO {
	private String writer;
	private int count;
	private Long contentNum;
	private Long rn;
}

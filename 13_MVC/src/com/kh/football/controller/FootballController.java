package com.kh.football.controller;

import java.util.List;

import com.kh.football.model.service.FootballService;
import com.kh.football.model.vo.FootballPlayer;

// View와 Model사이에서 제어
public class FootballController {
	private FootballService fs = new FootballService();

	// 뷰에서 축구선수들 값 출력하기 위해 호출하는 메소드
	public List<FootballPlayer> selectAll() {
		List<FootballPlayer> list = fs.selectAll();
		return list;
	}
	
	
	
}

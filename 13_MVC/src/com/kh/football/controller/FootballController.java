package com.kh.football.controller;

import java.util.List;

import com.kh.football.model.dto.FootballPlayerDto;
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
	
	// 뷰에서 축구선수를 추가하고 싶을 때 호출하는 메소드
	public void addFootballPlayer(String name, String position, int backNumber) {
		
		// 귀찮음 이슈
		// fs.addFootballPlayer(name, position, backNumber);
			
	}
	
	// 선택지 == 2개
	// 1. Object
	// 2. FootballPlayerDto
	public FootballPlayer addFootballPlayer(FootballPlayerDto fpd) {
		return fs.addFootballPlayer(fpd);
		
	}
	
	public boolean idCheck(int id) {
		fs.idCheck(id);
		return fs.idCheck(id);
	} 
	
	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		fs.updateFootballPlayer(id, player);
	}
	
	public String deleteFootballPlayer(int id) {
		return fs.deleteFootballPlayer(id);
	}
	
	public void outputFootballPlayer() {
		fs.outputFootballPlayer();
	}
	
	public List<FootballPlayer> findByKeyword(String keyword) {
		return fs.findByKeyword(keyword);
	}
	
	
	
	
}

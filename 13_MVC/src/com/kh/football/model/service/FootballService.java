package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.vo.FootballPlayer;

// 축구선수 저장된걸 가지고 ~~~~
public class FootballService {
	// 정석적으로 가려면 DAO클래스가 존재해야하지만 그러면 규모가 너무 커지기 때문에 Service단에서 저장
	private List<FootballPlayer> list = new ArrayList();
	private int id;
	
	{
		list.add(new FootballPlayer(++id, "손흥민", "공격수", 7));
		list.add(new FootballPlayer(++id, "호날도", "공격수", 7));
		list.add(new FootballPlayer(++id, "메시", "미드필더", 10));
	}
	
	public FootballService() {
		
	}
	
	// 뷰가 축구선수들 정보를 출력하기 위해서 건너건너 옴
	public List<FootballPlayer> selectAll() {
		return list;
	}
	
	
	
	
	
}

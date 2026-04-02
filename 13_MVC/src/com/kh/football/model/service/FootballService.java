package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.dto.FootballPlayerDto;
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
	
	// 뷰가 축구선수를 추가하기 이해서 호출되는 메소드
	public FootballPlayer addFootballPlayer(FootballPlayerDto fpd) {
		// 비즈니스 로직 == 의사결정 코드
		// 1. 이름이 두 글자 이상
		// 2. 포지션은 공격수/미드필더/수비수/골키퍼
		// 3. 등번호는 0이상
		if(fpd.getName().length() >= 2) {
			// fpd가 정상적으로 돌아오지 못했다면
			// NullPointExeption이 발생할수 있겠구나
			if("공격수".equals(fpd.getPosition()) ||
				fpd.getPosition().equals("공격수") ||
				fpd.getPosition().equals("미드필더") ||
				fpd.getPosition().equals("수비수") ||
				fpd.getPosition().equals("골키퍼")) {
				 if(fpd.getBacNumber() >= 0) {
					 
					 // 기능 구현 시 
					 // 어떻게 써야할지 모르겠어요
					 // 뭘 써야할지 모르겠어요
					 // 사지선다 : 출력문 / 변수 / 조건문 / 반복문
					 // 많이 쳐본다
					 // 값에대한 유효성 검증 == validate
					 list.add(new FootballPlayer(++id,
							 					 fpd.getName(),
							 					 fpd.getPosition(),
							 					 fpd.getBacNumber()));
					 return list.get(list.size() - 1);
				 }
			}
		}
		return null;
	}
	
	public boolean idCheck(int id) {
		// 여기서는 뭐할까?
		// 첫번째 요소 비교해보기
		if(list.get(0).getId() == id) {
			return true;
		}
		return false;
	}
	
	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		// id값을 가지고 list를 순회해서
		// 동일한 id값을 가진 FootballPlayer의 index를 알아내야함
//		int index = -1;
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getId() == id) {
//				// 3이라고 입력했을 시 세번째 바퀴에 이 프문에 들어옴
//				index = i;
//				break;
//			}
//		}
		int index = indexOf(id);
		
		boolean result = validateFootballPlayer(player);
		
		if(result) {
			list.set(index, new FootballPlayer(id, player.getName(), player.getPosition(), player.getBacNumber()));
		}
	}
	
	public String deleteFootballPlayer(int id) {
		int index = indexOf(id);
		if(index != -1) {
			return list.remove(index).getName();
		}
		return null;
	
	}
	
		
		private int indexOf(int id) {
			int index = -1;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == id) {
					index = i;
					break;
				}
			}
			return index;
		}
		
	
	private boolean validateFootballPlayer(FootballPlayerDto fpd) {
		if(fpd != null && fpd.getName().length() >= 2) {
			if("공격수".equals(fpd.getPosition()) ||
				fpd.getPosition().equals("공격수") ||
				fpd.getPosition().equals("미드필더") ||
				fpd.getPosition().equals("수비수") ||
				fpd.getPosition().equals("골키퍼")) {
				 if(fpd.getBacNumber() >= 0) {
					 return true;
				 }
			}
		}
		return false;
	}
	
		



	}















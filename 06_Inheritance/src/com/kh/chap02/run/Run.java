package com.kh.chap02.run;

import com.kh.chap02.model.vo.AosGame;
import com.kh.chap02.model.vo.FpsGame;
import com.kh.chap02.model.vo.RpgGame;

public class Run {

	public static void main(String[] args) {
		
		AosGame ag = new AosGame();
		ag.setGameName("롤");
		System.out.println(ag.getGameName());
		
		FpsGame fg = new FpsGame();
		fg.setGameName("배틀그라운드");
		System.out.println(fg.getGameName());
		
		RpgGame rg = new RpgGame();
		rg.setGameName("와우");
		System.out.println(rg.getGameName());
		
		// 자식클래스에 메소드를 재정의 했을 경우
		// @@@ 자식클래스에 재정의한 메소드가 우선권을 가져서 호출됨!!! @@@
		/*
		 * 상속
		 * 
		 * - 중복된 코드를 공통의 클래스로 뽑아서 관리
		 * -> 코드를 적게쓰고 새 클래스를 만들 수 있음 -> 생산성 향상, 가독성 향상
		 * 
		 * 객체간의 결합도가 높아짐
		 */
	}

}

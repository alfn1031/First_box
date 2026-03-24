package com.kh.chap01.run;

import com.kh.chap01.model.vo.AosGame;
import com.kh.chap01.model.vo.FpsGame;
import com.kh.chap01.model.vo.RpgGame;

public class Run {

	public static void main(String[] args) {
		
		// RPG
		// gmaeName, publisher, maxLevel
		RpgGame rg = new RpgGame("와우", "블리자드", 80);
		
		
		// AOS
		// gameName, publisher, characterCount
		AosGame ag = new AosGame("롤", "라이엇", 172);
		
		
		// FPS
		// gameName, publisher, stress
		FpsGame fg = new FpsGame("배틀그라운드", "크래프톤", 100);
		
	
		
		
		

	}

}

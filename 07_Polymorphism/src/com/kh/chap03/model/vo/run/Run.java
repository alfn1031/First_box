package com.kh.chap03.model.vo.run;

import com.kh.chap03.controller.Cooking;
import com.kh.chap03.controller.CookingController;
import com.kh.chap03.controller.Pasta;
import com.kh.chap03.model.vo.Chef;
import com.kh.chap03.model.vo.MainChef;
import com.kh.chap03.model.vo.SaladChef;

public class Run {

	public static void main(String[] args) {
		
		MainChef mc = new MainChef("이승철");
		mc.cooking();
		SaladChef sc = new SaladChef("고길동");
		sc.cooking();
		
		// Chef c = new Chef();
		// 추상클래스로 선언되었기 때문에 객체 생성이 불가능함
		
		Chef[] c = {mc, sc};
		for(int i = 0; i < c.length; i++) {
			c[i].cooking();
		}
		
		CookingController pc = new CookingController();
		pc.pastaCooking(); // CookingController에 의존
		
		
		Cooking cook = new Pasta();
		cook.cooking(); // cooking 클래스에 의존
		
		// 다형성 : 부모타입자료형으로 여러 자식객체를 다룰 수 있음
		// 정보은닉하려고
		// 의존성주입할 때 처음부터 다시 설명함
		/*
		 * 소프트웨어 개발자들의 목표
		 * 
		 * 코드 수정이 쉬움, 기능 추가가 쉬움, 기능 교체도 쉬움
		 *      1			2			   3
		 * 
		 * 객체지향언어
		 */
		
		// 메모장에 적혀있는 오늘의 일기를 콘솔창에 출력해주는 코드 == 입력
		// 콘솔창에 열심히 스캐너가지고 문자열을 적어서 메모장에 저장 == 출력
	}

}

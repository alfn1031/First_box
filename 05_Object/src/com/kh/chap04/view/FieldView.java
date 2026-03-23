package com.kh.chap04.view;

import java.util.Arrays;

import com.kh.chap04.controller.FieldController;

public class FieldView {
	
	public static Object check;

	public void check() {
		
		FieldController fc = new FieldController();
		// 1. FieldController라는 자료형으로 fc라는 지역변수를 선언
		// 2. 객체 생성(new키워드를 만났을때) -> global 멤버변수 할당
		// 3, 생성된 객체의 주소값을 대입
		System.out.println(fc.global);
		
		fc.checkVariable(5); // checkVariable호출 -> parameter(매개변수)할당 및 초기화
		// checkVariable 호출 종료
		// parameter, local 지역변수 소멸
		
		System.out.println(fc.global);
		fc = null; // global은 접근 불가능
		
		System.out.println(Math.PI);
		System.out.println(FieldController.JAVA_VERSION);
		System.out.println(Math.random());
		System.out.println(Arrays.toString(new int[2]));
		
		/*
		 * AccessModifier(접근 제한자 / 접근 제어자)
		 * 
		 * public -> 어디서든 (같은 패키지, 다른 패키지, 클래스 내/외부 포함 전부)접근 가능
		 * 
		 * protected -> 같은 패키지라면 무조건 접근 가능
		 * 			 -> 다른 패키지라면 상속구조인 클래스에서만 접근가능
		 * 			 -> 상속은 07번 프로젝트에서 배울 예정
		 * 
		 * default(pakage friendly) -> 나랑 같은 패키지에서만 접근 가능 
		 * 
		 * private -> 오직 클래스 내부에서만 접근 가능
		 * 
		 */
		
		
		
		
	}

}

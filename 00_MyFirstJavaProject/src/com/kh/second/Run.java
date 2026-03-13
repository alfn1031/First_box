package com.kh.second;

public class Run {
	
	public static void main(String[] args) {
		//printMyName();
		//외부에서 메소드를 호출하려면?
		
		/*
		 * 외부 클래스의 메소드를 호출 할 때에는 메소드를가 존재하는 클래스를 생성(new) 해줘야함
		 * 
		 *  [표현법]
		 *  "클래스이름" "클래스 이름을 대신할 별칭" = new "클래스 이름"();
		 */
		PrintController pc = new PrintController();
		//printMyName();
		pc.printMyName();
		// .
		// 참조연산자 / 직접접근연산자
		
	}
		
}

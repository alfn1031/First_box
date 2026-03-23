package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionElse {
	/*
	 * if ~ else
	 * 
	 * [ 표현법 ] 
	 * 
	 * if(조건식) {
	 * 	조건식의 결과가 true일 경우 실행할 코드 - a
	 * } else {
	 * 		조건식의 결과가 false일 경우 실행할 코드 - b
	 * }
	 * -> 조건식의 결과가 true일 경우 a를 실행
	 * -> 조건식의 결과가 false일 경우 b를 실행
	 */
	public void method1() {
		// 핸드폰 번호 뒷자리 입력받아서 
		// 당첨자 번호랑 같으면 축하 아니면 다음 기회에
		// 당첨 핸드폰 번호 뒷자리 -> 7777
		
		// 사용자에게 핸드폰 번호 뒷자리를 입력받아서
		// 당첨 번호와 일치한다면 축하를 출력
		//          일치하지 않는다면 다음 기회에를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 뒷부분 네자리를 입력해주세요 > ");
		String phoneNumber = sc.nextLine();
		//  System.out.println(phoneNumber);
		// 문자열 값을 비교하고 싶을 때 : ==(동등비교연산자)의 경우 기본타입 자료형 8개 끼리만 사용 가능하기 때문에
		//						equals()라는 메소드를 호출해서 비교해주어야함
		//						문자열 값이 일치할 경우 ture를 반환, 일치하지 않을경우 false를 반환
		if(phoneNumber.equals("7777")) {
			System.out.println("축하드립니다. 백만원 상품권에 당첨되셨습니다!");
		} else {
			System.out.println("아쉽지만 다음기회에...");
		}
		
		// if(!(phoneNumber.equals("7777"))) {
		//	 System.out.println("아쉽지만 다음기회에...");
		// }
		// if문의 조건식 결과가 true일 경우 -> if Scoop가 끝나면 else Scoop를 건너뜀
		// if문의 조건식의 결과가 false일 경우 -> if Scoop를 건너뛰고 else Scaoop로 진입
		// 불필요한 연산이 줄어든다 -> 처리속도 향상
	}
	
	/*
	 * if ~ else if문 
	 * 
	 * [ 표현법 ] 
	 * 
	 * if(조건식1) {
	 * 		조건식이 true일 경우 실행할 코드;
	 * } else if(조건식2) {
	 * 		조건식2가 true일 경우 실행할 코드;
	 * } else if(조건식3) {
	 * 		조건식3이 true일 경우 실행할 코드;
	 * } else {
	 * 		앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드;
	 * }
	 */
	public void method2() {
		// 핸드폰 뒷자리를 입력받아서 1등, 2등, 3등, 아쉽지만 다음기회에 출력
		//					7777  1111 9999
		String message = "등에 당첨되셨습니다!";
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 뒷자리를 입력해주세요. > ");
		String phoneNumber = sc.nextLine();
		
		if(phoneNumber.equals("7777")) {
			System.out.println("1" + message);
		} else if(phoneNumber.equals("1111")) {
			System.out.println("2" + message);
		} else if(phoneNumber.equals("9999")) {
			System.out.println("3" + message);
		} else {
			System.out.println("아쉽지만 다음기회에...");
		}
	}
	
	public void ageCheck() {
		
		// 사용자에게 나이(정수)를 입력받고                -> Scanner, nextInt()
		// 입력받은 나이에 따라서 각기 다른 내용을 출력해주세여  -> if ~ else if, System.out.println 
		// 1~12 : 어린이입니다
		// 13~17 : 청소년입니다
		// 18~ : 성인입니다
		// 0, - : 잘 못 입력하셨습니다
		
		// ageCheck Ver.1
		String me = "입니다.";
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요. > ");
		int age = sc.nextInt();
		
		/* if((1 <= age) && (age <= 12)) {
			System.out.println("어린이" + me);
		} else if((13 <= age) && (age <= 17)) {
			System.out.println("청소년" + me);
		} else if(18 <= age) {
			System.out.println("성인" + me);
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		*/
		
		// ageCheck Ver2
		if(age < 0) {
			System.out.println("올바른 나이를 입력해주세요.");
		} else if(age >= 18) {
			System.out.println("성인 입니다.");
		} else if(age <= 12) {
			System.out.println("어린이 입니다.");
		} else {
			System.out.println("청소년 입니다.");
		}
		
	}
	
	
	
	
	
	
	
	
	
}

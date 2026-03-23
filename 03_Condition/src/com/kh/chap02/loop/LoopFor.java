package com.kh.chap02.loop;

import java.util.Scanner;

import com.kh.chap01.condition.ConditionIf;

public class LoopFor {
	
	public void method0() {
		/*
		System.out.println("마지막시간 힘냅시다!");   ctrl + alt + 아래방향키
		*/
		
		// 100번 가능 1000번 가능 654831번 반복해야한다.
		for(
			int i = 0;
			i < 3768;
			i++
			) {
			System.out.print(i + 1);
			System.out.println("반복시키고싶은 코드를 작성");
		}
	}
	/*
	 * for문
	 * 
	 * for() {
	 * 
	 * }
	 * 
	 * 괄호안은 반복의 횟수를 지정하는 역할
	 * 초기식; 조건식; 증감식 세가지의 요소로 구성됨
	 * ;; 세미콜론으로 구분함
	 * 
	 * [ 표현식 ] 
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		반복적으로 작성하고자 하는 코드;
	 * }
	 * 
	 * - 초기식 : 반복문을 시작할때 "초기에 단 한번만 실행"될 구문
	 * 		  반복문을 할 때 필요한 변수를 선언하고 초기화하는 구문(제어변수) -> int i =0;
	 * 
	 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
	 * 			조건식의 결과가 true일 경우 반복을 수행
	 * 			조건식의 결과가 false일 경우 반복문을 멈추고 for문 블럭을 빠져나옴 -> i < 5;
	 * 
	 * - 증감식 : "반복문을 제어하는 변수에 대입된 값"을 증감하는 구문
	 * 			꼭 그래야하는 것은 아니지만 보통 초기식에서 선언된 변수를 가지고 증감식 작성
	 * 			이 때, 보편적으로 증감연산자를 사용 						   -> i++
	 */
	public void method1() {
		// 정말 단순하게
		// 1
		// 2
		// 3
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
		
//		System.out.println("1\n2\n3");
		
		for(/* 1 */ int i = 1; /* 2 */  i <= 3; /* 4 */  i++) {
			/* 3 */ System.out.println(i + "번 반복");
			// 순서 : 1 - 2 - 3 - 4 - 2 - 3 - 4 - 2 - 3 - 4 - 2(false) 반복종료
			// 1번은 초기 한번만 인식.
		}
		
		// 제어변수는 보통 i, j, k
								
								// i = i + 2
		for(int i = 0; i < 10; i+=2) {
			// if(i % 2 == 0) {
			System.out.println(i);
			//}
		}
		
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}	
	}
	
	public void gugudan() {
		
		// 구구단 프로그램
		// 사용자에게 정수를 입력받아서
		// 입력한 정수의 단을 출력해보기
		
		// @ 구구단을 외자 @
		// 몇 단을 출력하시겠습니까 > 4
		// 4단을 출력하겠습니다.
		// 4 X 1 = 4
		//   .....
		// 4 X 9 = 36
		
		Scanner sc = new Scanner(System.in);
		System.out.println("@ 구구단을 외우자 @");
		System.out.print("몇 단을 출력하시겠습니까? > ");
		int dan = sc.nextInt();
		System.out.println(dan + "단을 출력하겠습니다.");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X  " + i + " = " + (dan * i));
		}
	}
	
	
	public void mainMenu() {
		
		for(;;) {
			System.out.println("메인메뉴입니다.");
			System.out.println("1. 구구단 놀이 시작하기");
			System.out.println("2. O/X퀴즈 시작하기");
			System.out.println("3. 프로그램 종료하기");
			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴를 선택해 주세요. > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			if(menuNo == 1) {
				System.out.println("구구단 놀이를 시작합니다.");
				gugudan();
			} else if(menuNo == 2) {
				System.out.println("O/X 퀴즈를 실행합니다.");
				ConditionIf ci = new ConditionIf();
				ci.quiz();
			} else if(menuNo == 3) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("없는 메뉴를 선택하셨습니다.");
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	

}

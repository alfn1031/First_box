package com.kh.chap02.loop;

public class LoopWhile {
	/*
	 * while문
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식;        // 필수는 아님
	 * 
	 * while(조건식) {
	 * 		반복적으로 실행하고싶은 코드;
	 * 		증감식;   / 필수는 아님 
	 * }
	 * 
	 * while문의 조건식이 true일 경우 반복적으로 실행하고자 하는 코드를 실행;
	 * 
	 * for   -> 개발자가 반복을 몇 번 해야할지 명확하게 알고 있다.
	 * while -> 개발자가 반복을 몇 번 해야할지 가늠할 수가 없다.
	 * 
	 * 무한반복하는 용도로 사용할 예정 
	 */

	public void method1() {
		// 초기식 조건식 증감식
		int i = 0;        // 초기식
		while(i < 3) {    // 조건식
			i++;          // 증감식
			System.out.println(i);
		}
	}
	
	public void method2() {
		// 1 ~ 10까지의 합계를 구해서 출력
		// System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			i++;
		}
		System.out.println(sum);
	}
	
	public void method3() {
		
		// 1부터 시작해서
		// 1 ~ 10 사이의 임의의 정수를 모두 더한 합계를 출력
		// Random이라는 클래스가 존재하지만 
		// Math라는 클래스가 가지고있는 random()를 호출해서 만들어보기
		
		double  number = Math.random();
		// System.out.println(number);
		// random()의 결과값은 : 0.0 ~~~ 0.9999999999999999 (소수점 16자리까지)
		
		/*
		System.out.println(number);
		System.out.println(number * 10);
		System.out.println((int)number * 10);
		System.out.println((int)(number * 10));
		*/
		
		int randomNum = (int)(Math.random() * 10) + 1;
		System.out.println(randomNum);
		
		int i = 1;
		int sum = 0;
		
		while(i < randomNum) {
			sum += i;
			i++;
		}
		System.out.println("1부터" + randomNum + "까지 더한 결과 : " + sum);	
	}
	
	// 로또 번호 생성기
	public void lotto() {
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.printf("오늘의 번호 %d %d %d %d %d %d",
				           num1, num2, num3, num4, num5, num6);
		
	}
	
	
	
	
	
	
	
	
	
}

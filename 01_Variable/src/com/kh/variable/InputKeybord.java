package com.kh.variable;

import java.util.Scanner;

public class InputKeybord {
	/*
	 *  키보드를 이용해서 프로그램을 사용하느 사용자에게 값을 입력받아 볼 것.
	 *  자바에서 제공해주는 Scanner라는 클래스를 사용
	 *  Scanner라는 클래스에 존재하는 메소드들을 호출해서 입력을 받을 수 있음.
	 */
	public void inputTest() {
		
		Scanner sc = new Scanner(System.in);
		// System.in : 표준 입력도구에서 입력하는 것들을 받겠음(바이트 단위)
		
		System.out.println("피자핫에 오신 것을 환영합니다");
		System.out.println("=====피자핫 메뉴판=====");
		System.out.println("1. 치즈/페퍼로니 피자");
		System.out.println("2. 블랙 BBQ 스테이크 뇨끼 피자");
		System.out.println("3. 이제모 피자");
		System.out.println("===================");
		System.out.print("주문하실 메뉴를 선택해주세요. >");
		
		// next() : 사용자가 입력한 값 중 공백문자가 있을 경우 공백문자 이전까지만 입력받음
		String select = sc.nextLine();
		// 사용자가 어떤 값을 입력하던지 입력한 값을 다시 화면상에 출력 <- 목표
		System.out.println(select + "을(를) 주문하셨습니다");
		
		// 개수 : 몇 판이요?
		System.out.println("몇 판 주문하시겠습니까 (숫자로 입력해주세요) > ");
		// 1 2 3 4 5 6...
		int pizzaNumber = sc.nextInt(); // nextDoble
		System.out.println(select + "를 " + pizzaNumber + "판 주문하셨습니다.");
		
		System.out.print("주소를 입력해주세요. > ");
		// nextLine() : 사용자가 입력한 공백과 무관하게 개행문자 이전까지 전체를 다 읽어오는 기능
		// nextLine() : 입력버퍼에서 개행문자 이전까지의 모든 값을 가져온 후 입력버퍼에 존재하는 "개행문자"를 날려줌
		sc.nextLine();
		String address = sc.nextLine();
		
		System.out.println(address + "로 배달합니다.");
		
		
	}
	
}

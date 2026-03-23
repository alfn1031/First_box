package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.vo.Receipt;

// 화면담당(입/출력)
public class ReceiptView {

	public void mainMenu() {
		// System.out.println("ㅎㅎ");
		// 사용자에게 영수증 정보를 입력받고 
		// 입력받은 영수증 정보를 출력해주는 프로그램
		Scanner sc = new Scanner(System.in);
		
		// Receipt라는 클래스를 가지고 객체 생성
		Receipt r = new Receipt();
					// 객체(Object) -> 추상적인 개념
					// Instance    -> 실제 메모리에 올라간 데이터
		// 1. 참조자료형
		// 클래스를 만든다는 행위 == 개발자가 자신에게 필요한 사용자의 정의자료형을 만들겠다.
		// 2. 여러 자료형에 각각 여러개의 값을 보관가능 + 기능
		
		
		// 가격, 결제수단, 상점명, 날짜
		System.out.print("가경이 얼마인가요 > ");
		int price = sc.nextInt();
		r.setPrice(price);
		// 메소드 호출부에서 메소드를 호출하면서 넘길 수 있는것은 오로지 값뿐
		
		System.out.print("결제수단은 무었인가요 > ");
		String payment = sc.nextLine();
		r.setPayment(payment);
		
		System.out.print("상점명은 무었인가요 > ");
		String storeName = sc.nextLine();
		r.setStoreName(storeName);
		
		System.out.print("날짜는 언제인가요 > ");
		String date = sc.nextLine();
		r.setDate(date);
		
		System.out.println("===================");
		String info = r.info();
		System.out.println(info);
		
		
		
		sc.close();
	}
	
}

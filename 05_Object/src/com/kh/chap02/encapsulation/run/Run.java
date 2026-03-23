package com.kh.chap02.encapsulation.run;

import java.util.Scanner;

import com.kh.chap02.encapsulation.model.vo.AutoSellingMachine;

public class Run {

	// 캡슐화 (encapsulation)
	// 속설(데이터)과 해당 데이터를 조작하는 행공(메소드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding)
	
	public static void main(String[] args) {
		// 객체 생성 == 메모리(heap)에 적재
		
		AutoSellingMachine asm = new AutoSellingMachine();
		// 변수공간에 대입 될 수 있는 값은 딱 9가지 (nill값 제외)
		// 기본자료형들의 리터럴값
		// 주소값 == 아 이거 객체다!
		
		/*
		asm.name = "삼양라면";
		// System.out.println(asm.name);
		asm.price = 1100;
		// System.out.println(asm.price);
		asm.amount = 3;
		// System.out.println(asm.amount);
		*/
		
		/*
		asm.재고확인하기();
		asm.재고채우기();
		asm.제품판매하기();
		asm.재고확인하기();
		*/
		
		// asm.openMachine();
		
		// 필드가 외부에서는 보이지 않아서 오류가 발생
		// 접근제한자를 public에서 private로 변경했기때눔
		// 직접접근이 불가능 -> 간접적으로 접근할 수 있는 방법을 만들어주어야 함
		
		// getter / setter라는 메소드 구현하기
		// asm.checkAmount();
		// 라면가격 1500으로 세팅하고싶다
		asm.setPrice(1500);
				// argument, 인지값, 인수
		// asm.setProce();
		
		asm.setName("삼양라면");
		asm.setAmount(5); 
		
		// 함수 == BuiltInFunction
		// 자바의 클래스 == 자료형
		// 메소드 == 특정 자료형만 수행할 수 있는 기능
		// 예) 1 + 1 = 2, 3 -2 = 1  (O)
		//	 "일" - "일"  		    (X)
		
		String name = asm.getName();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(name);
		
		int amount = asm.getAmount();
		System.out.println(amount);
		
		int price = asm.getPrice();
		System.out.println(price);
		
		
		
		
		
		
		
		
	}

	
	
}

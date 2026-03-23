package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Puppy;
import com.kh.chap01.abstraction.view.PuppyCare;

public class Run {
	
	public static void main(String[] args) {
		
		// 현실세계의 강아지 -> 자바 세상의 객체로 구현
		// 종 : 푸들, 이름 : 나폴레옹, 나이 : 5, 몸무게 : 8, 성별 : 암
		// 강아지 객체 생성해보기
		Puppy puppy = new Puppy(); 
		// new라는 예약어를 사용 
		// Memory heap영역에 데이터를 생성
		
//		System.out.println(puppy);
//		// 잠조자료형은 기본값이 null 
//		System.out.println(puppy.name);
		
		puppy.name = "나폴레옹";
		// System.out.println(puppy.name);
		
		// 종 : 방하르, 이름 : 징기스칸, 나이 : 5, 몸무게: 15, 성별 : 수
		
		Puppy khan = new Puppy();
		khan.name = "징기스칸";
		// System.out.println(khan.name);
		
		
		// 정수값 -> 정수자료형 int, short, byte, long
		// 실수값 -> 실수자료형 float, double
		// 논리값 -> ...
		
		// 현실 세계의 강아지의 값 -> 개발자가 직접 강아지의 자료형 만듦 -> 클래스
		// 클래스란? 객체들의 정보 (속성, 행위)들을 담아내는 그릇 또는 틀 또는 설계도 또는 명세
		
		// 소프트웨어 == 실체가 없음
		
		// 객체 지향 프로그래밍 -> 현실세계에서의 개체를 속성과 행위를 가진 객체로 생성하여
		//					   객체간의 관계를 맺고 상호작용을 통해 프로그래밍을 하는 개발방법론
		 /*
		puppy.bark();
		khan.bark();
		
		puppy.weight = 8;
		khan.weight = 15;
		
		System.out.println(khan.weight);
		khan.sit();
		khan.sit();
		khan.sit();
		System.out.println(khan.weight);
		*/
		
		PuppyCare pc = new PuppyCare();
		pc.run();	
	}
	
	
}

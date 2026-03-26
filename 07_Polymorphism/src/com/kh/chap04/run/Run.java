package com.kh.chap04.run;

import java.util.Scanner;

import com.kh.chap04.model.service.CookingSkill;
import com.kh.chap04.model.service.HitTheBop;
import com.kh.chap04.model.service.HongkongHouse;

public class Run {

	public static void main(String[] args) {
		
		// 기능에 대한 설계
		
		Scanner sc = new Scanner(System.in);
		// 손님이 덮밥 시킨다 ~ 가정
		System.out.println("주문하실 덮밥 브랜드를 선택해주시기 바랍니다");
		System.out.println("1. 청킹미미");
		System.out.println("2. 힛또밥");
		System.out.print("메뉴를 선택해 주세요 > ");
		int menuNo = sc.nextInt();
		CookingSkill cs = null;
		switch(menuNo) {
		case 1 : cs = new HongkongHouse(); break;
		case 2 : cs = new HitTheBop(); break;
		}
		cs.makeDopbap();
	}

}

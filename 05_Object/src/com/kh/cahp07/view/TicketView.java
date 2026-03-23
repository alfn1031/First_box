package com.kh.cahp07.view;

import java.util.Scanner;

import com.kh.cahp07.model.vo.Ticket;

public class TicketView {
	private Scanner sc = new Scanner(System.in);
	
	// 화면에 메인메뉴를 출력해주는 메소드
	public void mainMenu() {
		// 두가지 기능 구현하기
		// 1. 티켓 추가하기
		// 2. 추가된 티켓 발급해주기
		while(true) {
		System.out.println("티켓 발권 서비스입니다");
		System.out.println("1. 티켓 추가하기");
		System.out.println("2. 티켓 발급받기");
		System.out.println("3. 프로그램 종료");
		System.out.print("원하시는 메뉴를 선택해주세요 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		// System.out.println(menuNo);
		
		switch(menuNo) {
		case 1 : saveView(); break;
		case 3 : System.out.println("프로그램을 종료합니다."); sc.close(); return;
		default : System.out.println("없는 메뉴를 선택하셨습니다.");
		}
	 }
  }
	
	// 티켓을 추가할 수 있는 화면을 출력해주는 기능
	private void saveView() {
		
		// Scanner sc = new Scanner(System.in);
		System.out.print("티켓 가격을 입력해주세요 > ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("기내식을 입력해주세요 > ");
		String meal = sc.nextLine();
		System.out.print("좌석 번호를 입력해주세요 > ");
		String seatNumber = sc.nextLine();
		System.out.print("서비스를 입력해주세요 > ");
		String service = sc.nextLine();
		
		Ticket ticket = new Ticket(meal, service, seatNumber, price);
		System.out.println(ticket.info());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

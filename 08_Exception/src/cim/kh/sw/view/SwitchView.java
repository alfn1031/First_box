package cim.kh.sw.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import cim.kh.sw.controller.SwitchController;
import cim.kh.sw.exception.SwitchBoomException;

// View 라는 이름이 달린 클래스 : 어쩔 수 없이 사용, 방법이 없음
// 오로지 입 / 출력을 담당
public class SwitchView {
	private Scanner sc = new Scanner(System.in);
	private SwitchController controller = new SwitchController();
	
	public void menu() {
		System.out.println("불 끄고키기 프로그램에 오신것을 환영합니다.");
		while(true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 스위치 누르기");
			System.out.println("2. 프로그램 종료");
			System.out.print(" > ");
			int menuNo = 0;
			
			try {
				menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("정확한 메뉴번호를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();				
			}
			switch(menuNo) {
			case 1 : toggleSwitch(); break;
			case 2 : System.out.println("다음에 또 봐요"); sc.close(); return;
			default : System.out.println("1번이랑 2번 뿐입니다.");   
			}
		}
	}
	
	private void toggleSwitch() {
		
		// SwitchController sc = new SwitchController();
		// 스위치가 꺼져있는 상태면
		// 스위치를 켠 후에 불이 켜졌습니다 출력
		
		// 스위치가 켜져있는 상태면
		// 스위치를 끈 후에 불이 꺼졌습니다 출력
		boolean result = false;
				try {
				controller.toggleSwitch();
				} catch(SwitchBoomException e) {
					System.out.println("폭발이다 돔황챠~");
					return;
				}
		
		
		if(result) {
			System.out.println("스위치를 켠 후 불이 켜졌습니다.");
		} else {
			System.out.println("스위치를 끈 후 불이 꺼졌습니다.");
		}
		
	}
	
	
	
	
	
	
	
	
}

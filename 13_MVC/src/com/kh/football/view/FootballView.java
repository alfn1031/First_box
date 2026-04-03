package com.kh.football.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.football.controller.FootballController;
import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

// 시각적인 부분, 화면 입/출력
// HTML CSS 안배워서 어쩔 수 없이 여기다 씀
public class FootballView {
	private Scanner sc = new Scanner(System.in);
	private FootballController fc = new FootballController();
	private BoardView bv = new BoardView();
	
	// 프로그램 실행 시 보여줄 화면을 출력해주는 기능
	public void mainMenu() {
		// 축구선수 CRUD
		// CREATE : 사용자에게 축구선수의 이름, 포지션, 등번호를 입력받아 저장
		// READ : 만들어진 축구선수를 조회
		// UPDATE : 기존에 존재하는 축구선수의 정보를 수정
		// DELETE : 기존에 존재하는 축구선수의 정보를 삭제
		while(true) {
			System.out.println();
			System.out.println("축구선수 관리 프로그램입니다.");
			System.out.println("1. 축구선수 전체 조회하기");
			System.out.println("2. 축구선수 추가하기");
			// 리스트에 풋볼플레이어 추가하기 <- 방법이 없기때문에 사용
			// 사용자가 입력한 값을 저장소에 저장
			System.out.println("3. 축구선수 수정하기");
			System.out.println("4. 축구선수 삭제하기");
			// 축구선수 id 받아서 한명만 지우기
			// 축구선수 검색하기, 축구선수 목록 파일로 저장하기 - 보류
			System.out.println("5. 축구선수 정보 파일로 출력하기");
			System.out.println("6. 축구선수 검색하기");
			System.out.println("7. 축구 이야기 게시판");
			System.out.println("0. 프로그램 종료하기");
			System.out.println();
			System.out.print("어떤 기능을 이용하시겠습니까? > ");
			
			int menu = 0;
			try {
			   menu = sc.nextInt();
			sc.nextLine();
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주십시오");
				sc.nextLine();
				continue;
			}
			switch(menu) {
			case 1 : selectAll(); break;
			case 2 : addFootballPlayer(); break;
			case 3 : updateFootballPlayer(); break;
			case 4 : deleteFootballPlayer(); break;
			case 5 : fc.outputFootballPlayer(); break;
			case 6 : findFootballPlayer(); break;
			case 7 : bv.boardMenu();
			case 0 : System.out.println("프로그램을 종료합니다"); sc.close(); return;
			default : System.out.println("없는 메뉴입니다. 다시 선택해주세요");
			}
		}
	}
	
	// 선수들의 정보를 출력해주는 기능
	private void selectAll() {
		// 사용자에게 값 입력받기 X, 모델에서 만든 값 출력하기
		
		List<FootballPlayer> list = fc.selectAll();
		
		// list의 필드로 있는 배열의 인덱스에 있는 VO의 주소값을 참조해서 필드 값을 출력
		/*
		String name = list.get(0).getName();
		String position = list.get(0).getPosition();
		Integer backNumber = list.get(0).getBackNmber();
		
		System.out.println("선수들의 정보 : ");
		System.out.println("이름 : " + name);
		System.out.println("포지션 : " + position);
		System.out.println("등번호 : " + backNumber);
		*/
		if(!list.isEmpty()) {
			// 축구선수가 최소한 한명은 있다
			System.out.println("선수들의 정보를 확인해주세요");
			for(FootballPlayer fp : list) {
				System.out.println("선수의 정보 : ");
				System.out.println("----------------------");
				System.out.println("아이디 : " + fp.getId());
				System.out.println("----------------------");
				System.out.println("이름 : " + fp.getName());
				System.out.println("----------------------");
				System.out.println("포지션 : " + fp.getPosition());
				System.out.println("----------------------");
				System.out.println("등번호 : " + fp.getBackNmber());
				System.out.println("----------------------");
				System.out.println();
			}
		} else {
			// 축구선수가 한명도 없다
			System.out.println("============================");
			System.out.println("아직 등록된 선수가 존재하지 않습니다");
			System.out.println("새로운 선수를 추가해주십시오");
			System.out.println("============================");
		}
	}
	
	private void addFootballPlayer() {
		// 여기서 해야할 일은?
		// View가 해야할 일
		// 1. 사용자의 입력값 받기
		// 2. 모델에서 만든 값 출력하기
		
		// 무슨 값을 입력받아야 하지?
		// 축구선수를 만들 수 있는 값들 
		// 선수이름 : String, 포지션 : String, 등번호 : Integer
		System.out.println();
		System.out.println("선수의 이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("선수의 포지션을 입력해주세요");
		String position = sc.nextLine();
		System.out.println("선수의 등번호를 입력해주세요");
		int backNumber = 0;
		try {
			backNumber = sc.nextInt();
			sc.nextLine();			
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("등 번호는 숫자만 입력 가능합니다.");
			return;
		}
		
		// 1. int가 짧으니까
		// 2. Integer는 정수값이 아닌게 들어올 수 있으니까
		// 3. 서비스단에서의 검증이 null인지도 체크를 해야하고 + 음수가 아닌지도 체크를 해야함
		
		// 사용자의 입력값 받기 끝! -> 뷰가 할일 1절 끝
		// case 1 ) 100% 성공이니까 걍 추가하고 끝내기
		// case 2 ) 성공 / 실패 여부를 판별해서 성공했다 실패했다 출력해주기
		// case 3 ) 추가 성공시 추가된 데이터를 출력해주기 / 실패시에는 실패했다 말해주기
		
		// 3개의 값을 넘기는게 너무 번거로움
		// 1. FootballPlayer VO탈락 --> 생성자 인자값 부족
		// 2. ArrayList O          --> 인덱스를 알아야함
		// 3. HashMap			   --> <String, Object>
		// 4. Object[] O 		   --> 이거 쓸바엔 리스트 씀
		// fc.addFootballPlayer(name, position, backNumber);
		
		// fc.addFootballPlayer(new FootballPlayerDto(name, position, backNumber));
		FootballPlayer fp = fc.addFootballPlayer(
				new FootballPlayerDto(name, position, backNumber)
										);
		// 성공 / 실패여부 판별 한 뒤
		// 각각 맞는 출력문 생성
		if(fp != null) {
			selectAll();
		} else {
			System.out.println("선수등록에 실패했습니다");
			System.out.println("관리자에게 문의하세요");
		}	
	}
	
	private void updateFootballPlayer() {
		// 이름만 바꾸는 기능
		// 포지션만 바꾸는 기능
		// 등번호만 바꾸는 이름
		
		// 이름하고 포지션만 바꾸는 기능
		// 이름하고 등번호만 바꾸는 기능
		// 포지션과 등번호만 바꾸는 기능
		
		// 이름과 포지션과 등번호를 바꾸는 기능 <- 선택
		
		// 선수를 어떻게 식별할 것인가?
		// 이름이 일치하면
		// 포지션이 일치하면
		// 등번호가 일치하면
		
		// 이름과 포지션이 일치하면
		// 포지션과 등번호가 일치하면
		// 이름과 등번호가 일치하면
		
		// 이름과 포지션과 등번호가 일치하면
		// ID값이 일치하면 <- 선택
		
		selectAll();
		System.out.println("어떤 선수의 정보를 갱신하시겠습니까?");
		System.out.print("선수의 아이디를 숫자로 입력해주세요 > ");
		
		// 1. 아이디
		// 2. 이름, 포지션, 등번호
		
		try {
			int id = Integer.parseInt(sc.nextLine());
			
			// 1. 입력받은 ID값을 가지고 서비스까지 가서 ID가있는디 확인
			//	  있으면 아래 코드 수행 없으면 return해버리기
			
			// 1_1) 이미 우리는 축구선수주소 가지고있는 List의 주소를 반환받는
			//		메소드를 구현 -> Service
			//		Service메소드를 호출해서 반환받아서 여기서 검사
			// 1_2) ID값을 들고 서비스까지 가서 서비스에 검증 로직 작성
			// 		아이디가 있나 없나 검증하는 코드
			//		-> 2번
			boolean result = fc.idCheck(id);
			if(!result) {
				System.out.println("존재하지 않는 아이디입니다");
				return;
			}
			
			
			
			// 2. 입력받은 ID값이 있던지 없던지 그냥 다 받아버리기
			// 	  그리고 서비스까지 가서 있는지 없는지 판별 후 작업 수행
			
			
			// 오답은 명확하게 존재
			// 정답은 없음 하지만 BestPratice는 있음
			System.out.print("변경하실 이름을 입력해주세요 > ");
			String name = sc.nextLine();
			System.out.print("변경하실 포지션을 입력해주세요 > ");
			String position = sc.nextLine();
			System.out.print("변경하실 등 번호를 입력해주세요");
			int backNumber = sc.nextInt();
			
			// 세개 받은내용
			// Update시 새로운 FootballPlayer를 만들어서 넣어주어야하는데
			// ID값을 기존의 ID값으로 유지할 것인가
			//		 새로운 ID값으로 만들어서 넣어줄 것인가
			fc.updateFootballPlayer(id, new FootballPlayerDto(name, position, backNumber));
			
			
			
			
			
			
		} catch(NumberFormatException e) {
			System.out.println("올바른 값을 입력해주세요");
			System.out.println("메인 메뉴로 돌아갑니다");
			return;
		}
	}
	
	private void deleteFootballPlayer() {
		
		System.out.println();
		System.out.println("등록된 축구선수를 해지하겠습니다.");
		selectAll();
		System.out.print("어떤 선수를 해지하겠습니까? > ");
		int id = 0;
		
		try {
			id = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			System.out.println("아이디값은 숫자만 입력 가능합니다.");
			sc.nextLine();
			return;
		}
		// 우리가 선수삭제에서 해야할 작업
		
		// 사용자가 -1 <-- 유효성검증
		// 구현하는 방식
		// 1. id를 들고가서 index를 가져와서 index를 전달해서 한번에 리무브
		// id를 들고가서 서비스에서 반복을 돌려서 찾아서 리무브
		String result = fc.deleteFootballPlayer(id);
		
		if(result != null) {
			System.out.println(result + "선수의 정보가 삭제되었습니다.");
		} else {
			System.out.println("id를 찾을 수 없습니다.");
		}		
	}
	
	private void findFootballPlayer() {
		
		System.out.println("선수 검색 서비스입니다.");
		// 사용자에게 이름을 받아서
		// 똑같은 이름의 선수 다 찾기
		// 입력값이 이름에 포함되어있는 선수 찾기
		System.out.print("찾고싶은 이름의 키워드를 입력해주세요 > ");
		String keyword = sc.nextLine();
		// 일단 View가 할 일이 끝났구나~
		// 컨트롤러레게 요청
		List<FootballPlayer> players = fc.findByKeyword(keyword);
		// 응답이 돌아온 상황
		// 검색 결과가 있을수도 / 없을수도 있음
		// 검색 결과가 한개일수도 / 백개일수도 있음
		
		if(players.isEmpty()) {
			System.out.println("=====================");
			System.out.println("검색결과가 존재하지 않습니다");			
			System.out.println("=====================");
		} else {
			System.out.println();
			System.out.println(keyword + "검색결과입니다.");
			for(FootballPlayer player : players) {
				System.out.println("이름 : " + player.getName()
								   + ", 포지션 : " + player.getPosition()
								   + ", 등번호 : " + player.getBackNmber());
			}
			System.out.println();
		}
		
		
	}
	
	
	
}




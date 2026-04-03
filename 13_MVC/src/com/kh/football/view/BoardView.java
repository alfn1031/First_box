package com.kh.football.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.football.controller.BoardController;
import com.kh.football.functional.model.dto.BoardDto;
import com.kh.football.model.vo.Board;

public class BoardView {
	private BoardController bc = new BoardController();
	private Scanner sc = new Scanner(System.in);
	
	
	public void boardMenu() {
		while(true) {
			System.out.println("\n\n\n\n\n");
			System.out.println();
			System.out.println("축구이야기 게시판입니다");
			System.out.println("게시글 상세보기");
			System.out.println("2. 게시글 작성");
			System.out.println("3. 게시글 수정");
			System.out.println("4. 게시글 삭제");
			System.out.println("5. 축구메뉴로 돌아가기");
			System.out.println();
			System.out.print("원하시는 메뉴를 선택해주세요 > ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" : findById(); break;
			case "2" : saveBoard();break;
			case "3" : updateBoard(); break;
			case "4" : deleteBoard(); break;
			case "5" : sc.close(); return;
			default : System.out.println("메뉴를 다시 선택해주세요");
			}
		}
		
	}
	
	private void findAll() {
		List<Board> boards = bc.findAll();
		
		if(boards.isEmpty()) {
			System.out.println("=======================");
			System.out.println("게시글이 존재하지 않습니다.");
			System.out.println("첫 글을 작성해 보십시오");
			System.out.println("=======================");
		} else {
			System.out.println("게시글 목록 : ");
			System.out.println("------------------------------------");
			for(Board board : boards) {
				System.out.println(board.getBoardNo() + "   ||   "
								 + board.getBoardTitle() + "   ||   "
								 + board.getBoardWriter() + "   ||   "
								 + board.getCreateDate());
			}
			System.out.println("------------------------------------");
		}
		
	}
	private void findById() {
		findAll();
		System.out.println("상세보기를 하실 게시글 번호를 입력해주세요.");
		int boardNo = 0;
		
		try {
			boardNo = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			System.out.println("게시글 번호는 숫자만 입력 가능합니다.");
			sc.nextLine();
			return;
		}
		Board board = bc.findById(boardNo);
		
		// 사용자가 입력한 게시글 번호
		// 경우의 수
		// -1, -2, -3...
		// 0
		// 1, 2, 3...
		while(true) {
			if(board != null) {
				// 게시글 상세정보 출력
				System.out.println("---------------------------------");
				System.out.println(boardNo + "번 게시글");
				System.out.println();
				System.out.println("제목 : ");
				System.out.println(board.getBoardTitle());
				System.out.println("---------------------------------");
				System.out.println("본문 : ");
				System.out.println(board.getBoardContent());
				System.out.println();
				System.out.println("----------------------------------");
				System.out.println("작성자 : " + board.getBoardWriter()
								 + " | 작성일 : " + board.getCreateDate());
				System.out.println("----------------------------------");
			} else {
				// board를 아예 참조를 안해버리기
				System.out.println("존재하지 않는 게시글 번호입니다.");
			}
			
			System.out.println("메뉴로 돌아가시려면 돌아가기를 입력하세요");
			String exit = sc.nextLine();
			
			if("돌아가기".equals(exit)) {
				break;
			}
			
		}
	
	}		
	private void saveBoard() {
		System.out.println("게시글 작성서비스입니다.");
		System.out.println("게시글의 제목을 입력해주세요");
		String title = sc.nextLine();
		System.out.println("게시글의 내용을 입력해주세요");
		String content = sc.nextLine();
		System.out.println("게시글의 작성자를 입력해주세요");
		String writer = sc.nextLine();
		System.out.println("게시글의 비밀번호를 입력해주세요");
		String passward = sc.nextLine();
		
		bc.saveBoard(new BoardDto(title, content, writer, passward));
		
	}
		
	private void updateBoard() {
		findAll();
		System.out.println("게시글 수정 서비스입니다");
		System.out.println("수정하실 게시글 번호를 입력해주세요");
		int boardNo = 0;
		try {
			boardNo = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			System.out.println("게시글 번호는 숫자만 가능합니다");
			sc.nextLine();
			return;
		}
		
		Board b = bc.findById(boardNo);
		
		if(b != null) {
			System.out.print("게시글 작성자를 입력해주세요 > ");
			String writer = sc.nextLine();
			System.out.print("게시글의 비밀번호를 입력해주세요 > ");
			String passward = sc.nextLine();
			System.out.print("수정할 제목을 입력해주세요 > ");
			String title = sc.nextLine();
			System.out.print("수정할 낸용을 입력해주세요 > ");
			String content = sc.nextLine();
			
			Board updateBoard = bc.updateBoard(boardNo,
											  new BoardDto(title,
													  	   content,
													  	   writer,
													  	   passward));
			if(updateBoard != null) {
				System.out.println("---------------------------------");
				System.out.println(boardNo + "번 게시글");
				System.out.println();
				System.out.println("제목 : ");
				System.out.println(updateBoard.getBoardTitle());
				System.out.println("---------------------------------");
				System.out.println("본문 : ");
				System.out.println(updateBoard.getBoardContent());
				System.out.println();
				System.out.println("----------------------------------");
				System.out.println("작성자 : " + updateBoard.getBoardWriter()
								 + " | 작성일 : " + updateBoard.getCreateDate());
				System.out.println("----------------------------------");
			} else {
				// board를 아예 참조를 안해버리기
				System.out.println("존재하지 않는 게시글 번호입니다.");
			}
			
			System.out.println("메뉴로 돌아가시려면 돌아가기를 입력하세요");
			String exit = sc.nextLine();
			
			if("돌아가기".equals(exit)) {
				return;
			}
			
			
		} else {
			System.out.println("존재하지않는 게시글입니다.");
		}
		
	}
	
	private void deleteBoard() {
		findAll();
		System.out.print("삭제할 게시글 번호를 입력해주세요 > ");
		int boardNo = 0;
		try {
			boardNo = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			System.out.println("게시글 번호는 숫자만 입력할 수 있습니다");
			sc.nextLine();
			return;
		}
		int result = bc.deleteBoard(boardNo);
		if(result > 0) {
			System.out.println("게시글 삭제에 성공했습니다");
		} else {
			System.out.println("게시글 삭제에 실패했습니다");
		}
		
		
		
	}
		
	
	
}

package com.kh.football.model.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kh.football.functional.model.dto.BoardDto;
import com.kh.football.model.vo.Board;

public class BoardService {
	private List<Board> boards = new ArrayList();
	private int id;
	 
	{
		boards.add(new Board(++id, "첫 글입니다", "재.밌.다!", "관리자", "1234",
				  new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
		boards.add(new Board(++id, "또 글입니다", "재.미.가.있.다!", "관리자", "4321",
				  new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
		
	}

	public List<Board> findAll() {
		return boards;
	

	/*
	public Board findById(int boardNo) {
		if(boards.get(0).getBoardNo() == boardNo) {
			return boards.get(0);
		}
		if(boards.get(1).getBoardNo() == boardNo) {
			return boards.get(1);
		}
		if(Board board : boards) {
			if(board.getBoardNo() == boardNo) {
				return board;
			}
		}
		*/
		
	
		
	}

	public Board findById(int boardNo) {
		return boards.stream()
				.filter(b -> b.getBoardNo() == boardNo)
				.findFirst()
				.orElse(null);
	}
	
	public void saveBoard(BoardDto board) {
		
		boards.add(new Board(++id, board.getBoardTitle(),
								   board.getBoardContent(),
								   board.getBoardWriter(),
								   board.getPassward(),
								   new SimpleDateFormat("yyyy-MM-dd")
								   .format(new Date())));
		
		
	}
	
	public Board updateBoard(int boardNo, BoardDto board) {
		
		int index = 0;
		for(int i = 0; i < boards.size(); i++) {
			if(boards.get(0).getBoardNo() == boardNo) {
				index = 1;
			}
		}
		Board b = boards.get(index);
		if(b.getBoardWriter().equals(board.getBoardWriter())
		 && b.getPassward().equals(board.getPassward())) {
			boards.set(index, new Board(boardNo,
									   board.getBoardTitle(),
									   board.getBoardContent(),
									   b.getBoardWriter(),
									   b.getPassward(),
									   b.getCreateDate()));
			return boards.get(index);
		}
		return null;
	}
	
	public int deleteBoard(int boardNo) {
		
		if(boardNo < 0) {
			return 0;
		}
		int index = -1;
		for(int i = 0; i < boards.size(); i++) {
			if(boards.get(i).getBoardNo() == boardNo) {
				index = i;
				break;
			}
		}
		if(index > -1) {
			boards.remove(index);
			return 1;
		}
		return 0;
	}
}

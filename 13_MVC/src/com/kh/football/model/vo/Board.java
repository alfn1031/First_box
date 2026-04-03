package com.kh.football.model.vo;

import java.util.Date;

public class Board {
	private int boardNo;			// 각 게시글을 식별
	private String boardTitle;		// 게시그 제목을 저장할 필드
	private String boardContent;	// 게시글 내용을 저장할 필드
	private String boardWriter;		// 게시글 작성자를 저장할 필드
	private String passward; 		// 게시글 작성 시 비밀번호를 저장할 필드
	private String createDate;		// 게시글 날짜를 저장할 필드
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter, String passward,
			String createDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.passward = passward;
		this.createDate = createDate;
	}
	public Board() {
		super();
	}
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWriter=" + boardWriter + ", passward=" + passward + ", createDate=" + createDate + "]";
	}
	
}
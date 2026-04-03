package com.kh.football.functional.model.dto;

public class BoardDto {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private String passward;
	private String createDate;
	public BoardDto(String boardTitle, String boardContent, String boarsWriter, String passward) {
		super();
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boarsWriter;
		this.passward = passward;
	}
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
	public void setBoardWriter(String boarsWriter) {
		this.boardWriter = boarsWriter;
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
	
}
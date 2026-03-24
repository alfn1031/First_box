package com.kh.chap02.model.vo;
//부모클래스	자식클래스
//슈퍼클래스	서브클래스
//상위클래스	하위클래스
//조상클래스	후손클래스
//확장클래스	파생클래스
public class AosGame extends Game {
	private int characterCount;

	public AosGame() {
		// super(); // Game();
		System.out.println("나는 자식클래스다");
	}

	public AosGame(int characterCount) {
		this.characterCount = characterCount;
	}

	public int getCharacterCount() {
		return characterCount;
	}

	public void setCharacterCount(int characterCount) {
		this.characterCount = characterCount;
	}

}

package com.kh.chap03.model.vo;

public class NateWebtoon { // 우리 눈에는 보이지 않음 extends Object
						   // Object -> 모든 클래스의 상위 클래스
	
	private String title;
	private String author;
	
	public NateWebtoon() {
		super();
	}
	public NateWebtoon(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// Alt + Shift + s -> Alt + s -> Alt + g
	/*
	 * Overriding
	 * 
	 * - 자식클래스에서 상속받고있는 부모클래스의 메소드를 재정의(다시씀)하는 것
	 * - 자식클래스에 존재하는 오버라이딩 된 메소드가 우선권을 가져서 호출됨
	 * 
	 *  오버라이딩 성립 조건!
	 *  
	 *  1. 부모클래스의 메소드랑 메소드명이 동일
	 *  2. 매개변수가 똑같아야함(자료형, 개수, 순서)
	 *  3. 반환형
	 *  4. 부모메소드의 접근제한자보다 공유범위가 같거나 넓어야함
	 *  
	 *  -- 개발자들끼리의 암묵적인 약속 : 오버라이딩한 메소드에는 반드시 @Override 애노테이션을 붙여주자
	 *  
	 *  애노테이션이 존재하지 않더라도 오버라이딩을 구현하는대 문제가 없ㅇㅁ
	 *  
	 *  1. 누가봐도 오버라이딩인줄 알게하자
	 *  2. 실수를 줄일 수 있음
	 */
	@Override
	public String toString() {
		return "NateWebtoon [title=" + title + ", author=" + author + "]";
	}
	
	
}

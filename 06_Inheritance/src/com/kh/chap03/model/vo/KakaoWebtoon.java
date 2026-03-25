package com.kh.chap03.model.vo;

public class KakaoWebtoon extends Webtoon {
	
	private boolean free;
	
	public KakaoWebtoon() {}
	public KakaoWebtoon(String title, String author, String day, boolean free) {
		super(title, author, day);
		this.free = free;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}
	
}

package com.kh.chap03.model.vo;

public class SaladChef extends Chef{
	public SaladChef(String name) {
		super(name);
	}
	@Override
	public void cooking() {
		System.out.println("샐러드 만듭니다~");
	}

}

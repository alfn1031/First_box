package com.kh.chap01.model.vo;

import java.util.Iterator;

public class Child2 extends Parent {
	private int z;

	public Child2() {}
	public Child2(int z) {
		super();
		this.z = z;
	}
	public void printChild2() {
		System.out.println("자식클래스 2 메소드입니다");
	}
	@Override
	public void print() {
		System.out.println("Child2클래스 print메소드");
		
		// Sout
		// sout
		// syout + ctrl + space
	}
}

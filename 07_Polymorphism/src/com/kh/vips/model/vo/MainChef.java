package com.kh.vips.model.vo;

public class MainChef {
	private String name;

	public MainChef(String name) {
		super();
		this.name = name;
	}
	public void beefCooking() {
		System.out.println(name + " 고기 요리합니다!");
	}
	public void breakTime() {
		System.out.println(name + "쉬는시간!");
	}
}

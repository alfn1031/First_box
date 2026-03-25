package com.kh.chap03.controller;

public class Pasta extends Cooking {
	
	private void pastaCooking() {
		System.out.println("파스타 요리해야지~");
	}
	private void boilingWater() {
		System.out.println("물을 끓이고 소금, 오일을 넣자");
	}
	private void fire() {
		System.out.println("불을 키고 팬에 볶는다");
	}
	
	@Override
	public void cooking() {
		pastaCooking();
		boilingWater();
		fire();
  }
	
	
	
}
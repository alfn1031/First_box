package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.Box;
import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("하하");
		list.add("123");
		list.add("true");
		
		// 꺼낼때 불편함
//		String text = (String)list.get(0);
//		String text2 = (String)list.get(1);
//		List<String> list = new ArrayList();
//		// <제네릭> 타입을 지정해서 컴파일 시점에 체크하는것
//		list.add("하하");
//		list.add("123");
//		String str = list.get(0);
		/*
		StringBox sb = new StringBox();
		sb.set("하하");
		System.out.println(sb.get());
		IntegerBox ib = new IntegerBox();
		System.out.println(ib.get());
		*/
		Box<String> sb = new Box();		
		sb.set("하하");
		System.out.println(sb.get());		
		Box<Plant> pb = new Box();
		pb.set(new Plant("금전수", "동양화"));
		System.out.println(pb.get());
		
		// 개발자들의 암묵적인 약속
		// E -> Element -> 요소로 사용할 땐 E로 적자
		// T -> Type    -> 아무타입이나 OK!
		// K -> Key 	-> Map의 Key타입
		// V -> Value 	-> Map의 Value값
		// N -> Number 	-> 숫자타입
		// R -> Return 	-> 반환타입
		
		List<Plant> plants = new ArrayList();
		// plants.add("식물 시작");
		plants.add(new Plant("관엽", "폴리샤스"));
		plants.add(new Plant("관엽", "산세베리아"));
		
		Plant p = plants.get(0);
		
		for(Plant plant : plants) {
			System.out.println(plants);
		}
		// 1. 다룰 요소의 타입을 제한 할 수 있음 -> 실수를 줄일 수 있음
		// 2. 매번 형변환하는 잘차를 없앨 수 있음 -> 코드 작성할 때 편함
		
	}


}

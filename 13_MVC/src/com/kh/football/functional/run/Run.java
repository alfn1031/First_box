package com.kh.football.functional.run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.kh.football.functional.model.dto.Material;
import com.kh.football.functional.model.service.BinFilter;

public class Run {

	public static void main(String[] args) {
		List<Material> bin = new ArrayList<Material>(List.of(
											new Material("건두부", 1000, "흰색"),
											new Material("새우완자", 3000, "빨간색"),
											new Material("청경채", 1500, "초록색"),
											new Material("분모자", 4000, "흰색"),
											new Material("소고기", 10000, "빨간색"),
											new Material("옥수수면", 3500, "노란색")
											));
									
		// 마라탕 재료가 너무 많으니 필터로 좀 걸러내기
		
		// 익명클래스
		
		BinFilter greenFilter = m -> m.getColor().equals("초록색");
		
		for(Material m : bin) {
			if(greenFilter.test(m)) {
				System.out.println(m.getName());
			}
		}
		
		BinFilter expensiveFilter = m -> m.getPrice() >= 3500;
		
		for(Material m : bin) {
			if(expensiveFilter.test(m)) {
				System.out.println(m.getName());
			}
		}
		
		
		Predicate<Material> isRed = m -> m.getColor().equals("빨간색");
		for(Material m : bin) {
			if(isRed.test(m)) {
				System.out.println(m.getName());
			}
		}
		
		// Function<T, R> - 변환 T(타입 아무거나) -> R(리턴타입)
		// 재료 객체를 받아서 재료객체의 이름을 반환
		Function<Material, String> getName = m -> m.getName();
		
		System.out.println(getName.apply(new Material("돼지고기", 5000, "빨간색")));
		
		// Consumer<T> - 소비 T(타입 아무거나) -> void
		Consumer<Material> print = m -> System.out.println(m.getName());
		print.accept(new Material("양고기", 8000, "빨간색"));
		
		// Supplier<T> - 공급
		Supplier<Material> defaultM = () -> new Material("닭고기", 4000, "빨간색");
		Material chicken = defaultM.get();
		
		List<Material> reds = new ArrayList();
		for(int i = 0; i < bin.size(); i++) {
			reds.add(bin.get(i));
		}
		System.out.println(reds);
		
		List<Material> red = bin.stream().filter(m -> m.getColor().equals("빨간색")).collect(Collectors.toList());
		
		System.out.println(red);
		
		// 재료들이 많아 이름만 사용
		List<String> names = new ArrayList();
		for(int i = 0; i < bin.size(); i++) {
			names.add(bin.get(i).getName());
		}
		System.out.println(names);
		
		List<String> name = bin.stream().map(m -> m.getName()).collect(Collectors.toList());
		System.out.println(name);
		
		List<String> colors = bin.stream().map(m -> m.getName()).collect(Collectors.toList());
		System.out.println(colors);
		
		
		
		
		
		
	}
	
}

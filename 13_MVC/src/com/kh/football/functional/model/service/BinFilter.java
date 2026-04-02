package com.kh.football.functional.model.service;

import com.kh.football.functional.model.dto.Material;

@FunctionalInterface // 이 인터페이스는 함수형이야 람다 쓸거야
public interface BinFilter {
	boolean test(Material m);

}

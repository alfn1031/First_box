package com.kh.run;

import java.util.Scanner;

import com.kh.controller.CheckedException;
import com.kh.controller.UncheckedExeption;

public class Run {

	public static void main(String[] args) {
		/*
		 * 에러(Error) == Bug
		 * 
		 * - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러
		 * 				-> (심각) 소스코드로 해결이 안됨
		 * 
		 * - 컴파일 에러 : 프로그램 실행 전 소스코드 상에서 문법적인 문제로 발생하는 에러
		 * 				-> 소스코드를 수정해서 해결 가능(빨간 줄로 알려줌)
		 * 
		 * - 런타임 에러 : 프로그램 실행 중 발생하는 에러, 문법적으로는 문제가 없음
		 * 				-> 사용자가 개발자가 의도한대로 입력값을 넣어주지 않을 가능성이 높지만...?
		 * 				-> 개발자가 이러한 상황을 미리 예측해서 처리해주어야함
		 * 
		 * - 로지컬 에러 : 소스코드 상 문제 없음, 실행했을 때도 문제없이 잘 돌아감 
		 * 				-> 의도와는 다르게 동작
		 * 
		 * 예외(Exception) : 시스템 에러를 제외한 나머지 컴파일, 런타임, 로지컬 에러와 같이 비교적 심각한 애들
		 * 		 그중에서도 주로 런타임 에러를 의미함
		 */
		UncheckedExeption ue = new UncheckedExeption();
		// ue.divZero();
		// ue.code();
		// ue.multiCatch();
		// ue.orderByCatch();
		
		
		
		
		CheckedException ce = new CheckedException();
		ce.readString();
		
	}
	
	
	
	
	
	
	
	
}
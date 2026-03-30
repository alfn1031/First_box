package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {
		// Wrap
		// -> 기본자료형을 참조자료형으로 포장해주는 클래스를 뢔퍼클래스라고 함
		/*
		 * 기본자료형				wrapper Class
		 * 			<------->
		 * boolean				Boolean
		 * char					Character
		 * byte					Byte
		 * short				Short
		 * int					Integer
		 * long					Long
		 * float				Float
		 * double				Double
		 * 				
		 * 				易(쉬울 이)
		 */
		
		// int a = 1;
		// String str = "a";
		// str.eqauls(a);
		
		// 기본자료형을 객채로 취급해야하는경우
		// 다형성을 적용해야하는경우
		// 매개변수 자료형이 기본자료형은 못받는경우
		// ----- 일반적으로 이론적으로 하는 이야기
		
//		ReplyInfo ri = new ReplyInfo();
//		int count = ri.getReviewCount();
		
		
		
		int num1 = 10;
		int num2 = 15;
		/*
		Integer i1 = new Integer(num1);
		System.out.println(i1);
		*/
		Integer i1 = num1;
		Integer i2 = num2;
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// a.comparaTo(b);
		// a가 b보다 크면 1을 반환
		// a가 b보다 작으면 -1을 반환
		// 같으면 0을 반환
		
		
		String str1 = "11";
		String str2 = "1.1";
		System.out.println(str1 + str2);
		
		// (int)str1;
		// 파싱{parsing) == 특정 데이터를 규칙에 따라 분석하고 해석하는 과정
		
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		// 해당Wrapper클래스이름.parseXXX(데이터)
		
		System.out.println(i + d);
		
		String intNum = String.valueOf(i);
		
		
		

	}

}

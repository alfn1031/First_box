package com.kh.controller;

import com.kh.run.Run;

public class StringController {

	// String 클래스 -> 불변(변하지 않음을 의미)
	
	public void method1() {
		// String abc = "6454851468546515416641564165415684156841568416584165841654186548165416415641564";
		String str1 = new String("hello");
		String str2 = new String("hello");
		Run run = new Run();
		System.out.println(str1);
		System.out.println(run);
		System.out.println(str2.toString());
		// 1. String 클래스의 toString()의 경우
		// 실제 담겨있는 문자열 vulue값을 반환하게끔 오버라이딩
		
		// equals()
		System.out.println(str1.equals(str2));
		Run run2 = new Run();
		System.out.println(run.equals(run2));
		// 2. 문자열 value를 비교하도록 오버라이딩
		
		
		// hashcode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		// 3. 주속밧을 해싱하는 것이 아니라 실제 담긴 문자열값을 기반으로 해싱을 돌리도록 오버라이딩
		
		// System.identityHashCode(참조형변수);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2);
		
	}
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
		// toString()
		System.out.println(str1);
		System.out.println(str2);
		// eqauls()
		System.out.println(str1.equals(str2));
		// hashcode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(str1 == str2);
	}
	
	public void method3() {
		// 어찌하여 이 둘은 다른가?
		String str1 = new String("hello"); // 절대 금지 문법
		String str2 = "hello";			   // 절대 허용 문법
		
		// 문자열 리터럴은 대입연산자를 사용해 대입할 때
		// String Pool(heap) 영역에 등록됨
		// StringPool : 동일한 내용의 문자열 value가 존재할 수 없음
		
		System.out.println(System.identityHashCode(str2));
		str2 += "bye";
		System.out.println(System.identityHashCode(str2));
		System.out.println(str2);
	}
	
	public void method4() {
		
		StringBuffer sb = new StringBuffer();
		String str = "Hello" + "World";
		sb.append("Hello");
		sb.append("World");
		System.out.println(sb);
		
		//  문자열임시저장공간
		// 문자열이 불변객채라서 내용물 변경이 일어나면 계소 새로운 공간을 할당해서 올릴것
		// 이를 해결하기 위해 임시공간(Buffer)를 준비해서 임시공간에 차곡차곡 담았다가 한번에 처리하는 클래스
		
		StringBuffer sr = new StringBuffer();
		sr.append("Hello");
		sr.append("World");
		System.out.println(sr);
		// 동시제어기능(Thread-Safe)
		// Thread t;
		// Tomcat, Jetty -> 서버들에서 제공이 많이 되고있음
		// 충돌나겠다!가 아니라면 굳이 구현할 필요가 없음
	}
	
	public void method5() {
		
		String str1 = "은총알은 없다";
		// 1. 문자열.length()
		// 문자열의 길이를 반환
		System.out.println("str1의길이 : " + str1.length());
		
		String userId = "asjdha";
		// 아이디 8`20wk
		if(8 <= userId.length() && userId.length() <= 20) {
			throw new RuntimeException("아이디 글자수 뭐시깽이~");
		} 
		
		// 2. 문자열.charAt() : char
		char ch = userId.charAt(0);
		System.out.println(ch);
		
		String phoneNumber = "010-1234-5678";
		// 3. 문자열.substring(int beginindex) : String
		System.out.println(phoneNumber.substring(4));
		System.out.println(phoneNumber.substring(4, 9));
		
		// 4. 문자열.indexOf(String) : int
		//								"은총알은 없다"
		System.out.println(str1.indexOf("없다"));
		
		// kim@kh.co.kr
		String[] emails = {"homg@kh.co.kr", "kim@kh.co.kr", "lee@kh.co.kr", "haho@kh.co.kr"};
//		System.out.println(emails[0].substring(0, 4));
//		System.out.println(emails[1].substring(0, 3));
		for(int i =0; i < emails.length; i++) {
			System.out.println(emails[i].substring(0, emails[i].indexOf("@")));
		}
		
		String fileName = "asdasd.jpg";
		System.out.println(fileName.substring(fileName.indexOf(".") + 1));
		
		String fileName2 = "sd.sdf.sdf.sdf.sdf.sdf.png";
		System.out.println(fileName2.substring(fileName2.lastIndexOf(".")));
		
		// 문자열.toCharArray() : char[]
		String str2 = "배열로만들문자열";
		char[] chArr = str2.toCharArray();
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		for(char c : chArr) {
			System.out.println(c);
		}
		new String(chArr).chars().mapToObj(c ->(char)c).forEach(System.out::println);
		System.out.println(String.valueOf(chArr));
		
	}
	
	
	
	
	
	
	
}

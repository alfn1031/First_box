package com.kh.chap02.encapsulation.model.vo;


// 필드부, 생성자부, 메소드부
public class AutoSellingMachine { // 단 한개의 제품을 파는 자판기
	//필드(Field)부
	/*
	 * 객체가 가질 수 있는 속성을 기술하는 부분
	 * 
	 * 값을 담는 부분
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 객체들이 가져야할 공통적인 속성을 기술해 놓는 것
	 * 
	 * 접근제한자 자료형 필드식별자;
	 */
	
	 /*
	  * + 업무에 대한 도메인 지식 @@@@@
	  * 
	  * AI -> 회계법인 개발자 -> 금융관련 지식, 법률관련 지식, 회계 업계가 어떻게 돌아가는가, 히계사들이 현재 사용하고았는 프로그램
	  * 
	  * 주말 숙제 : 어떤 분야 개발자 할지 정해오기, 관련부야 지식, 자격증 뭘 준비해야 할지 알아오기
	  */
	// 자판기 == 제품이름, 제품가격, 수량
	public String name;
	public int price;
	public int amount;
	
	/*
	public void hi() {
		System.out.println("하이");
	}
	*/
	// Dependency(의존) @@@
	
	private void checkAmount() {
		System.out.println("재고는 총 " + amount + "개 입니다.");
	}
	
	private void sellingProduct() {
		amount -= 1;
	}
	
	private void insertAmount() {
		amount += 3;
	}
	
	public void openMachine() {
		checkAmount();
		insertAmount();
		sellingProduct();
		checkAmount();
	}
	
	// 객체의 속성 값을 기록 및 수정하는 기능의 메소드 : setter()
	/*
	 * VO -> setter메소드를 구현하지 않음
	 * DTO -> setter를 구현해서 
	 * 
	 * DTO를 배우려면 짧게잡아도 한 달 반정도는 더 수업을 해야함
	 * 그래서 DTo배울 떄까지만 VO에 setter를 구현해서 사용하겠음
	 * 
	 * setter만들기 규칙
	 * 
	 * 1. setter메소드는 외부에서 접근이 가능해야하기 때문에 접근제한자 public을 이용
	 * 2. set필드명으로 식별자를 작성하여 낙타봉표기법(camelCase)를 꼭 지키도록한다.
	 */
	
	// 하나의 메소드는 하나의 기능만을 수행해야한다 @@
	
	// price필드 값을 set할수있는 메소드 구현
	public void setPrice(int price) {
						// parameter, 매개변수
						// 매게변수는 메소드 호출시 초기화가 진행됨 @암기
		
		System.out.println(price);
		// 메모리 구조의 대한 이해
		// price = price;
		// Scope안에서는 해당 영역안에있는 지역변수가 식별자 우선권을 가진다
		System.out.println("내 주소가 뭐지 : " + this);
		// this : 해당 객체의 주소값을 가리키는 역할
		
		if(price > 0) {
			System.out.println(price + "원으로 설정되었습니다.");
		} else {
			System.out.println("가격은 0원 이하로 설정 할 수 없습니다.");
		}
			this.price = price;
		this.price = price;
		
		
	} 
	
	// name 필드를 기록 및 수정할 수 있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	//amount 필드를 기록 및 수정할 수 있는 메소드
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	// 데이터를 반환해주는 기능의 메소드 getter() -> 꼭 있어야함!!
	/*
	 * 규칙!!!
	 * 
	 * 1. getter()는 접근제한자 public을 사용한다.
	 * 2. get필드명으로 짓되, 낙타봉표기법(camelCase)를 사용한다
	 * 3. VO패키지안에 존재하는 클래스라면 getter는 무조건 꼬 절대로 다 만드세요!!!
	 */

	// 메소드를 호출한 값으로 name필드값을 돌려주고 싶음
	public String getName() {
		return name;
		
	}
	
	public int getAmount() {
		return amount;
	}

	public int getPrice() {
		return price;
	}

	// 필드의 접근제한자를 prvate로 변경한뒤
	// 각각의 필드들에 대한 getter() / setter()를 구현하면
	// 캡슐화가 끝났다
	/*
	 * 1. 값을 숨긴다 -> 필드의 접근제한자를 pprivate로 선언
	 * 
	 * 2. 메소드를 통해 필드에 접근할수 있게 만든다 -> getter() / setter()선언
	 * 
	 * 3. 
	 */

	
	public String info() {
		String info = "자판기 = [제품명 :  " + name + " , 가격 : " + price + ", 재고 :  + amount + ]";
		return info;
	}






}
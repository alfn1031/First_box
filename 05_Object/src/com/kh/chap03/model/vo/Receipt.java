package com.kh.chap03.model.vo;

public class Receipt {
	// 가격, 결제방법, 상점명
	
	// 필드부
	private int price;
	private String payment;
	private String storeName;
	private String date;
	
	// 생성자부
	
	// 메소드부
	// getter() / setter() / info()
	
	public int getPrice() {
		return price;
	}
	public String getPayment() {
		return payment;
	}
	public String getDate() {
		return date;
	}
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	
	
	
	// info()
	public String info() {
		String info = "상품명 : " + storeName
								+ ", 금액 : " + price
								+ ", 결제수단 : " + payment
								+ ",결제일시 :  " + date;
		return info;
	}
	
	
	
	
	
	

}

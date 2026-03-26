package com.kh.chap05.model.vo;

public class Soup {
	private String name;
	private String mainmenu;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMainMenu() {
		return mainmenu;
	}
	public void setMainMenu(String mainMenu) {
		this.mainmenu = mainMenu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Soup(String name, String mainMenu, int price) {
		super();
		this.name = name;
		this.mainmenu = mainMenu;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Soup [name=" + name + ", mainManu=" + mainmenu + ", price=" + price + "]";
	}
	
	

}

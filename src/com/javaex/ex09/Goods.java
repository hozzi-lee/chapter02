package com.javaex.ex09;

public class Goods {

	// 필드
	private String name;
	private int price;
//	private int count;
	private static int count = 0;


	// 생성자
	public Goods() {
		this.count++;
	}

	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		this.count++;
	}


	// 메소드 게터/세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	// 메소드 일반
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("전상품 재고: " + count);
		System.out.println("==========================");
	}


}

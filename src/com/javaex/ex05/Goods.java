package com.javaex.ex05;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() { // Goods를 메모리(힙)에 올리는거
		// default 생성자 - 코딩하지 않아도 자동으로 생성됨
		// 다른 생성자를 코딩하면 default생성자는 자동 생성 안됨
	}

	public Goods(String name, int price) { // Goods(vV)를 메모리(힙)에 올리는거
		this.name = name; // setter와 같음
		this.price = price; // setter와 같음
	}
	/*
	public Goods(int price, String name) { // ()안에 순서가 다르면 안된다
		this.name = name; // setter와 같음
		this.price = price; // setter와 같음
	}
	*/

	// 메소드 Setter --> 생성자에 작성 가능
	public void setName(String name, int price) {
		this.name = name;
		this.price = price;
	}


	// 메소드 Getter
	private String getName() {
		return name;
	}
	private int getPrice() {
		return price;
	}

	// 메소드 일반
	public void showInfo() {
		System.out.println("상품이름: " + getName());
		System.out.println("가격: " + this.getPrice());
		System.out.println("==========================");
	}

}

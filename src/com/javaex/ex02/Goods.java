package com.javaex.ex02;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자

	// 메소드 - Getter, Setter

	// 메소드 - 일반

	public void setName( String name ) {
		this.name = name;
	}

	public void setPrice( int price ) {
		if ( price < 0 ) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}

	public String getName() {
		return this.name;
	}

	private int getPrice() {
		if ( this.price < 0 ) {
			return 0;
		}else {
			return this.price;
		}
	}


	public void showInfo() {
		System.out.println("상품이름: " + this.name);
		System.out.println("가격: " + this.getPrice());
		System.out.println("------------------");
	}

}

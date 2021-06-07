package com.javaex.ex15;

public class ColorPoint extends Point {

	// 필드(멤버변수)
	protected String color;


	// 생성자
	public ColorPoint() {
		// super(); 기본값 생략됨
		System.out.println("ColorPoint()");
	}
	
	public ColorPoint(String color) {
		// super(); 기본값 생략됨
		this.color = color;
		System.out.println("ColorPoint(1)");
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y); // Point(2) 생성자 상속
		this.color = color;
		System.out.println("ColorPoint(3)");
	}


	// 메서드 게터세터
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}


	// 메서드 일반
	@Override
	public String toString() { // main() 입력값 테스터
		return "ColorPoint [color=" + color + "], " + super.toString();
	}
	
	public void showInfo() {
		System.out.println("x: " + super.x + ", y: " + super.y + ", color: " + this.color);
	}


}

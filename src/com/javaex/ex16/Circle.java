package com.javaex.ex16;

public class Circle extends Rectangle {

	// 멤버 변수(필드)
	private int radius;



	// 생성자
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}



	// 메서드 게터세터
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}

	// 메서드 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]\tsuper." + super.toString();
	}

	public void draw() {
		System.out.println("[면색: " + super.getFillColor() + ", 선색: " + super.getLineColor() + ", 반지름: " + radius + "] 원을 그렸습니다.");
	}

}

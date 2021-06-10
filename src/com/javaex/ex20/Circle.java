package com.javaex.ex20;

public class Circle extends Shape implements Drawable {

	// 멤버 변수 field
	private int radius;



	// 생성자 constructors
	public Circle() {
		//		super();
	}

	public Circle(int radius) {
		//		super();
		this.radius = radius;
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}



	// 메서드 게터세터 method getter/setter
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}

	// 메서드 일반 method
	@Override
	public String toString() {
		return super.toString() + "\tCircle [radius=" + radius + "]";
	}

	public void draw() {
		System.out.println("[면색: " + getFillColor() + ", 선색: " + getLineColor() + ", 반지름: " + radius + "] 원을 그렸습니다.");
	}

	public double area() {
		return radius * radius * 3.14;
	}

}

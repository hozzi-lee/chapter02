package com.javaex.ex19;

public class Rectangle extends Shape {

	// 멤버 변수 field
	private int width;
	private int height;



	// 생성자 constructors
	public Rectangle() {
		super(); // 기본값 --> 생략 가능
	}
	public Rectangle(int width, int height) {
		super(); // 기본값 --> 생략 가능
		this.width = width;
		this.height = height;
	}
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}



	// 메서드 게터세터 method getter/setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	// 메서드 일반 method
	@Override
	public String toString() {
		return super.toString() + "\tRectangle [width=" + width + ", height=" + height + "]";
	}

	public void draw() {
		System.out.println("[면색: " + getFillColor() + ", 선색: " + getLineColor() + ", 가로: " + width + ", 세로: " + height + "] 사각형을 그렸습니다.");
	}

	public double area() { // 상속클래스의 추상메서드를 사용하지 않을 경우 오류 발생
		return width * height;
	}

}

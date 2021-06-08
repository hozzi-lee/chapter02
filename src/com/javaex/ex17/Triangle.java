package com.javaex.ex17;

public class Triangle extends Shape {

	// field
	private int width;
	private int height;

	

	// constructors
	public Triangle() {
		//		super();
		System.out.println("Triangle()");
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("Triangle(4)");
	}



	// method getter/setter
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}

	// method
	@Override
	public String toString() {
		return super.toString() + "\tTriangle [width=" + width + ", height=" + height + "]";
	}
	
	public void draw() {
		System.out.println("[면색: " + getFillColor() + ", 선색: " + getLineColor() + ", 가로: " + width + ", 세로: " + height + "] 삼각형을 그렸습니다.");
	}

	


}
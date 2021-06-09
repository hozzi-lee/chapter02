package com.javaex.ex18;

public class Shape {

	// 멤버 변수 field
	private String fillColor;
	private String lineColor;



	// 생성자 constructors
	public Shape() {
		// super(); 생략됨(Object)
	}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}



	// 메서드 게터세터 method getter/setter
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getFillColor() {
		return fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getLineColor() {
		return lineColor;
	}

	// 메서드 일반 method
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	public void draw() {
		System.out.println("[면색: " + fillColor + ", 선색: " + lineColor + "] 도형을 그렸습니다.");
	}
	
	public double area() {
		return 0.0;
	}

}

package com.javaex.ex15;

public class Point {

	// 필드(멤버변수)
	protected int x;
	protected int y;


	// 생성자
	public Point() {
		System.out.println("Point()");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}


	// 메서드 게터세터
	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}	



	// 메서드 일반	
	@Override
	public String toString() { // main() 입력값 테스터
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void showInfo() {
		System.out.println("x: " + x + ", y: " + y);
	}

}

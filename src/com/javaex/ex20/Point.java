package com.javaex.ex20;

public class Point implements Drawable {

	// field
	private int x;
	private int y;



	// constructors
	public Point() {
		// super(); 생략됨 --> Object();
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}



	// method getter/setter
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

	// method
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void draw() {
		System.out.println("[좌표X: " + x + ", 좌표Y: " + y + "] 점을 그렸습니다.");
	}

}

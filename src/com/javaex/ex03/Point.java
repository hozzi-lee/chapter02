package com.javaex.ex03;

public class Point {
	private int x;
	private int y;

	/*
	public void setX( int x ) {
		this.x = x;
	}
	
	public void setY( int y ) {
		this.y = y;
	}

	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	

	public void draw() {
		// 그림을 그리는 복잡한 기능을 구현해야 된다고 가정...
		System.out.println("점[x="+ x +", y="+ y +"]을 그렸습니다.");
	}
	*/


	public void setPoint( int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		// 그림을 그리는 복잡한 기능을 구현해야 된다고 가정...
		System.out.println("점[x="+ x +", y="+ y +"]을 그렸습니다.");
	}	

}

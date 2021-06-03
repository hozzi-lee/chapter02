package com.javaex.ex06;

public class Point {

	// 필드
	private int x;
	private int y;


	// 생성자
	public Point() { // Point()를 힙에 올린다
		// dafault 생성자
	}
	public Point(int x, int y) { // Point(vV)를 힙에 올린다
		this.x = x;
		this.y = y;
	}
	public Point(int x) { // Point(vV)를 힙에 올린다
		this.x = x;
	}
	/* 같은 생성자의 자료형이 같으면 안된다
	public Point(int y) { // Point(vV)를 힙에 올린다
		this.y = y;
	}
	 */


	// 메소드 setter
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	// 메소드 getter
	private int getX() {
		return x;
	}
	private int getY() {
		return y;
	}


	// 메소드 일반(오버로딩)
	public void draw() {
		System.out.println("점[x="+ getX() +", y="+ getY() +"]을 그렸습니다.");
	}

	public void draw(boolean flag) {
		if(flag == true) {
			System.out.println("점[x="+ getX() +", y="+ getY() +"]을 그렸습니다.");			
		} else {
			System.out.println("점[x="+ getX() +", y="+ getY() +"]을 지웠습니다.");
		}
	}
	
	public void draw(int flag) {
		if(flag == 1) {
			System.out.println("점[x="+ getX() +", y="+ getY() +"]을 그렸습니다.");			
		} else {
			System.out.println("점[x="+ getX() +", y="+ getY() +"]을 지웠습니다.");
		}
	}
}

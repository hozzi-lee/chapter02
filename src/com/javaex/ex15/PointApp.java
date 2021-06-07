package com.javaex.ex15;

public class PointApp {
	public static void main(String[] args) {
		
		// Point 클래스 기능 테스트
		Point point = new Point(10, 10);
		System.out.println(point.toString());
		
		System.out.println(); // ----------공백----------
		
		// ColorPoint 클래스 기능 테스트
		ColorPoint colorpoint = new ColorPoint(10, 10, "red");
		System.out.println(colorpoint.toString());
		
		System.out.println(); // ----------공백----------
		
		// 예제 확인
		Point P = new Point(4, 4); // Point(2)생성자
		
		System.out.println(); // ----------공백----------
		
		ColorPoint cp1 = new ColorPoint("red"); // Point()생성자 + ColorPoint(1)생성자
		
		System.out.println(); // ----------공백----------
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue"); // Point(2)생성자 + ColorPoint(3)생성자
		
		System.out.println(); // ----------공백----------
		
		P.showInfo(); // Point클래스 showInfo()
		cp1.showInfo(); // ColorPoint클래스 showInfo()
		cp2.showInfo(); // ColorPoint클래스 showInfo()
	}

}

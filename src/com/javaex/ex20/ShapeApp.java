package com.javaex.ex20;

public class ShapeApp {
	public static void main(String[] args) {

		// createInstance.point
		System.out.println("-------------Point 인스턴스 생성-------------");
		Point p01 = new Point(5, 5);
		System.out.println(p01.toString());
		p01.draw();
		System.out.println();
		System.out.println();



		// classTypeChange //
		System.out.println("-------------클래스 형 변환-------------");
		// Drawable_Point
		Drawable dp01 = new Point(10, 10);
		System.out.println(dp01.toString());
		dp01.draw();
		System.out.println();
		// Drawable_Rectangle
		Drawable dp02 = new Rectangle("SKYBLUE", "PINK", 7, 7);
		System.out.println(dp02.toString());
		dp02.draw();
		System.out.println(((Rectangle)dp02).area()); // downCastingTest
		System.out.println();
		// Drawable_Circle
		Drawable dp03 = new Circle("PINK", "SKYBLUE", 6);
		System.out.println(dp03.toString());
		dp03.draw();
		System.out.println(((Circle)dp03).area()); // downCastingTest
		System.out.println();
		// Drawable_Triangle
		Drawable dp04 = new Triangle("BLUE", "PINK", 10, 10);
		System.out.println(dp04.toString());
		dp04.draw();
		System.out.println(((Triangle)dp04).area()); // downCastingTest
		System.out.println();
		System.out.println();
		/*
		Drawable[] drawArray = new Drawable[3];
		Drawable[0] = dp02;
		Drawable[1] = dp03;
		Drawable[2] = dp04;
		Drawable[3] = dp01;
		 */

		// createArray
		System.out.println("-------------배열-------------");
		Drawable[] drawArray = {
				new	Rectangle("SKYBLUE", "PINK", 7, 7),
				new Circle("PINK", "SKYBLUE", 6),
				new Triangle("BLUE", "PINK", 10, 10),
				new Point(111, 222)
		};

		for ( int i = 0; i < drawArray.length; i++ ) {
			System.out.println(drawArray[i].toString());
			drawArray[i].draw();
			if ( drawArray[i] instanceof Shape ) {
				// drawArray[i]는 Shape와 instanceof(관련이) 있니?
				// drawArray[i]가 Shape의 instanceof(인스턴스가) 맞니?
				System.out.println(((Shape)drawArray[i]).area());
			} else {
				System.out.println("noShape noArea");
			}
			System.out.println();
		}

	}

}

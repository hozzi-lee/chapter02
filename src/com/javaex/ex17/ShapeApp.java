package com.javaex.ex17;

public class ShapeApp {
	public static void main(String[] args) {

		// super.class Test
		Shape test = new Shape("빨강", "검정");
		System.out.println(test.toString());
		test.draw();
		System.out.println();
		System.out.println();
		System.out.println();



		// Rectangle.class Test
		Rectangle rect01 = new Rectangle("빨강", "검정", 3, 3);
		System.out.println(rect01.toString()); // 생성자 순서 shape(2) -> Rectangle(4)
		rect01.draw();
		System.out.println();
		// Rectangle.class Test_Array
		Rectangle[] rectArray = {
				new Rectangle("RED", "BLACK", 5, 5),
				new Rectangle("BLUE", "GRAY", 5, 5),
				new Rectangle("PINK", "HOTPINK", 5, 5)
		};
		for ( int i = 0; i < rectArray.length; i++ ) {
			rectArray[i].draw();
			System.out.println(rectArray[i]); // .toString() 생략가능
			System.out.println();
		}
		System.out.println();
		System.out.println();



		// Circle.class Test
		Circle circ01 = new Circle("분홍", "하늘", 5);
		System.out.println(circ01.toString());
		circ01.draw();
		System.out.println();
		// Circle.class Test_Array
		Circle[] circArray = {
				new Circle("RED", "BLACK", 5),
				new Circle("BLUE", "RED", 10),
				new Circle("SKYBLUE", "HOTPINK", 15)
		};
		for ( int i = 0; i < circArray.length; i++ ) {
			circArray[i].draw();
			System.out.println(circArray[i]); // .toString() 생략가능
			System.out.println();
		}
		System.out.println();
		System.out.println();



		// Triangle.class Test
		Triangle triag01 = new Triangle("블루", "핑크", 7, 7);
		System.out.println(triag01.toString());
		triag01.draw();
		System.out.println();
		// Triangle.class Test_Array
		Triangle[] triagArray = {
				new Triangle("BLUE", "PINK", 5, 5),
				new Triangle("SKYBLUE", "HOTPINK", 10, 10),
				new Triangle("YELLOW", "GREEN", 15, 15)
		};
		for ( int i = 0; i < triagArray.length; i++ ) {
			triagArray[i].draw();
			System.out.println(triagArray[i]); // .toString() 생략가능
		}

	}

}

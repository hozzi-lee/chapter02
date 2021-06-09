package com.javaex.ex18;

public class ShapeApp {
	public static void main(String[] args) {

		// create Shape_Array
		Shape[] shapeArray = new Shape[3];

		// create Shape
		Shape srect01 = new Rectangle("Red", "Black", 5, 5);
		Shape scirc01 = new Circle("Orange", "Black", 3);
		Shape striag01 = new Triangle("Yellow", "Black", 10, 10);

		// Array <-- Shape
		shapeArray[0] = srect01;
		shapeArray[1] = scirc01;
		shapeArray[2] = striag01;

		// create Shape_Array - simple
		//		Shape[] shapeArray = {
		//				new Rectangle("Red", "Black", 5, 5),
		//				new Circle("Orange", "Black", 30),
		//				new Triangle("Yellow", "Black", 10, 10)
		//	};

		// output Array - overriding
		for (int i = 0; i < shapeArray.length; i++ ) {
			shapeArray[i].draw();
			System.out.println(shapeArray[i].toString()); // .toString() 생략가능
			System.out.println("area: " + shapeArray[i].area());
			System.out.println();
		}
		
		// 오버라이딩 부작용 --> 추상클래스, 추상메소드 해결
		Shape ss01 = new Shape("black", "black");
		System.out.println("Shape area: " + ss01.area());
		
		// down casting
		System.out.println(((Rectangle)srect01).getWidth());

	}

}

package com.javaex.ex19;

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

		// create Shape_Array - simple\
		/*
		Shape[] shapeArray = {
				new Rectangle("Red", "Black", 5, 5),
				new Circle("Orange", "Black", 30),
				new Triangle("Yellow", "Black", 10, 10)
		};
		 */

		// output Array - overriding
		for (int i = 0; i < shapeArray.length; i++ ) {
			shapeArray[i].draw();
			System.out.println(shapeArray[i].toString()); // .toString() 생략가능
			// overriding area()
			System.out.println("area: " + shapeArray[i].area());
			System.out.println();
		}

		// overriding error --> abstract class, abstract method
		/*
		abstract class == 인스턴스 불가능
		Shape ss01 = new Shape("black", "black");
		
		abstract method를 포함한 해당 클래스에서 추상메서드 사용 불가능(내용없음)
		abstract class도 사용 불가능
		추상메서드를 포함한 클래스를 상속받는 하위클래스는 추상메서드를 무조건 포함 시켜야 함
		ss01.area();
		System.out.println("Shape area: " + ss01.area());
		 */

		// down casting
		System.out.println(((Rectangle)srect01).getWidth());

	}

}

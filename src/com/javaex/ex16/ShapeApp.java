package com.javaex.ex16;

public class ShapeApp {
	public static void main(String[] args) {

		// 사격형 관리
		/*
		Rectangle[] rectArray = new Rectangle[3];
		Rectangle[0] = new Rectangle("빨강", "검정", 5, 5);
		Rectangle[1] = new Rectangle("노랑", "회색", 6, 6);
		Rectangle[2] = new Rectangle("초록", "쥐색", 7, 7);
		 */
		/*
		Rectangle[] rectArray = new Rectangle[] {
		new Rectangle("빨강", "검정", 5, 5), new Rectangle("노랑", "회색", 6, 6), new Rectangle("초록", "쥐색", 7, 7)
		};
		 */
		Rectangle[] rectArray = {
				new Rectangle("빨강", "검정", 5, 5), new Rectangle("노랑", "회색", 6, 6), new Rectangle("초록", "쥐색", 7, 7)
		};

		/*
		Rectangle[] rectArray = new Rectangle[3];

		Rectangle Rect01 = new Rectangle("빨강", "검정", 5, 5);
		Rectangle Rect02 = new Rectangle("노랑", "회색", 6, 6);
		Rectangle Rect03 = new Rectangle("초록", "쥐색", 7, 7);

		Rectangle[0] = Rect01;
		Rectangle[1] = Rect02;
		Rectangle[2] = Rect03;
		 */

		//		System.out.println(Rect01.toString());

		/*
		Rect01.draw();
		Rect02.draw();
		Rect03.draw();
		 */

		// 배열을 이용한 변수 일괄변경/출력
		for ( int i = 0; i < rectArray.length; i++ ) {
			rectArray[i].setFillColor("분홍");

			rectArray[i].draw();
			System.out.println(rectArray[i]); // toString() 출력 --> .toString() 생략
			System.out.println();
		}

		////////////////////////////////////////////////////////////////////////////
		// 원 관리
		//		Circle[] circArray = { new Circle("빨강", "검정", 5), new Circle("노랑", "회색", 10), new Circle("파랑", "쥐색", 20) };		

		Circle circ01 = new Circle("빨강", "검정", 5);
		Circle circ02 = new Circle("노랑", "회색", 10);
		Circle circ03 = new Circle("파랑", "쥐색", 20);

		Circle[] circArray = { circ01, circ02, circ03 };

		System.out.println(circ01.toString());
		System.out.println(circ02.toString());
		System.out.println(circ03.toString());

		System.out.println();

		circ01.draw();
		circ02.draw();
		circ03.draw();

		System.out.println();

		for ( int i = 0; i < circArray.length; i++ ) {
			circArray[i].setFillColor("PINKkkkkk!");
			circArray[i].setLineColor("HOTPINKkkkkk!!");

			circArray[i].draw();
			System.out.println(circArray[i]); // toString() 출력 --> .toString() 생략
			System.out.println();
		}

	}

}

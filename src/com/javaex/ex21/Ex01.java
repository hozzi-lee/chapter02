package com.javaex.ex21;

public class Ex01 {
	public static void main(String[] args) {

		// NullPointerException

		Rectangle r01 = new Rectangle("RED", "BLACK", 5, 5);

		r01 = null; // r01의 주소를 비운다

		try {
			r01.draw();
		} catch(NullPointerException e) {
//			System.out.println(e.getMessage());
			r01 = new Rectangle("RED", "BLACK", 5, 5);
			r01.draw();
		} finally {

		}

	}

}

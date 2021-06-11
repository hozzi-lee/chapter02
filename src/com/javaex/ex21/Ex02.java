package com.javaex.ex21;

public class Ex02 {
	public static void main(String[] args) {

		// ArrayIndexOutOfBoundsException
		int[] intArray = { 0, 1, 2 };

		try {
			for (int i = 0; i < intArray.length + 1; i++ ) {
				System.out.println(intArray[i]);
			}
		}catch(ArithmeticException e) {
			System.out.println("Text");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		}finally {

		}
	}

}

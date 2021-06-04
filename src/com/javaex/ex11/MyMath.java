package com.javaex.ex11;

public class MyMath {

	// 필드
	private static double pi = 3.14;



	// 생성자 - default 사용



	// 메소드 게터세터



	// 메소드 일반 - 메소드 오버로딩
	public static int plus(int a, int b) {		
		int result = a + b; // 복잡한 계산식 가정		
		System.out.println(result);
		return result;
	}

	public static double plus(double a, double b) {
		double result = a + b;
		return result;
	}

	/*
	public static void result() {
		System.out.println(result);
	}
	 */
	
	public static double circleArea(int radius) {
		double result = radius * radius * pi;
		System.out.println(result);
		return result;
	}


}

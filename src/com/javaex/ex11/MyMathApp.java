package com.javaex.ex11;

public class MyMathApp {
	public static void main(String[] args) {

//		MyMath myMath = new MyMath(); --> 이렇게 쓸 이유가 없다. --> static기능 활용

		MyMath.plus(100, 100);

		System.out.println(MyMath.plus(100.5, 100.2));

		System.out.println(MyMath.plus(99.5, 35));

		System.out.println(MyMath.plus(95, 35.7));

		MyMath.plus(111, 111);		

		MyMath.circleArea(5);
	}

}

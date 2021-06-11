package com.javaex.ex21;

import java.util.Scanner;

public class ArithException {
	public static void main(String[] args) {

		double result = 0;
		int num;

		Scanner scan = new Scanner(System.in);

		num = scan.nextInt();

		try {
			result = 100 / num;
			System.out.println(result);
		} catch(ArithmeticException e) { // 예외처리 예약어 + e
			System.out.println("0으로 나눌 수 없습니다.");
		} finally { // 무조건 출력되는 영역 --> 출력을 필요치 않으면 빈칸
			System.out.println("finallyArea");
		}

		scan.close();
	}

}

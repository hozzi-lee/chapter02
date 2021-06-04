package com.javaex.ex10;

public class GoodsApp {
	// count용도로 static을 잘 사용하지 않는다 --> *배열 --> 리스트
	public static void main(String[] args) {

		int[] intArray01 = new int[3];
		int[] intArray02 = new int[] { 1, 2, 3 };
		int[] intArray03 = { 1, 2, 3 };
		// 비교
		Goods[] goodsArray = new Goods[3]; // 배열값이 int, String 2가지여서 기본자료형 사용 불가

		/*
		Goods computer = new Goods("그램", 1000000);
		Goods camera = new Goods("니콘", 400000);
		goodsArray[0] = computer;
		goodsArray[1] = camera;
		 */

		goodsArray[0] = new Goods("그램", 1000000);
		//		goodsArray[0].showInfo();

		goodsArray[1] = new Goods("니콘", 400000);
		//		goodsArray[1].showInfo();

		//		goodsArray[2] = new Goods("머그컵", 2000);
		//		goodsArray[2].showInfo();

		int count = 0;
		for ( int i = 0; i < goodsArray.length; i++ ) {
			if ( goodsArray[i] != null ) { // 배열에 주소가 있으면
				count++;
				goodsArray[i].showInfo();
			}
		}
		System.out.println("All Goods: " + count);
	}

}

package com.javaex.ex05;

public class GoodsApp {
	public static void main(String[] args) {

		/*
		Goods camera = new Goods(); // 생성자 호출 - default생성자

		camera.setName("니콘", 400000);
		camera.showInfo();
		 */

		// 생성자를 또 호출 할 수 없다.
		//		camera.Goods("니콘2", 500000);

		/*
		Goods camera = new Goods("니콘", 400000);
		camera.showInfo();		

		Goods computer = new Goods("그램", 1000000);
		computer.showInfo();

		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		 */ 

		Goods camera = new Goods();

		camera.setName("니콘", 400000);
		camera.showInfo();

		/*
		camera.setName("니콘2", 500000);
		camera.showInfo();
		 */
		
		camera = new Goods("니콘3", 235245);
		camera.showInfo();

	}

}

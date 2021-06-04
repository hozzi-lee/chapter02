package com.javaex.ex09;

public class GoodsApp {
	// File.class에서 static을 전부 찾아서 먼저 올린다. --> File.변수이름
	// count용도로 static을 잘 사용하지 않는다 --> 배열 --> 리스트
	public static void main(String[] args) {

//		Goods[] goodsArray = new Goods[3];
		
//		goodsArray[0] = new Goods("그램", 1000000);
		Goods computer = new Goods("그램", 1000000);
		computer.showInfo();
//		goodsArray[0].showInfo();
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
	}

}

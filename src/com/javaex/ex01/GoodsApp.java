package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		 
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();

		camera.name = "니콘";
		camera.price = 400000;
		
		computer.name = "그램";
		computer.price = 1000000;
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		
		System.out.println(camera.name + ": " + camera.price);
		System.out.println(computer.name + ": " + computer.price);
		System.out.println(cup.name + ": " + cup.price);
	}

}

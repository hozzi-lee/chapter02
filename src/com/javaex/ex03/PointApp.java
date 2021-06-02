package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		/*
		Point p01 = new Point();
		Point p02 = new Point();

		p01.setX(5);
		p01.setY(5);


		p02.setX(10);
		p02.setY(23);


		p01.draw();
		p02.draw();
		*/
		
	
		Point point01 = new Point();
		Point point02 = new Point();

		point01.setPoint(5, 5);
		point01.draw();

		point02.setPoint(10, 23);
		point02.draw();
	
	}

}

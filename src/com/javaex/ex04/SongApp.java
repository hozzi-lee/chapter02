package com.javaex.ex04;

public class SongApp {
	public static void main(String[] args) {
		Song Song01 = new Song();
		Song Song02 = new Song();
		Song Song03 = new Song();
		
		Song01.setSong("아이유", "좋은날", "Real", 2010, 3, "이민수");
		Song02.setSong("BIGBANG", "거짓말", "Always", 2007, 2, "G-DRAGON");
		Song03.setSong("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, 4, "장범준");
		
		Song01.showInfo();
		Song02.showInfo();
		Song03.showInfo();
	}

}

package com.javaex.ex07;

public class SongApp {
	public static void main(String[] args) {

		// dafault 생성자
		Song song01 = new Song();
		// default생성자를 사용하기 못하게 하는 방법 - 생성자 목록에서 default생성자 삭제

		song01.setArtist("아이유");
		song01.setTitle("좋은날");
		song01.setAlbum("Real");
		song01.setYear(2010);
		song01.setTrack(3);
		song01.setComposer("이민수");

		song01.showInfo();


		// 초기화된 생성자 사용
		Song song02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, 2);

		song02.showInfo();


		// setter 통합
		Song song03 = new Song();
		song03.setSong("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, 4);

		song03.showInfo();


		// 피라미터 2개짜리 생성자 사용
		Song song04 = new Song("좋은날", 2010);
		song04.setArtist("아이유");
		song04.setAlbum("Real");
		song04.setTrack(3);
		song04.setComposer("이민수");

		song04.showInfo();
		
		
		// 생성자 안에 생성자 this()
		Song song05 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, 2);

		song05.showInfo();


	}

}

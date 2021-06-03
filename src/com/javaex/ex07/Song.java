package com.javaex.ex07;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;


	// 생성자 --> 힙에 올린다
	public Song() {
		// dafault생성자
	}
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public Song(String title) {
		this.title = title;
	}
	public Song(int year) {
		this.year = year;
	}


	// 메소드 setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTrack(int track) {
		this.track = track;
	}

	public void setSong(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	// 메소드 getter
	private String getTitle() {
		return title;
	}
	private String getArtist() {
		return artist;
	}
	private String getAlbum() {
		return album;
	}
	private String getComposer() {
		return composer;
	}
	private int getYear() {
		return year;
	}
	private int getTrack() {
		return track;
	}


	// 메소드 일반
	public void showInfo() {
		System.out.println(getArtist() + ", " + getTitle() + " ( " + getAlbum() + ", " + getYear() + ", " + getTrack() + "번 track, " + getComposer() + " 작곡 )");
	}

}

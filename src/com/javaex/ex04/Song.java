package com.javaex.ex04;


// 필드
public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;


	// 메소드_Setter
	/*
	public void setTitle( String title ) {
		this.title = title;
	}	
	public void setArtist( String artist ) {
		this.artist = artist;
	}
	public void setAlbum( String album ) {
		this.album = album;
	}
	public void setComposer( String composer ) {
		this.composer = composer;
	}
	public void setYear( int year ) {
		this.year = year;
	}
	public void setTrack( int track ) {
		this.track = track;
	}
	 */	

	public void setSong( String artist, String title, String album, int year, int track, String composer ) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}


	// 메소드_Getter
	private String getArtist() {
		return this.artist;
	}
	private String getTitle() {
		return this.title;
	}
	private String getAlbum() {
		return this.album;
	}
	private int getYear() {
		return this.year;
	}
	private int getTrack() {
		return this.track;
	}
	private String getComposer() {
		return this.composer;
	}


	// 메소드_일반
	public void showInfo() {
		System.out.println(getArtist() + ", " + getTitle() + " ( " + getAlbum() + ", " + getYear() + ", " + getTrack() + "번 track, " + getComposer() + " 작곡 )");
	}

}

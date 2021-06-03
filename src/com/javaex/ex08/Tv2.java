package com.javaex.ex08;

public class Tv2 {

	// 필드
	private int channel;
	private int volume;
	private boolean power;


	// 생성자
	public Tv2() {

	}

	public Tv2(int channel, int volume) {	
		this.channel = 7;
		this.volume = 20;
	}

	public Tv2(int channel, int volume, boolean power) {
		this(channel, volume);

		this.power = false;
	}


	// 메소드 setter - 작성안함
	// 메소드 getter
	private int getChannel() {
		return this.channel;
	}
	private int getVolume() {
		return this.volume;
	}
	private boolean getPower() {
		return this.power;
	}


	// 메소드 일반
	public void power(boolean on) {
		if ( on == true ) {
			this.power = true;
		} else {
			this.power = false;
		}
	}

	public void channel(int getChannel) {
		if ( getChannel < 1 ) {
			this.channel = 1;
		} else if ( getChannel > 255 ) {
			this.channel = 255;
		} else {
			this.channel = getChannel;
		}
	}

	public void channel(boolean up) {
		if ( up == true) {
			this.channel++;
		} else {
			this.channel--;
		}
	}

	public void volume(int getVolume) {

		if ( getVolume < 0 ) {
			this.volume = 0;			
		} else if ( getVolume > 100 ) {
			this.volume = 100;		
		} else {
			this.volume = getVolume;
		}
	}

	public void volume(boolean up) {
		if ( up == true) {
			this.volume++;
		} else {
			this.volume--;
		}
	}

	public void status() {
		if (power == true) {
			System.out.println("TV: ON");
			System.out.println("CHANNEL: " + getChannel());
			System.out.println("VOLUME: " + getVolume());
			System.out.println("");
		} else {
			System.out.println("TV: OFF");
			System.out.println("");
		}
	}

}

package com.javaex.ex08;

public class Tv {

	// 필드
	private int channel = 7;
	private int volume = 20;
	private boolean power = false;


	// 생성자
	public Tv() {

	}

	public Tv(int channel, int volume) {
		/*
		if ( channel < 0 ) {
			this.channel = 0;
		} else if ( channel > 255 ) {
			this.channel = 255;
		} else {
			this.channel = channel;
		}

		if ( volume < 0 ) {
			this.volume = 0;
		} else if ( volume > 100 ) {
			this.volume = 100;
		} else {
			this.volume = volume;
		}
		 */
		this.channel = channel;
		this.volume = volume;
	}

	public Tv(int channel, int volume, boolean power) {
		this(channel, volume);

		this.power = power;
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
	public void status() {
		if (power == true) {
			System.out.println("현재 시청중인 채널은 " + getChannel() + " 번, TV음량은 " + getVolume() + "입니다.");
		} else {
			System.out.println("TV가 꺼져 있습니다.");
		}
	}

	public void power(boolean on) {
		if ( on == true ) {
			this.power = true;
			System.out.println("현재 시청중인 채널은 " + getChannel() + " 번, TV음량은 " + getVolume() + "입니다.");
		} else {
			this.power = false;
			System.out.println("TV가 꺼져 있습니다.");
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
		System.out.println("현재 시청중인 채널은 " + getChannel() + " 번 입니다.");
	}

	public void channel(boolean up) {
		if ( up == true) {
			this.channel++;
			System.out.println("현재 시청중인 채널은 " + getChannel() + " 번 입니다.");
		} else {
			this.channel--;
			System.out.println("현재 시청중인 채널은 " + getChannel() + " 번 입니다.");
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
		System.out.println("현재 음량은 " + getVolume() + " 입니다.");
	}

	public void volume(boolean up) {
		if ( up == true) {
			this.volume++;
			System.out.println("현재 음량은 " + getVolume() + " 입니다.");
		} else {
			this.volume--;
			System.out.println("현재 음량은 " + getVolume() + " 입니다.");
		}
	}


}

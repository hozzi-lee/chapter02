package com.javaex.ex08;

public class TvApp {
	public static void main(String[] args) {
		Tv TV = new Tv(7, 20, false);
		TV.status();
		
		TV.power(true);
		
		TV.volume(false);
		
		TV.power(true);
		
		TV.channel(120);
		
		TV.channel(true);
		
		TV.volume(60);
		
		TV.status();
		
		TV.volume(55);
		
		TV.channel(155);
		
		TV.status();
		
		TV.power(false);
		
		TV.power(true);
	}

}

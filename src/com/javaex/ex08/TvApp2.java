package com.javaex.ex08;

public class TvApp2 {
	public static void main(String[] args) {
		Tv2 TV = new Tv2(7, 20, false);
		
		TV.status();
		
		TV.power(true);
		TV.volume(120); // 100으로 유지
		TV.status();
		
		TV.volume(false);
		TV.status();
		
		TV.channel(0);
		TV.status();
		
		TV.channel(true);
		TV.channel(true);
		TV.channel(true);
		TV.status();
		
		TV.power(false);
		TV.status();
		
		
	}

}

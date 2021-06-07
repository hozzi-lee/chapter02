package com.javaex.ex12;

public class PersonApp {
	public static void main(String[] args) {

		// 테스트
		Person p00 = new Person("정우성", 46);
		System.out.println(p00.toString());
		
		p00.setAge(50);
		System.out.println(p00.getAge());
		
		p00.showInfo();

		
		Student st00 = new Student("이효리", 40, "제주고등학교");
		System.out.println(st00.toString());
		
		st00.setAge(44);
		System.out.println(st00.getAge());
		
		st00.showInfo();
		


	}

}

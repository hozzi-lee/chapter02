package com.javaex.ex13;

public class personApp {
	public static void main(String[] args) {

		Student s01 = new Student();
		s01.setName("이호진");
		s01.setAge(29);
		s01.setSchoolName("배명고등학교");

		System.out.println(s01.getName());
		System.out.println(s01.getAge());
		System.out.println(s01.getSchoolName());
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();

		System.out.println("toString:");
		System.out.println(s01.toString());
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();
		
		s01.showInfo();
		
		// 비교해볼것
		Person p01 = new Person();
		p01.setName("이호진2");
		p01.setAge(29);
		
		p01.showInfo();

	}

}

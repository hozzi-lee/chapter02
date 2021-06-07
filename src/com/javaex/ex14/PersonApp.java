package com.javaex.ex14;

public class PersonApp {
	public static void main(String[] args) {

		// dafault 생성자 사용
		Student s01 = new Student();
		s01.setName("이호진");
		s01.setAge(29);
		s01.setSchoolName("배명고등학교");

		s01.showInfo();

		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();

		// Student 생성자(3) 사용
		Student s02 = new Student("이호진2", 29, "배명중학교");
		s02.showInfo();

		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();

		// 부모의 default 생성자 사용 --> 출력확인
		Student s03 = new Student();

		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();

		Student s04 = new Student("이호진2", 29, "배명중학교");

	}

}

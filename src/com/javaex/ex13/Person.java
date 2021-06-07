package com.javaex.ex13;

public class Person {

	// 필드(멤버 변수)
	private String name;
	private int age;


	// 생성자
	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	// 메서드 getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 데이터 확인용
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	// 메서드 일반
	public void showInfo() { // 화면출력용 --> 꾸며야해서 오래걸림 --> 데이터확인 == toString사용
		System.out.println("-------------------------------------");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);		
		System.out.println("-------------------------------------");
	}

}

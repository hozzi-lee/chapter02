package com.javaex.ex12;

public class Student {
	
	// 필드
	private String name;
	private int age;
	private String schoolName;
	
	
	// 생성자
	public Student() {
		
	}
	
	public Student(String name, int age, String schoolName) {
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
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
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	
	// 데이터 확인
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", schoolName=" + schoolName + "]";
	}
	
	// 메서드 일반
	public void showInfo() {
		System.out.println("-------------------------------------");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("학교이름: " + schoolName);
		System.out.println("-------------------------------------");
	}

}

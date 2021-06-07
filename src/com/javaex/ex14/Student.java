package com.javaex.ex14;

public class Student extends Person {

	//필드
	private String schoolName;


	//생성사
	public Student() {
		// super(); --> 생략됨( Student default 생성자에 대한 default값 )
		System.out.println("Student()");
	}

	/* 부모의 Person(2)생성자 사용
	public Student(String name, int age, String schoolName) {
		super(name, age);
		// super(); --> 기본값(생략가능) --> super(2)로 대체됨 
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	 */

	// 부모의 Person()생성자 사용
	public Student(String name, int age, String schoolName) {
		super(); // 기본값 --> 생략가능
		super.setName(name); // 부모의 필드 private
		super.age = age; // 부모의 필드 protected
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}


	//메서드 getter/setter
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}



	//메서드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "], " + super.toString();
	}

	public void showInfo() {
		System.out.println("이름: " + super.getName()); // 부모의 필드 private --> super.생략가능
		System.out.println("나이: " + age); // 부모의 필드 protected --> super.생략가능
		System.out.println("학교: " + schoolName);
	}

}

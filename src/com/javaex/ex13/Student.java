package com.javaex.ex13;

public class Student extends Person {

	//필드
	private String schoolName;


	//생성사
	public Student() {

	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
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
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("학교: " + schoolName);
	}	

}

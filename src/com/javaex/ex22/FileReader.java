package com.javaex.ex22;

import java.io.IOException;

public class FileReader {

	// field




	// constructors




	// method getter/setter


	// method
	public void Read(String path) {
		// 파일을 읽는다
		String file = "학교종이 땡땡땡 어서모이자 선생님이 우리를 기다리신다";
		System.out.println(file);
	}

	// Exception method
	public void Read2(String path) {
		// 파일을 읽는다 --> 파일이 없는 경우

		try { // 파일을 읽는다
			throw new IOException(); // 파일이 없다
		}catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}finally {

		}
	}

	// Exception method fix
	public void Read3(String path) throws IOException {
		// 파일을 읽는다 --> 파일이 없는 경우
		throw new IOException(); // 파일이 없다
	}

}

package org.opentutorials.javatutorials.exception;

import java.io.*;

class B {
	void run() throws FileNotFoundException, IOException{
		// throws 를 사용해서 다음 사용자에게 문제를 넘길 수 있다.
		// 예제에서는 FileNotFoundException의 문제를 다음 사용자에게 throws 로 넘기고 있다.
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
//		try {
//			bReader = new BufferedReader(new FileReader("out.txt"));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} 
		// throws FileNotFoundException 을 작성함으로서
		// 해당 오류가 발생시 대처법을 다음 사용자에게 throws 해버렸다.
//		try {
//			input = bReader.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		// throws IOException 을 작성함으로서
		// 해당 오류가 발생시 대처법을 다음 사용자에게 throws 해버렸다.
		System.out.println(input);
	}
}

class C {
	void run() throws FileNotFoundException, IOException{
		B b = new B();
//		try {
//			b.run();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		b.run();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
//		c.run();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt파일이 필요합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
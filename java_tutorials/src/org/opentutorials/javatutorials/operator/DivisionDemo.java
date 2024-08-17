package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		float c = 10.0F; // float 데이터 타입에 대입하는 값이니 뒤에 F를 붙여야 한다.
		float d = 3.0F;
		
		System.out.println(a/b); // 정수 / 정수 = 정수 3
		System.out.println(c/d); // 실수 / 실수 = 실수 3.3333333
		System.out.println(a/d); // 정수 / 실수 = 실수 (자동형변환) 3.3333333
		
	}

}

package org.opentutorials.javatutorials.constant;

public class ConstantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
//		1 = 3; 1에 대입연산자(=)를 사용해서 3을 넣으려고 해도 1은 3이 될 수 없다. 고유한 값을 가지고 있기 때문이다.
	
//		int q = 2.2; // 정수형 데이터타입에 2.2(실수)를 대입하면 오류가 발생한다.
//		float w = 2.2; // 실수형 데이터 타입에 2.2(실수)를 넣어도 오류가 발생한다. 
		double e = 2.2; // 실수형 데이터 타입(double)에 실수를 넣으면 오류가 발생하지않는다.
//		그렇다면 float에 실수를 대입하기 위해서는 어떻게 해야할까?
		
		float r = 2.2F; // float데이터 타입에 맞는 float형 값을 대입해줘야한다.
		long z = 2147483648L; // long데이터 타입도 마찬가지로 long형 값을 대입해줘야한다. 
	}

}

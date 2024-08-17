package org.opentutorials.javatutorials.polymorphism;

class A {
	public String x() {
		return "x";
	}
}

class B extends A {
	public String y() {
		return "y";
	}
}

public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B();
		obj.x();
//		obj.y(); //오류발생
		// 변수 obj 는 클래스 B 로 만든 인스턴스이지만 데이터 타입이 클래스A 이기에
		// 클래스 A에 들어있는 x() 메소드는 호출이 가능하지만
		// 클래스 B에 들어있는 y() 매소드는 호출이 불가능하다.
	}
}
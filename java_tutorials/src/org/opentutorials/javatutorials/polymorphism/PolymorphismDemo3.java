package org.opentutorials.javatutorials.polymorphism;

interface I2 {
	public String A();
}

interface I3 {
	public String B();
}

class D implements I2, I3 {
	public String A() {
		return "A";
	}

	public String B() {
		return "B";
	}
}

public class PolymorphismDemo3 {
	public static void main(String[] args) {
		D obj = new D(); // 데이터 타입을 클래스의 이름으로
		I2 objI2 = new D(); // 데이터 타입을 인터페이스 이름으로
		I3 objI3 = new D(); // 데이터 타입을 인터페이스 이름으로

		obj.A();
		// 인스턴스화 된 클래스 D(인터페이스로 A( ) 메소드가 포함되어 있다.)
		// 의 A메소드 호출 - 사용가능
		obj.B();
		// 인스턴스화 된 클래스 D(인터페이스로 B( ) 메소드가 포함되어 있다.)
		// 의 B메소드 호출 - 사용가능
		objI2.A();
		// objI2.B();
		// 사용 불가능 (데이터 타입이 I2이기 때문에 B( ) 메소드를 포함하지 않는다.

		// objI3.A();
		// 사용 불가능 (데이터 타입이 I3이기 때문에 A( ) 메소드를 포함하지 않는다.
		objI3.B();
	}
}

package org.opentutorials.javatutorials.reference;

public class ReferenceParameterDemo {

	static void _value(int b) {
		b = 2;
	} // _value 의 매개변수는 기본데이터 타입(정수형)이다.

	public static void runValue() {
		int a = 1;
		_value(a);
		// 인자는 a 이다. 인자 a 는 _value 의 매개변수에 들어가서 b 는 1이 된다.
		System.out.println("runValue, " + a); // 1
	}

	static void _reference1(A b) {
		b = new A(2); // 변수 b 는 인스턴스의 id 값:2 를 참조하고 있다.
	}

	public static void runReference1() {
		A a = new A(1); // 변수 a에 클래스 A( ) 를 담았다.
		_reference1(a);
		// 인자로 인스턴스 a를 줬다.
		System.out.println("runReference1, " + a.id); // 1
	}

	static void _reference2(A b) {
		b.id = 2; // 변수 a가 인스턴스를 참조하고 있다.
	}

	public static void runReference2() {
		A a = new A(1);
		_reference2(a);
		System.out.println("runReference2, " + a.id); // 2
	}

	public static void main(String[] args) {
		runValue(); // runValue, 1
		runReference1(); // runReference1, 1
		runReference2(); // runReference2, 2
	}

}
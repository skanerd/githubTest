package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo2 extends OverloadingDemo {
	void A(String arg1, String arg2) { 
		// 매개변수 parameter 값이 들어가지만 
		// 매개변수를 가지는 메소드는 존재하지 않기 때문에 메소드 오버로딩 overloading 된다.
		// ( 같은 시그니처의 다른 기능 A( ) 메소드를 정의 )
		// overloading : 부모 크래스의 메소드를 자식 클래스에서 재정의한다. 
		System.out.println("sub class : void A (String arg1, String arg2)");
	}

	void A() {
		// 매개변수 parameter 값이 들어있지 않다.
		// 인자 argument 가 없지만 extends 된 부모 클래스에는
		// 매개변수가 없는 A( ) 메소드가 존재한다.
		// ( 부모 클래스의 A( ) 메소드를 수정해서 자식 클래스가 사용한다. )
		// 즉, 메소드 오버라이딩 overriding 된다.
		// overriding : 시그니처가 같다면 메소드의 이름을 중복해서 사용가능하다.
		System.out.println("sub class : void A ()");
	}

	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();
		od.A(1);
		od.A("coding everybody");
		od.A("coding everybody", "coding everybody");

	}
}
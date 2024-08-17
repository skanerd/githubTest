package org.opentutorials.javatutorials.abstractclass.example1;

abstract class A {
	public abstract int b();
	// 본체가 있는 메소드는 abstract 키워드를 가질 수 없다. = 구체적인 로직이 존재하지 않는다. ( { }부분 )

	// public abstract int c(){System.out.println("Hello")}
	// c( ) 메소드의 로직( { } ) 이 존재해서 오류가 발생한다.

	public void d() {
		System.out.println("world");
	} // 추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
}

class B extends A {
	public int b() {
		return 1;
	} // 메소드 b( )를 오버라이딩(덮어쓰기) 해준다.
}

public class AbstractDemo {
	public static void main(String[] args) {
//		 A obj = new A();
		// 추상 클래스는 구체적인 메소드의 내용이 존재하지 않기 때문에 인스턴스화시켜서 사용할 수 없다.

		B obj = new B();
	}
}
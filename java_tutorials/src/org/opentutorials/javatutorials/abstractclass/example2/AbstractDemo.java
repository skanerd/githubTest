package org.opentutorials.javatutorials.abstractclass.example2;

abstract class A {
	public abstract int b();

	public void d() {
		System.out.println("world");
	}
}

class B extends A { // 상속
	public int b() {
		return 1;
	} // b( ) 메소드를 오버라이딩(덮어쓰기)
}

public class AbstractDemo {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.b());
	}
}
package org.opentutorials.javatutorials.polymorphism;

class O {
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}

	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
} // 오버로딩(이름은 같지만 시그니처가 다른 메소드를 중복 선언)

public class PolymorphismOverloadingDemo {
	public static void main(String[] args) {
		O o = new O();
		o.a(1);; // int param 이라고 선언했기에 첫 번째 a 메소드가 실행된다.
		o.a("one"); // String param 이라고 선언했기에 두 번째 a 메소드가 실행된다.
	} // 오버로딩(이름은 같지만 시그니처가 다른 메소드를 중복 선언)에 따른 다형성
}
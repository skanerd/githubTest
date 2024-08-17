package org.opentutorials.javatutorials.reference;

class A {
	public int id;

	A(int id) {
		this.id = id;
	}
}

public class ReferenceDemo1 {

	public static void runValue() {
		int a = 1;
		int b = a; // a 의 값 1은 변수 b 로 복제가 된다.
		b = 2;
		System.out.println("runValue, " + a);
	} // 변경된 것은 변수 b의 값이기에 (a(1)에서 2로 변경) a를 출력해도 값은 a의 값만 출력된다.


	public static void runReference() {
		A a = new A(1); // 매개변수 id 의 값이 1이 된 상태
		A b = a; // 변수 b 는 인스턴스 a 이다.
		b.id = 2; // 변수 b (인스턴스 a)에 인자 2 를 넣어준다.
		System.out.println("runReference, " + a.id);
	}

	public static void main(String[] args) {
		runValue();
		runReference();
	}

}
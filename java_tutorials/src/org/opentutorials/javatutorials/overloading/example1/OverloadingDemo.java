package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo {
	void A() {
		System.out.println("void A()");
	}

	void A(int arg) {
		System.out.println("void A (int arg1)");
	}
	
//	void A(int param1) {
//		System.out.println("void A (int arg1)");
//	}
	// 시그니처가 다 동일해도 매개변수 parameter 의 이름이 다르다면 오버로딩이 되지 않는다.
	// 매개변수의 이름은 메소드 내부에서 의미가 있는 것이지,
	// 메소드 호출 단계에서는 이름이 아닌 값을 넣어서 호출하게 된다.
	// 자바는 이 경우에 어떤 메소드(어떤 파라미터 값인지가 아닌 어떤 파라미터 이름인지)를 호출하는건지
	// 알 수 없게된다.

	void A(String arg) {
		System.out.println("void A (String arg1)");
	}

//	 int A (){System.out.println("void A()");}
	// 반환값이 void, int의 차이가 있다. 
	// 메소드의 이름, 메소드의 형식이 같아도 리턴 값의 형식이 다르면 오버로딩 할 수 없다.
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		// 인자 argument 값이 설정되어 있지 않으므로 매개변수 parameter 가 없는 메소드를 호출한다.
		od.A(1);
		// 인자 argument 값이 1이므로 매개변수 1 인 메소드를 호출한다.
		od.A("coding everybody");
		// 인자 argument 값이 문자열이므로 문자열 데이터타입 매개변수 parameter 를 갖는 메소드를 호출한다.
	}
}
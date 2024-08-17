package org.opentutorials.javatutorials.packages.example2;

//import org.opentutorials.javatutorials.packages.example1.*;
// 해당 패키지의 모든 클래스를 다 불러오겠다. (모든 파일이 아니라 모든 클래스를 의미한다.)

import org.opentutorials.javatutorials.packages.example1.A;
// 해당 패키지의 A 라는 이름의 클래스만 불러오겠다. (파일 이름이 아니라 클래스 이름을 의미한다.)

public class B {

	public static void main(String[] args) {

		A a = new A( );
		// 같은 패키지에 존재하지 않는 클래스를 호출했기에 오류가 발생한다.

	}

}

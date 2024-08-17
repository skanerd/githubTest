package org.opentutorials.javatutorials.packages.example3;
import org.opentutorials.javatutorials.packages.example1.*;
import org.opentutorials.javatutorials.packages.example2.*;


public class D {

	public static void main(String[] args) {
//		B b = new B();
		// example1 패키지와 example2 패키지에 둘 다 B라는 이름의 메소드가 존재하기에
		// 어떤 메소드를 호출하고 있는건지 알 수 없게된다.
		
		org.opentutorials.javatutorials.packages.example1.B b = new org.opentutorials.javatutorials.packages.example1.B();
		// 경로를 지정해주면 된다.

	}

}

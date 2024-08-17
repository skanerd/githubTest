package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0]; // args[0]은 입력값이 들어온다.
		if (id.equals("egoing")) { // .equals( ) 는 ==과 같다. (문자와 문자를 비교할 때 사용)
			System.out.println("right"); // run configurations - arguments ( egoing )
		} else {
			System.out.println("wrong"); // run configurations = arguments ( kim )
		}
	}

}

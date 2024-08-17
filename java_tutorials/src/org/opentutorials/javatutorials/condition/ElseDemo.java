package org.opentutorials.javatutorials.condition;

public class ElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (false) {
			System.out.println(1);
		} else if (true) {
			System.out.println(2);
		} else if (true) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		// 한 번이라도 true가 실행되면 해당 값을 반환하고 if문은 종료된다.
	}

}

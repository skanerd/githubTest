package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String password = args[1];
		if (id.equals("egoing")) { // 첫번째 조건
			if (password.equals("111111")) { // 두번째 조건
				System.out.println("right"); // 두번째 조건의 값이 true 일 경우
			} else { // 두번째 조건의 값이 false 일 경우
				System.out.println("wrong");
			}
		} else { // 첫번째 조건의 값이 false 일 경우
			System.out.println("wrong");
		}
	}
}

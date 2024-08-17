package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
        String password = args[1];
        if (id.equals("egoing") && password.equals("111111")) { //좌항(아이디), 우항(비밀번호) 의 값이 둘 다참일 
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
	}

}

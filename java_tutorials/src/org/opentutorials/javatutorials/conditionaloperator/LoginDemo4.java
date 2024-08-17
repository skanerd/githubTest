package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
        String password = args[1];
        if ((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi")) // 입력한 값중 하나라도 해당이 된다면
                && password.equals("111111")) { // 비밀번호는 일치한다면
            System.out.println("right");
        } else { // 그게 아니라면
            System.out.println("wrong");
        }
	}

}

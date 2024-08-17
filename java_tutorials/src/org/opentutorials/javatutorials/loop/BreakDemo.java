package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
            if (i == 5) // i의 값이 5와 일치한다면
                break; // 실행을 중지한다.
            System.out.println("Coding Everybody " + i);
        }
	}

}

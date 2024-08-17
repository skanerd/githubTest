package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue; // i 의 값이 5일 때 실행이 중단, 다시 실행
            System.out.println("Coding Everybody " + i);
            // i 의 값이 5일 때 실행이 중단되었기에 5는 출력되지 않는다.
        }
	}

}

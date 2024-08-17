package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < 10; i++) { // 0부터 9까지 i 의 값이 변경되면서 실행된다.
	            for (int j = 0; j < 10; j++) {
	                System.out.println(i + "" + j);
	                // 0 + "" + 0
	                // 0 + "" + 1
	                // 0 + "" + 2
	                // 내부의 반복이 9까지 가게 되면 외부의 반복이 하나가 진행된다.
	            }
	        }
	}
}
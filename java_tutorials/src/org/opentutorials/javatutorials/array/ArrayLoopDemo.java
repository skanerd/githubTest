package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] group = { "a", "b", "c" };
	        for (int i = 0; i < group.length; i++) { // 원소가 3개이므로 group.length는 3이다.
	            String element = group[i];
	            // i 의 값은 0 1 2 이기에 group[ ] 의 0번째 부터 2까지 배열(총 3개)을 불러온다.
	            System.out.println(element + "를 출력합니다.");
			}
	}
}

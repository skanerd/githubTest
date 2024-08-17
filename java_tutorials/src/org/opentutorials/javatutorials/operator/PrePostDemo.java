package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		i++; // i + 1
		System.out.println(i); // 4
		i++; // i + 1
		System.out.println(i); // 5
		System.out.println(++i); // i 값에 +1한 값 (5 + 1)
		System.out.println(i++); // 이 명령문 이후에 i + 1 (6을 출력하고 그 이후에 +1)
		System.out.println(i); // 7
	} 

}

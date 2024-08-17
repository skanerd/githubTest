package org.opentutorials.javatutorials.operator;

public class RemainerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
        System.out.println(0%a); // 0 출력
        System.out.println(1%a); // 1 / 3 의 나머지 값 출력 = 1 (몫 0)
        System.out.println(2%a); // 2 / 3 의 나머지 값 출력 = 2 (몫 0)
        System.out.println(3%a); // 3 / 3 의 나머지 값 출력 = 0 (몫 1)
        System.out.println(4%a); // 4 / 3 의 나머지 값 출력 = 1 (몫 1)
        System.out.println(5%a); // 5 / 3 의 나머지 값 출력 = 2 (몫 1)
        System.out.println(6%a); // 6 / 3 의 나머지 값 출력 = 0 (몫 2)
	}

}

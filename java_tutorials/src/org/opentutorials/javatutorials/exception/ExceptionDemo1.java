package org.opentutorials.javatutorials.exception;

class A {
	private int[] arr = new int[3]; // 총 3개의 정수가 들어갈 수 있는 배열 선언

	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}

	public void z(int first, int second) {
//		System.out.println(arr[first] / arr[second]);

		try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			// 배열의 범위 밖
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			// 수학적 오류
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
			// 예외 여부와 상관없이 무조건 실행된다.
		}

	}
}

public class ExceptionDemo1 {
	public static void main(String[] args) {
		A a = new A();
		a.z(10, 0);
		// 존재하지 않는 배열의 10번째, 배열의 1번째의 인덱스를 호출하고 있다.
		// 예외 발생
		a.z(1, 0);
		// 0 / 10 이 되므로 예의발생
		a.z(2, 1);

	}
}
package org.opentutorials.javatutorials.exception;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		if (right == 0) {
			throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
		}
		this.left = left;
		this.right = right;
	}

	public void divide() {
		if (this.right == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}				
		try { 
			System.out.print("계산결과는 ");
			System.out.print(this.left / this.right);
			System.out.print(" 입니다.");
		} catch (Exception e) { // Exception 데이터 타입의 변수 e
			// 예외가 발생하면 자바는 마치 메소드를 호출하듯이
			// catch를 호출하면서 그 인자로 Exception 클래스의 인스턴스를 전달하는 것이다.
			System.out.println("오류가 발생했습니다 : " + e.getMessage());
			// e.getMessage()는 자바가 전달한 인스턴스의 메소드 중 getMessage를 호출하는 코드인데,
			// getMessage는 오류의 원인을 사람이 이해하기 쉬운 형태로 리턴한다.
			System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
		} 
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();

		Calculator c2 = new Calculator();
		c2.setOprands(10, 5);
		c2.divide();
	}
}
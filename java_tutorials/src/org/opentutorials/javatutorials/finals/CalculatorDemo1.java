package org.opentutorials.javatutorials.finals;

class Calculator {
	static final double PI = 3.14;
	// final로 값을 고정했기에 변경이 불가능하다.
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;

//		 Calculator.PI = 6;
		// final로 값을 고정했기에 변경이 불가능하다.
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
//		Calculator.PI = 10;
		// final로 값을 고정했기에 변경이 불가능하다.

	}

}
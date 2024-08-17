package org.opentutorials.javatutorials.progenitor;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		System.out.println(c1);
		// 출력값 org.opentutorials.javatutorials.progenitor.Calculator@5674cd4d
		// 경로가 출력된다. 
		// @ 뒤의 내용은 인스턴스에 대한 고유한 식별이니 무시
		System.out.println(c1.toString());
		// 출력값이 동일한다.
		// 애초에 뒤에 toString()이 생략되어 있었던 것.
	}

}
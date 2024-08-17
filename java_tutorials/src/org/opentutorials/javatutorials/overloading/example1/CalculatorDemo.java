package org.opentutorials.javatutorials.overloading.example1;

class Calculator {
	int left, right;
	int third = 0;

	public void setOprands(int left, int right) {
		// 인자가 두 개인 경우의 인스턴스를 받아주는 메소드
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}

	public void setOprands(int left, int right, int third) {
		// 인자가 세 개인 경우의 인스턴스를 받아주는 메소드
		System.out.println("setOprands(int left, int right, int third)");
		this.left = left;
		this.right = right;
//		this.left = left;
//		this.right = right;
//		부분이 setOprands 에서 중복되어 작성되어있다.
//		this.setOprands(left, right); 
//		로 중복을 방지할 수 있다.
		
		this.third = third;
		// 인스턴스 변수(전역변수)
	}

	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}

	public void avg() {
		System.out.println((this.left + this.right + this.third) / 3);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.setOprands(10, 20); // 인자가 두 개인 경우의 인스턴스
		c1.sum();
		c1.avg();
		c1.setOprands(10, 20, 30); // 인자가 세 개인 경우의 인스턴스
		c1.sum();
		c1.avg();
	}
}
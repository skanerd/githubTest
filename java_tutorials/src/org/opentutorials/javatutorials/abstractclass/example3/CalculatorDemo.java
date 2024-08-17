package org.opentutorials.javatutorials.abstractclass.example3;

abstract class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		// int left와 int right에 어떤 값이 들어갈지만(this.) 정의해준다.
	}

	int _sum() {
		return this.left + this.right; // setOprands에서 정의한 좌항과 우항의 값으로 작동한다.
	}

	int _avg() {
		return (this.left + this.right) / 2; // setOprands에서 정의한 좌항과 우항의 값으로 작동한다.
	}

	public abstract void sum(); // 시그니처만 정의된 추상 메소드

	public abstract void avg(); // 시그니처만 정의된 추상 메소드

	public void run() {
		sum();
		avg();
		// run( ) 은 메소드의 실행 순서만 정해준다.
	}
}

class CalculatorDecoPlus extends Calculator {
	public void sum() {
//		System.out.println("+ sum :" + (this.left + this.right));
		System.out.println("+ sum : " + _sum());
	} // 로직이 들어있는 메소드를 상속을 통해서 추상메소드의 알맹이(로직)을 채워준다.

	public void avg() {
//		System.out.println("+ avg :" + (this.left + this.right) / 2);
		System.out.println("+ avg : " + _avg());
	} // 로직이 들어있는 메소드를 상속을 통해서 추상메소드의 알맹이(로직)을 채워준다.
}

class CalculatorDecoMinus extends Calculator {
	public void sum() {
//		System.out.println("- sum :" + (this.left + this.right));
		System.out.println("- sum : " + _sum());
	} // 로직이 들어있는 메소드를 상속을 통해서 추상메소드의 알맹이(로직)을 채워준다.

	public void avg() {
//		System.out.println("- avg :" + (this.left + this.right) / 2);
		System.out.println("- avg : " + _avg());
	} // 로직이 들어있는 메소드를 상속을 통해서 추상메소드의 알맹이(로직)을 채워준다.
}

public class CalculatorDemo {
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus(); // CalculatorDecoPlus 인스턴스화
		c1.setOprands(10, 20); // 인자 argument 를 파라미터 parameter 에 넣어준다.
		c1.run();

		CalculatorDecoMinus c2 = new CalculatorDecoMinus(); // CalculatorDecoMinu 인스턴스화
		c2.setOprands(10, 20); // 인자 argument 를 파라미터 parameter 에 넣어준다.
		c2.run();
	}

}
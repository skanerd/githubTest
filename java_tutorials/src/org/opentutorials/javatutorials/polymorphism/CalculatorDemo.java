package org.opentutorials.javatutorials.polymorphism;

abstract class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	int _sum() {
		return this.left + this.right;
	}

	public abstract void sum(); // 추상 메소드

	public abstract void avg(); // 추상 메소드

	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator {
	public void sum() {
		System.out.println("+ sum :" + _sum());
	} // 상속을 통해 추상 메소드에 로직을 넣어주고 있다.

	public void avg() {
		System.out.println("+ avg :" + (this.left + this.right) / 2);
	} // 상속을 통해 추상 메소드에 로직을 넣어주고 있다.
}

class CalculatorDecoMinus extends Calculator {
	public void sum() {
		System.out.println("- sum :" + _sum());
	} // 상속을 통해 추상 메소드에 로직을 넣어주고 있다.

	public void avg() {
		System.out.println("- avg :" + (this.left + this.right) / 2);
	} // 상속을 통해 추상 메소드에 로직을 넣어주고 있다.
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new CalculatorDecoPlus();
		// CalculatorDecoPlus()를 인스턴스화해서 변수 c1에 넣어주고 데이터 타입이 Calculator
		// 다형성을 이용하지 않았다면 데이터 타입이 CalculatorDecoPlus 이었을 것이다.
		c1.setOprands(10, 20);
		c1.run();

		Calculator c2 = new CalculatorDecoMinus();
		// CalculatorDecMinus()를 인스턴스화해서 변수 c1에 넣어주고 데이터 타입이 Calculator
		// 다형성을 이용하지 않았다면 데이터 타입이 CalculatorDecoMinus 이었을 것이다.
		c2.setOprands(10, 20);
		c2.run();
	}
// 데이터 타입이 Calculator 이기에
// 인스턴스 c1과 c2를 사용하는 입장에서 두개의 클래스 모두 Calculator인 것처럼 사용할 수 있다.
}



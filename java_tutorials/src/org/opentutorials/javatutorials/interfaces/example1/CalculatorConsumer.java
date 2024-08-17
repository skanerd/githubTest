package org.opentutorials.javatutorials.interfaces.example1;

class CalculatorDummy {
	public void setOprands(int first, int second, int third) {
	}

	public int sum() {
		return 60;
		// 반환값을 정해줬기에 인자값이 들어가지 않는다.
	}

	public int avg() {
		return 20;
		// 반환값을 정해줬기에 인자값이 들어가지 않는다.
	}
}

public class CalculatorConsumer {
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		// 인자값을 넣어주고 있지만 이미 반환값이 정해져있어서 파라미터에 들어가지 않는다.
		System.out.println(c.sum() + c.avg());
	}
}

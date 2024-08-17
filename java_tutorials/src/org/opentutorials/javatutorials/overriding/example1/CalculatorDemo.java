package org.opentutorials.javatutorials.overriding.example1;

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
    
//	public int avg() {
//		return ((this.left + this.right) / 2);
//	}
}

class SubstractionableCalculator extends Calculator {

	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
	}
	// 부모 클래스에 있는 sum() 메소드를 자식 클래스에서 재정의(오버라이딩 overriding)한다.

//    public int avg() {
//        return (this.left + this.right)/2;
//    }
//	 자식 클래스의 avg( )메소드의 return 타입이 부모 클래스의 avg( )메소드와 호환되지않는다.

//	public int avg() {
//		return super.avg();
//	}

	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}
}
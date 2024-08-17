package org.opentutorials.javatutorials.object;

class Calculator { //　Calculator 의 설계도
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		// this. : c1 = new Calculator();에 입력해준 인자값
		// 해당 Class 에서 설정한 변수 left 의 이름을 다시 한 번 left 라고 정의해주는 것. 
		
		// ⭐️질문하기
		// setOprands에서는 위에서 설정한 변수 int left, right 를 this.left right 로 가지고 와서 사용했는데
		// 같은 Class 안에 있지만 다른 메소드 안에 있는 sum()과 avg()를 출력해줄 때는 왜 다시 this.left right 를 사용하는지
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo4 { // Calculator 의 설계도에 실제 값을 넣어서 실행시키기

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		// Calculator 클래스의 인스턴스(객체) c1을 생성한다.
		// c1이라는 변수를 설정 - Calculator 라는 객체를 담을 수 있는 데이터 형식을 가지고 있는 변수이다.
		c1.setOprands(10, 20); // setOprands : 연산의 대상이 되는 값
		c1.sum();
		c1.avg();

		Calculator c2 = new Calculator();
		// new 로 설정해준 메소드 (변수에 담겨있다.)를 인스턴스 Instance 라고한
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
	}

}

package org.opentutorials.javatutorials.Inheritance.example1;
 
class MultiplicationableCalculator extends Calculator {
//	MultiplicationableCalculator 는 Calculator 가 가지고 있는 기능을 상속(확장)한다.
//	이를 통해 서로 파일이 달라도 같은 패키지 안에 있다면 상속이 가능하다는 걸 알 수 있다.
    public void multiplication() { // multiplication( ) 메소드를 추가로 정의하겠다.
        System.out.println(this.left * this.right);
        // multiplication( ) 메소드는
        // 부모 클래스가 가지고 있는 인스턴스 변수(필드)인 this. 를 서로 곱해주는 로직이다.
    }
}
 
public class CalculatorDemo2 {
 
    public static void main(String[] args) {
 
        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        // MultiplicationableCalculator()를 c1 이라는 인스턴스에 담아준다.
        c1.setOprands(10, 20); // c1의 초기값은 10, 20
        c1.sum();
        c1.avg();
        // ↑ 셋은 부모 클래스의 부모 클래스 (상위객체) Calculator 에 들어있는 메소드들이므로
        // 자동으로 부모 클래스를 호출해서 사용하게 된다.
        c1.multiplication();
    }
 
}
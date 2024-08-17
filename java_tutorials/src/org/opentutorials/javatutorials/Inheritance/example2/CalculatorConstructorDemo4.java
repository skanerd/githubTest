package org.opentutorials.javatutorials.Inheritance.example2;
 
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
 
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        this.left = left; // 10
        this.right = right; // 20
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20); // 생성자로 left right 값을 초기화.
        c1.sum();
        c1.avg();
        c1.substract();
    }
    // setOprands(10, 20); 를 작성하지 않고 인스턴스에 인자 argument 값을 바로 주었다.
    // 그리고 부모와 자식 클래스 둘 다 그 인자값을 받을 수 있도록 메소드를 작성해서
    // this. 를 다시 설정해주었다.
    // 부모 클래스의 전역변수이기에 자식 클래스에서도 그 전역변수를 사용할 수 있다.
}
package org.opentutorials.javatutorials.Inheritance.example1;
 
class DivisionableCalculator extends MultiplicationableCalculator {
// MultiplicationableCalculator 부모(상위클래스) / DivisionableCalculator 자식 (하위클래스)
    public void division() { // 나누기 기능을 구현한 메소드
        System.out.println(this.left / this.right);
    }
}
 
public class CalculatorDemo3 {
 
    public static void main(String[] args) {
 
        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
 
}
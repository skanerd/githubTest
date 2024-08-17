package org.opentutorials.javatutorials.Inheritance.example1;
 
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
 
class SubstractionableCalculator extends Calculator { // extends 기능을 상속(확장)
    public void substract() {
        System.out.println(this.left - this.right);
    } // 기존의 기능에 빼기 기능을 하는 클래스를 추가했다.
}



public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20); // SubstractionableCalculator 클래스의 인스턴스로 
        c1.sum();			   // 작성되어있지만 해당 클래스에는 로직이 들어있지 않기 때문에
        c1.avg();			   // 자동으로 해당 클래스의 부모 클래스의 메소드를 호출한다.
        c1.substract(); 
        // 해당 메소드를 호출하지만 this. 변수는 SubstractionableCalculator 안에
        // 정의되어 있지 않기 때문에 다시 부모 클래스에서 this. 변수를 호출해서 가져오게 된다.
    }
 
}
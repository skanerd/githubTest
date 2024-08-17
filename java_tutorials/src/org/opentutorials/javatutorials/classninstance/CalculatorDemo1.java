package org.opentutorials.javatutorials.classninstance;
 
class Calculator {
    static double PI = 3.14;
    // static 을 멤버(변수, 메소드) 앞에 붙이면 클래스의 멤버가 된다.
    // 즉, static 변수는 해당 클래스에 소속된 클래스변수라는 뜻이다.
    // 모든 메소드와 모든 인스턴스에서 사용할 수 있다.
    
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
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
 
        Calculator c2 = new Calculator();
        System.out.println(c2.PI);
 
        System.out.println(Calculator.PI);
 
    }
 
}
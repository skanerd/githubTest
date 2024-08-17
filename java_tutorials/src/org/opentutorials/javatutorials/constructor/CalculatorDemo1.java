package org.opentutorials.javatutorials.constructor;
 
class Calculator { // 클래스의 이름과 
    int left, right;

    public Calculator(int left, int right) { // 메소드의 이름이 동일하다. (중요)
        this.left = left; // 전역변수(클래스변수)의 값을 여기로 가지고 와준다.
        this.right = right; // 전역변수(클래스변수)의 값을 여기로 가지고 와준다.
    }
 
    public void sum() {
        System.out.println(this.left + this.right); 
        // 클래스의 이름과 ↑메소드의 이름이 같기에 여기서도 Calculator( )에서 설정한
        // this.(전역변수를 가져오고있다)를 가져와서 사용할 수 있게된다.
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator(10, 20);
        // c1.setOprands(10, 20) 없이도 사용가능하다.
        c1.sum();
        c1.avg();
 
        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }
 
}
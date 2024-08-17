package org.opentutorials.javatutorials.classninstance;
 
class Calculator2 {
    static double PI = 3.14;
    static int base = 0; 
    // static 선언했기에 인스턴스가 아닌 클래스의 멤버가 된다.
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right + base);
    }
 
    public void avg() {
        System.out.println((this.left + this.right + base) / 2);
    }
}
 
public class CalculatorDemo2 {
 
    public static void main(String[] args) {
 
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20); // argument 값 설정 -> parameter 에 대입
        c1.sum();
 
        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);        
        c2.sum();
        
        Calculator2.base = 10;
        // 클래스 변수는 필요에 따라 수정이 가능하다.
        c1.sum();
        c2.sum();
        
        
        // Calculator2.base = 10; 를 선언함으로서 해당 코드의 밑은 모두 base가 10이 되었다.
        
        Calculator2.base = 0;
        c1.sum();
    }
 
}
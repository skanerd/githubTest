package org.opentutorials.javatutorials.Inheritance.example3;
 
class Calculator {
    int left, right;
    
//    public Calculator() {};
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
     
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
//        this.left = left;
//        this.right = right;
    		// this. 는 현재 클래스의 int left right 
    		// super 은 부모 객체의 int left right를 가져오게 된다.
    		// 상속받으면 super
    	
        super(left, right);
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
package org.opentutorials.javatutorials.classninstance;
 
class Calculator3{
  
    public static void sum(int left, int right){ // static sum : 클래스 소속의 메소드 선언
        System.out.println(left+right);
    }
     
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}
 
public class CalculatorDemo3 {
     
    public static void main(String[] args) {
        Calculator3.sum(10, 20); // Class.method(argument, argument) 구조
        Calculator3.avg(10, 20);
         
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    } 
    // 예제 1, 2와는 방식이 다르다.
    // 굳이 instance 를 만들어서 인자 값을 설정해주는게 아니라 메소드 클래스를 통해서 바로 작성이 가능하다.
    
}
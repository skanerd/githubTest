package org.opentutorials.javatutorials.object;

public class CalculatorDemo3 {

	public static void avg(int left, int right) { // 좌항과 우항의 평균을 계산해주는 메소드
        System.out.println((left + right) / 2);
    }
 
    public static void sum(int left, int right) { // 좌항과 우항의 합을 계산해주는 메소드
        System.out.println(left + right);
    }
 
    public static void main(String[] args) { // 메인메소드 인자(argument)값을 설정해준다.
        int left, right;
 
        left = 10;
        right = 20;
 
        avg(left, right);
        sum(left, right);
        
        left = 20;
        right = 40;
 
        avg(left, right);
        sum(left, right);
        
        // 예제의 인자(argument)는 한 눈에 볼 수 있는 길이이지만
        // 코드가 점점 복잡해지고 길어지게 되면 중복되는 이름(변수, 메소드)등이 작성되는 문제점이 생긴다.
    }
}

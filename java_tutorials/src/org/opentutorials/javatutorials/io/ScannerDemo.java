package org.opentutorials.javatutorials.io;
 
import java.util.Scanner;
 
public class ScannerDemo {
//	ScannerDemo라는 애플리케이션이 실행되고, 그 안의 main 메소드가 자바에 의해서 실행되는 방식
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in 은 지금은 사용자가 입력할 값 이라고 이해해두자.
        int i = sc.nextInt();
        // sc.nextInt가 실행되면 자바는 사용자의 입력이 있을 때까지 변수 i 에 값을 할당하지 않고 대기상태로 있게된다.
        
        System.out.println(i*1000);
        sc.close();
        
       // console 에 숫자를 입력하면 그 값이 i 가 된다.
    }
}
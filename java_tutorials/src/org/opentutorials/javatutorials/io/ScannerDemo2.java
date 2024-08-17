package org.opentutorials.javatutorials.io;
 
import java.util.Scanner;
 
public class ScannerDemo2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) { 
        	// Scanner 객체가 가지고 있는 hasNextInt() 라이브러리를 호출
        	// 현재는 while 반복문이 작동하지 않고있다.
        	// 정수가 될 수 있는 숫자 (int) 인자(argument)로 입력 받으면하면 true 그렇지 않다면 false
        	// true 가 출력되면 반복문은 정지한다.
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close(); // 질문하기
    }
 
}
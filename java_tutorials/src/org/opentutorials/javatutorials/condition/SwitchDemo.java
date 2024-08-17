package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
//            break; // 해당 명령어로 중간에 조건문 밖의 명령을 실행할 수 있다.
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        default: // 값이 어디에도 속하지 않을 때 출력해주는 기본값 설정
        	System.out.println("값이 어디에도 속하지 않는다면 출력");
        } // 해당 조건이 맞다면 switch 문 안의 해당 case 와 하위 case 가 모두 실행된다.
        // 여러가지 조건과 프로세스를 정해두고 사용가능하다.
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one"); // 출력되지 않는다.
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        default:
        	System.out.println("값이 어디에도 속하지 않는다면 출력");
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one"); // 출력되지 않는다.
        case 2:
            System.out.println("two"); // 출력되지 않는다.
        case 3:
            System.out.println("three");
        default:
        	System.out.println("값이 어디에도 속하지 않는다면 출력");
        }
        
        System.out.println("switch(4)");
        switch(4){
        case 1:
            System.out.println("one"); // 출력되지 않는다.
        case 2:
            System.out.println("two"); // 출력되지 않는다.
        case 3:
            System.out.println("three"); // 출력되지 않는다.
        default:
        	System.out.println("값이 어디에도 속하지 않는다면 출력");
        }
	}
}

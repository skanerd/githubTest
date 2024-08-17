package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
    static int i;
    // 클래스 아래에서 선언된 변수는 클래스 전역에 영향을 미친다. 클래스변수, 전역변수
    // ScopeDemo1와는 다르게 전역변수로 선언해준다.
     
    static void a() { 
        i = 0; 
        // 이미 선언해둔 전역변수를 할당만 해줬다.
        // 메소드 a 안에서만 유효한 변수
        // int i 라고 지역변수로 선언해주면 무한루프가 생기지 않는다.
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) { 
            a();
            // for문 안에서 int i 라고 선언해서 지역변수로 만들어주면 무한루프가 생기지 않는다.
            // 반복의 과정에서 i=0 이 무한하게 반복하게 된다.
            System.out.println(i);
        }
    }
}
package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {
    static int i = 5; // 클래스변수, 전역변수
 
    static void a() {
        int i = 10; // 메소드 a 에서만 영향을 미치는 지역변수
        b();
    }
    // 메소드 a 에서 메소드 b 를 호출하는 구조인데 그렇다면 메소드 a 안에 b 가 들어가는 구조이고,
    // a 의 지역변수 i = 10을 받게될 것 같은데 그게 아니다.
    // b 에서는 지역변수가 없기 때문에 a 에 호출받기 전에 이미 전역변수(클래스변수)를 받고 온다.
    // 즉 b 에는 이미 전역변수 i = 5 의 값을 받을 상태로 메소드 a 에 호출되게 된다.
    
    // a 메소드에 호출되어서 사용되는 시점의 유효범위가 아니라
    // b 메소드가 정의되는 시점에서의 유효범위를 갖게된다. 이것을 정적 스코프 라고한다.
    
    static void b() {
        System.out.println(i); // 5
        // 메소드 a 에서 i는 10이라고 선언했지만, 
        // 그것은 지역변수이기에 메소드 b 에는 영향을 미치지 못 한다.
    }
 
    public static void main(String[] args) {
        a();
    }
 
}
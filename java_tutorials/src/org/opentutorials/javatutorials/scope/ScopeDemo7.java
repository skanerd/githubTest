package org.opentutorials.javatutorials.scope;

class C {
    int v = 10; // 클래스변수, 전역변수
 
    void m() {
    	int v = 20; // 지역변수
        System.out.println(v); // 이 메소드의 지역변수를 사용
        System.out.println(this.v); 
        // this. 는 인스턴스 자체를 말한다.
        // 이 예제에서는 class C 의 인스턴스 c1 을 의미한다.
    }
}
 
public class ScopeDemo7 {
 
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
 
}
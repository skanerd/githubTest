package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	 
    static void a() {
        int i = 10;
        // i 의 값은 다른 메소드에 영향을 끼치지 않는다.
        // i 는 해당 메소드 안에서만 작동한다.
        // 내부 변수의 값이 그 외부에 영향을 미치지 않는다는 뜻
        // 지역변수
    }
 
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a(); // 정적 메소드 a 호출
            System.out.println(i);
        }
    }
}


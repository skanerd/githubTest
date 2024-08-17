package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//         System.out.println(i); 
        // 위의 출력도 작동하지 않는다.
        // 반복문 안에서 정의한 변수 i 는 밖에서는 사용할 수 없다.
    }
 
}
package org.opentutorials.javatutorials.scope;

public class ScopeDemo4 {
	
    static void a(){
        String title = "coding everybody"; // 메소드 a() 에 소속된 지역변수이다.
    }
    public static void main(String[] args) {
        a();
//        System.out.println(title); 
        // 해당 변수를 가져올 수 없기 때문에 오류가 발생한다.
        // 다른 메소드의 지역변수는 다른 메소드에서 사용할 수 없다.
    }
 
}
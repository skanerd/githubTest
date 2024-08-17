package org.opentutorials.javatutorials.method;

public class ReturnDemo {

	public static int one() {
        return 1;
//        return 2;
//        return 3;
        // 리턴은 메소드를 종료시키는 역할을 하므로 리턴이 처음 등장한 이후의 구문은 실행되지 않기에 
        // 리턴을 여러개 입력해도 작동하지 않는다. ( 연속해서 리턴을 입력하지 말아야한다. )
        // 컴파일 조차 되지 않는다.
    }
 
    public static void main(String[] args) {
        System.out.println(one());
    }

}

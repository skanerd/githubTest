package org.opentutorials.javatutorials.method;

public class MethodDemo4 {

	public static void numbering(int limit) { // numbering 이라는 메소드는 int 형 데이터만 받아들인다.
											  // int limit 부분을 매개변수 parameter 라고 한다.
//		int limit = 5; 
//		라고 작성해도 같은 방식으로 실행되지만 변수 선언을 통해서 숫자를 정해버리면
//		필요할 때마다 값을 계속 수정해줘야하는 불편함이 생긴다.
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(5); // numbering(int limit)의 int limit 의 값에 5를 넣어준다.
//       여기서 ( ) 안을 인자 argument 라고 한다.
	}

}

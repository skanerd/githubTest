package org.opentutorials.javatutorials.method;

public class MethodDemo3 {

	public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();
        // MethodDemo2 처럼 5번을 다 작성하는게 아니라 정의해놓은 메소드를 호출해서 출력하는 것으로 
        // 더 간결하게 표현이 가능하다.
	}

}

package org.opentutorials.javatutorials.method;

public class MethodDemo5 {

	public static void numbering(int init, int limit) { // 인자에서 1, 5라고 작성했기에 매개변수에도 1, 5가 적용된다.
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(1, 5); // 1, 5라고 작성하면 배열의 1번째 index에서 5번째 index까지 라는 뜻.

	}

}

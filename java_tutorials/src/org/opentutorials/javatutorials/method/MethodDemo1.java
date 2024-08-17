package org.opentutorials.javatutorials.method;

public class MethodDemo1 {

	 public static void numbering() { // numbering() 영역이 정의
	        int i = 0;
	        while (i < 10) {
	            System.out.println(i);
	            i++;
	        }
	    }
	 
	 public static void main(String[] args) {
	        numbering(); // 메소드의 호출
	        // numbering() 메소드를 통째로 main 메소드 안에 호출해서 사용한다.
	 }
}

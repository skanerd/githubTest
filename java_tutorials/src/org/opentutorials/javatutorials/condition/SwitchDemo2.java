package org.opentutorials.javatutorials.condition;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int val = 1; // 대입연산자로 1을 넣어준다.
	        if(val == 1){ // == 비교연산자로 값을 비교해준다.
	            System.out.println("one");
	        } else if(val == 2){
	            System.out.println("two");
	        } else if(val == 3){
	            System.out.println("three");
	        } else {
	        	System.out.println("범위 외");
	        }
	        // switch 문은 if 문으로 완벽하게 대체가 가능하다.
	}

}

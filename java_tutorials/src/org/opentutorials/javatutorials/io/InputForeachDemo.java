package org.opentutorials.javatutorials.io;

public class InputForeachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String e : args){
            System.out.println(e);
            
            // Run Configurations - 인자(arguments) 로 One Two Three 를 넣어줬다.
            // 인자(argument)에 넣어준 값이 변수 args 에 입력이 되어 출력된다.
            // for(반복문)이기에 해당 배열의 값이 다 출력될 때까지 반복된다.
        }
	}

}

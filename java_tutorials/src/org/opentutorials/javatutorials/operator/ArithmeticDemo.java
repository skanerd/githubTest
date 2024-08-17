package org.opentutorials.javatutorials.operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int result = 1 + 2;
        System.out.println(result); // 1 + 2 = 3 출력
  
        result = result - 1;
        System.out.println(result); // 3 - 1 = 2 출력
  
        result = result * 2;
        System.out.println(result); // 2 * 2 = 4 출력
  
        result = result / 2;
        System.out.println(result); // 4 / 2 = 2 출력
  
        result = result + 8; // 2 + 8 = 10
        
        result = result % 7; // 10 % 7 = 3(나머지)
        System.out.println(result); // 3(나머지) 출력
	}

}

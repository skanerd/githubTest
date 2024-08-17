package org.opentutorials.javatutorials.method;

public class ReturnDemo2 {
	public static String num(int i) {
        if(i==0){
            return "zero";
        } else if(i==1){
            return "one";
        } else if(i==2){
            return "two";
        } else
        return "none"; // 조건에 맞는 값을 num() 메소드에 리턴하고 ( i　의 값 ) 그렇지 않다면 none 을 리턴한다.
    }
 
    public static void main(String[] args) {
        System.out.println(num(1)); // 리턴한 값을 출력해준다.
    }
}

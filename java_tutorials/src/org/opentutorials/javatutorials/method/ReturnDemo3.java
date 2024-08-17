package org.opentutorials.javatutorials.method;

public class ReturnDemo3 {
	public static String getMember1() {
        return "a";
    }
 
    public static String getMember2() {
        return "b";
    }
 
    public static String getMember3() {
        return "c";
    }
 
    public static void main(String[] args) {
        System.out.println(getMember1());
        System.out.println(getMember2());
        System.out.println(getMember3());
        // 하나의 메소드는 하나의 값만 반활할 수 있기 때문에 각각의 메소드를 작성후 각각 리턴값을 출력해준다.
        // 그렇다면 하나의 메소드에 담긴 배열에서 여러 값을 출력하려면 어떻게 해야할까? (ReturnDemo4)
    }
}

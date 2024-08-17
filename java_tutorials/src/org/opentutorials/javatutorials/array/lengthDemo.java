package org.opentutorials.javatutorials.array;

public class lengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] Group = new String[4]; 
        // 새롭게 만들 String 데이터 타입 배열의 길이는 4개의 원소로 이루어져있다.
        // new 는 객체지향 파트에서 다시 언급되고 공부할 것.
        Group[0] = "a"; // 0 번째 index 의 원소값은 "a"이다. 라고 넣어주기.
        System.out.println(Group.length);
        Group[1] = "b";
        System.out.println(Group.length);
        Group[2] = "c";
        System.out.println(Group.length);
        Group[3] = "d";
        System.out.println(Group.length);
        Group[4] = "e";
        System.out.println(Group.length);
        // 원소의 갯수가 4개를 넘었기에 오류가 발생한다.
        // 배열번호 4가 아니다.
        
        // 해당 배열의 원소가 100개 들어갈 수 있다고 가정해서 [100]을 적고 원소를 [10]까지만 대입해줘도
        // 이미 길이가 100이라고 선언했기에 .length 를 하면 100이 나온다.
        
        // 위에 예시로 든 배열을 배열의 개념으로 정리해보면
        // length 4의 배열
        // 0 번째 index 의 element 는 "a" / 1 번째 index 의 element 는 "b" ...
	}

}

package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {

	 public static String[] getMembers() {
	        String[] members = { "a", "b", "c" };
	        return members; // 리턴한 값은 배열형 데이터이다.(String[ ]로 정의된 메소드이기에)
	    }
	 
	    public static void main(String[] args) {
	        String[] members = getMembers();
	        // getMembers 메소드에서 리턴한 값( String[ ] )을 여기에 호출해준다.
	        // 이제 main 메소드 안에 getMembers 메소드를 호출했다.
	        
	        for (String member : members) {
	        	System.out.println(member);
	        }
	        // for 반복문의 (String member : members) - 반복 변수 ( 각 반복에서 배열 members 의 요소를 가져온다.
	        // 반복 될 때마다 배열의 첫 번째 요소를 시작으로 다음 요소로 이동한다.
	        // 출력은 혼자서 찾아보고 따라해서 만들었기 때문에 자세한 설명이 불가능
	    }

}

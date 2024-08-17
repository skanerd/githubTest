package org.opentutorials.javatutorials.loop;

public class ForeachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[ ] group = { "a", "b", "C" };
        for (String e : group) {
        	// : 뒤에 따라오는 배열에 담겨있는 데이터를 반복문이 동작할 때마다 앞의 변수에 하나씩 담아준다. 
        	// 예문의 경우에는 group 의 원소를 변수 e 에 담아준다.
            System.out.println(e + "를 출력합니다.");
        }
	}

}

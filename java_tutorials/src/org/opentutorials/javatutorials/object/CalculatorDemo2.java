package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {

	public static void sum(int left, int right) {
        System.out.println(left + right);
    }
	// sum() 이라는 메소드를 정의해준다.
	// 정의내용 : 좌항(정수) 우항(정수)
	// 좌항과 우항을 더한 값을 출력해준다.
 
    public static void main(String[] args) {
        sum(10, 20);
        sum(20, 40);
        // sum()메소드를 호출하여 인자(argument) 값을 입력해줌으로서 매개변수(parameter)에 대입해준다.
    }
    // 로직을 작성하여 코드를 보다 효율적으로 작성해주는 행위 = 리팩토링(refactoring)
    // 사전적 의미 = 결과의 변경 없이 코드의 구조를 재조정하는 것. 
    // 주로 가독성을 높이고 유지보수를 편하게 해준다.
}

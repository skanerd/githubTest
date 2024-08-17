package org.opentutorials.javatutorials.method;

public class MethodDemo6 {

	public static String numbering(int init, int limit) { 
		// void가 적혀있지 않으므로 반드시 return 할 것을 암시.
        int i = init; // 인자 argument 에 의해 값은 1이 된다. 
        
        String output = "";
        // 만들어지는 숫자들을 output 이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        // 변수 output 은 아무것도 안 담긴 문자열이다. String 형 메소드이기에 여기서도 String 으로 선언한다.
        while (i < limit) { // 인자 argument 에 의해 값은 5가 된다.
            // 숫자를 화면에 출력하는 대신 변수 output 에 담았다.
            output += i; // output = output + i 와 동일한 의미
            i++;
        }
        // 중요!!! output 에 담겨 있는 문자열을 메소드 외부로 반환하려면
        // 아래와 같이 return 키워드 뒤에 반환하려는 값을
        // 배치하면 된다.
        return output; 
    } // i 는 1 / limit 는 5이므로 output 의 반환값은 1,2,3,4
 
    public static void main(String[] args) { 
    	// return 할 필요가 없으므로 void 를 작성해준다.
        // 메소드 numbering이 반환한 값이 변수 result 에 담긴다.
        String result = numbering(1, 5); 
        // init 과 limit 에 (매개변수 parameter)에 1, 5(인자 argument)가 담기게 된다.
        // 변수 result 의 값을 화면에 출력한다.
        System.out.println(result);
    }

}

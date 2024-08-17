package org.opentutorials.javatutorials.numberstring;

public class CharString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		System.out.println('생'); // 문자(character) ''
		System.out.println("생활코딩"); // 문자열(string) ""
//		System.out.println('생활코딩'); // 문자열을 문자로 표기했기에 에러가 발생한다.
		System.out.println("생");
		System.out.println("생활" + "코딩"); // 문자열 끼리 + 가 가능하다.
		System.out.println("1" + "1"); // ""로 표기했기 때문에 문자 11이 출력된다.
		
		System.out.println("egoing said \"Welcome programming world\"");
		// \(역슬래시)뒤에 "를 작성하면 문자열의 시작과 끝(" ")이 아니라 "를 문자로 인식하도록 강제할 수 있다.
		// escape 기법이라고 한다.
		
		System.out.println("HTML\nCSS\nJavaScript");
		// \n 줄바꿈
	}

}

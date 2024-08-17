package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
//		arrayObj[2] = "three"; 배열의 크기를 초과하기에 오류가 발생한다.
		for (int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		} // 배열로 선언하는 방법

		ArrayList<String> al = new ArrayList<String>();
		// generic을 통해서 넣어주는 값을 String 형이라고 알려줄 수 있다.
		al.add("one");
		// add 메소드는 어떠한 형태의 데이터 타입도 수용가능하다.
		// 단, 데이터 타입이 object 여야 한다. object 는 모든 데이터 타입을 포함하기에.
		// 즉 string "one" 은 ArrayList()에 저장될 때 오브젝트 타입으로 저장된다.
		al.add("two");
		al.add("three");
		al.add("three");
		al.add("three");
		for (int i = 0; i < al.size(); i++) {
			// .leangth가 아니라 .size를 사용한다.

			String value = (String)al.get(i);
			// al.get(i) 앞에 String 을 작성해서 object에서 원래의 형태로 다시 형변환을 해줘야한다.

			System.out.println(al.get(i));
			// 배열을 나타내는 [ ] 이 아니라 ( ) 로 표현한다.
			// 왜? 배열이 아니라 오브젝트 타입이니까.
		} // ArrayList로 선언하는 방법
	}

}
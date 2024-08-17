package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class ListSetDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("two");
		al.add("three");
		al.add("three");
		al.add("five");
		System.out.println("array");
		Iterator ai = al.iterator();
		while (ai.hasNext()) {
			System.out.println(ai.next());
		}

//		HashSet<String> hs = new HashSet<String>();
//		// 제네릭을 통해서 데이터 타입을 미리 명시
//		hs.add("1");
//		hs.add("2");
//		hs.add("2");
//		hs.add("3");
//		hs.add("3");
//		hs.add("4");
//		Iterator hi = hs.iterator();

		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(3);
		Iterator hi = (Iterator) A.iterator();

		System.out.println("\nhashset");
		while (hi.hasNext()) {
			// hasNext() : 반복할 데이터가 있으면 true, 없다면 false 를 리턴한다.
			System.out.println(hi.next());
			// next : hasNext가 true 라는 것은 next 가 리턴할 데이터가 존재한다는 의미이다. 
		}
	}

}
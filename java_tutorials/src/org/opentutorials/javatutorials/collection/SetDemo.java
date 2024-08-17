package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);

		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);

		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);

		System.out.println(A.containsAll(B)); // false
		// A 는 B 의 모든것을 포함한다. - false
		System.out.println(A.containsAll(C)); // true
		// A 는 C 의 모든것을 포함한다. - true
		
		 A.addAll(B);
		 // A 와 B 를 모두 합하겠다. (합집합)
		 // 1,2,3,4,5
		 
		 A.retainAll(B);
		 // A 에도 있고 B 에도 있는 값들만 A 에 담겠다. (교집합)
		 // 3
		 
		 A.removeAll(B);
		 // A 의 값을 버리고 B 에 있는 값들만 담겠다. (차집합)
		 // 3 4 5
		 
		Iterator hi = A.iterator();
		while (hi.hasNext()) {
			System.out.println(hi.next());
		}
	}

}
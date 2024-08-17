package org.opentutorials.javatutorials.collection;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		// 데이터 타입이 2개 지정(제네릭)되어있다. 순서대로 key, value 값의 데이터 타입이다.
		a.put("one", 1); // 인자(key), value
		// map 에는 put 을 사용해서 key, value 값을 넣어준다.
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		System.out.println(a.get("one")); // 1
		System.out.println(a.get("two")); // 2
		System.out.println(a.get("three")); // 3
		System.out.println(a.get("four")); // 4

		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
		// 인자값 a가 (HashMap map) 의 map 에 들어간다.
	}

	static void iteratorUsingForEach(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while (i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
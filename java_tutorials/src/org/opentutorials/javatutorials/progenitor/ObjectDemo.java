package org.opentutorials.javatutorials.progenitor;

class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

//	public boolean equals(Object obj) {
//		Student _obj = (Student) obj;
//		return name == _obj.name;
//	} // 서로 다른 객체더라도 같은 string 을 갖는다면 true 가 되도록한다.
//	  // ⭐질문하기 : 구조의 설명
}

class ObjectDemo {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2); // false - 서로 다른 객체이다.( = 서로 참조 위치가 다르다. )
		System.out.println(s1.equals(s2)); // true를 예상했으니 false
		// 데이터 타입이 참조형(rederence)이기 때문에 참조 동등성(두 객체가 메모리 상에서 같은 객체를 가리키고 있는지)
		// 을 비교하게 된다. 
		// 다른 객체이며, 데이터("egoing")은 동일하다. 다른 객체이기에 false

		String o1 = new String("java");
		String o2 = new String("java");
		System.out.println(o1.equals(o2)); // true
		// String 데이터 타입은 원시형 대우이다.
		// 즉, 저장 위치도 데이터("java")도 같다.
		
		String o3 = "java2";
		String o4 = "java2";
		System.out.println(o3 == o4); // true - 참조위치가 같다. 같은 값이 같은 곳에 존재
		System.out.println(o3.equals(o4)); // true - 내용이 같다.
		// 참조형 데이터 타입은 저장 위치가 다르기에 다른 객체가 되지만 String은 원시형과 같은 대우이므로
		// 저장위치가 같다.
		// 데이터("java2")도 동일하기 때문.
	}
}
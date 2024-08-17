package org.opentutorials.javatutorials.generic;

class StudentInfo {
	public int grade;

	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class Person {
	public Object info;

	Person(Object info) {
		this.info = info;
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		Person p1 = new Person("부장"); // 오류 발생 (컴파일 단계가 아닌 런타임 단계)
		// 코드의 중복을 줄이는 과정에서 person 의 생성자에 들어올 수 있는 
		// 데이터타입을 object 로 해버렸기 때문에 그렇다.
		EmployeeInfo ei = (EmployeeInfo) p1.info;
		System.out.println(ei.rank);
	}
}
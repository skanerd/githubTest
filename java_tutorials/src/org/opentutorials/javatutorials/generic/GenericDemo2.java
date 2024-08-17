package org.opentutorials.javatutorials.generic;

class StudentInfo2 {
	public int grade;

	StudentInfo2(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo2 {
	public int rank;

	EmployeeInfo2(int rank) {
		this.rank = rank;
	}
}

class Person2<T> {
	public T info;

	Person2(T info) {
		this.info = info;
	}
}

public class GenericDemo2 {
	public static void main(String[] args) {
		Person2<EmployeeInfo2> p1 = new Person2<EmployeeInfo2>(new EmployeeInfo2(1));
		EmployeeInfo2 ei1 = p1.info;
		System.out.println(ei1.rank); // 성공

		Person2<String> p2 = new Person2<String>("부장");
		String ei2 = p2.info;
//		System.out.println(ei2.rank); // 컴파일 실패
	}
}
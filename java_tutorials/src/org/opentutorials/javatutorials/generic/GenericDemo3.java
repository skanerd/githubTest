package org.opentutorials.javatutorials.generic;

class EmployeeInfo3 {
	public int rank;

	EmployeeInfo3(int rank) {
		this.rank = rank;
	}
}

class Person3<T, S> {
	public T info;
	public S id;

	Person3(T info, S id) {
		this.info = info;
		this.id = id;
	}
}

public class GenericDemo3 {
	public static void main(String[] args) {
		EmployeeInfo3 e = new EmployeeInfo3(1);
		Integer i = new Integer(10);
		Person3<EmployeeInfo3, Integer> p1 = new Person3<EmployeeInfo3, Integer>(e, i);
		System.out.println(p1.id.intValue());
	}
}
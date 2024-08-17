package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello World";
		String b = new String("Hello World"); //
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // .equals()는 ==과 같은 의미이다. true
	}

}

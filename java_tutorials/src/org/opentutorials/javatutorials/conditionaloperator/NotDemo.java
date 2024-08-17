package org.opentutorials.javatutorials.conditionaloperator;

public class NotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (!true) { // !true   true가 아니라면 : false라면 : if문은 true일 경우 { } 가 실행되기에 { } 가 실행되지 않는다.
            System.out.println(1);
        }
        if (!false) { // !false    false가 아니라면 : true라면 : if문은 true일 경우 { } 가 실행되기 때문에 { } 가 실행된다.
            System.out.println(2);
        }
	}

}

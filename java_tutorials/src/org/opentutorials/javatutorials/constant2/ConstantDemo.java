package org.opentutorials.javatutorials.constant2;

//interface Fruit {
//	int APPLE = 1, int PEACH = 2, BANANA = 3;
//}
/*class Fruit {
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}*/
enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	public String color;
	// 생성자를 가질 수 있다는 것 = 내부적으로 데이터를 가질 수 있다.(필드값을 가질 수 있다.)
	public String getColor() {
		return this.color;
	}
	Fruit(String color) {
		System.out.println("Call Constructor" + this);
		this.color = color;
	} // 클래스와 이름이 같음 메소드 = 생성자
} 
// 위의 class Fruit를 간략화 시킨 것
// 열거를 위한 코드라는 것을 분명하게 표현할 수 있다.

//interface Company {
//	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
//}
/*class Company {
	public static final Company GOOLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
}*/
enum Company {
	GOOGLE, APPLE, ORACLE
}

public class ConstantDemo {
//	public static void main(String[] args) {
//		/*
//		 * 1. 사과
//		 * 2. 복숭아
//		 * 3. 바나나
//		 */
//		int type = 1; // 변수 type 안에는 상수 1이 들어있다.
//		switch (type) {
//		case 1:
//			System.out.println(57);
//			break;
//		case 2:
//			System.out.println(34);
//			break;
//		case 3:
//			System.out.println(93);
//			break;
//		}
//	}

//	public final static int Fruit_APPLE = 1;
//	public final static int Fruit_PEACH = 2;
//	public final static int Fruit_BANANA = 3;
//	public final static int Company_GOOGLE = 1;
//	public final static int Company_APPLE = 2;
//	public final static int Company_ORACLE = 3;
//	final 이기에 변경불가능 = 상수
//	APPLE 이름이 중복되기에 접두사를 붙여주었다.(네임스페이스 기법)
//	상수가 너무 길게 작성되기에 interface 를 이용해서 더 줄여주자.

	public static void main(String[] args) {

//		if (Fruit.APPLE == Company.APPLE) {
//			System.out.println("과일 애플과 기업 애플은 같습니다.");
//		} // 지금은 상수가 1과 2로 다르지만 만약 같은 숫자라면 출력되어버린다.

		Fruit type = Fruit.APPLE;
		switch (type) {
		case APPLE:
			System.out.println(57 + " kcal, color " + Fruit.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(34 + " kcal, color " + Fruit.PEACH.getColor());
			break;
		case BANANA:
			System.out.println(93 + " kcal, color " + Fruit.BANANA.getColor());
			break;
		}
		// switch는 byte, short, char, int, enum, String, Character, Byte, Short, Integer
		// 데이터 타입만 사용 가능하기에 Fruit나 Company 등 사용자 지정 데이터 타입을 사용할 수 없다.
		// if 에서는 사용가능.
	}
}
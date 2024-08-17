package practice;

public class practice {

	public static void main(String[] args) {
		System.out.println("Hello, [[[name]]] ... bye. ".replace("[[[name]]]", "duru")); 
		// [[[name]]] -> duru
		// 문자열이니까 " " 로 가둬주기.

		String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";
		// replaceAll([정규식],[바꿀문자])
		a = a.replaceAll("대한", "민국");
		// 대한 -> 민국
		
		
		System.out.println(a);

		System.out.println(Math.PI); // 3.141592653589793
		System.out.println(Math.floor(Math.PI)); // 3 floor 소숫점 뒤로 버리고 내리기 
		System.out.println(Math.ceil(Math.PI)); // 4  ceil 소숫점 뒤로 버리고 올리기
		System.out.println(Math.ceil(3.0001)); // 4   ceil 소숫점 뒤로 버리고 올리기
		
		int b = 1; // Number -> integer  ... -2, -1 , 0, 1, 2 ...
        System.out.println(b);
         
        double c = 1.1; // real number -> double ... -2.0, -1.0, 0, 1.0, 2.0 ...
        System.out.println(c);
         
        String d = "Hello World";
        System.out.println(d);
        
        String name = "leezche";
        System.out.println("Hello, "+name+" ... "+name+" ... egoing ... bye");
         
        double VAT = 10.0;
        System.out.println(VAT);
        
        
        double z = 1.1;
        double x = 1;
        double x2 = (double) 1;
         
        System.out.println(x);
         
        // int c = 1.1;
        double v = 1.1;
        int e = (int) 1.1;
        System.out.println(e);
         
        // 1 to String 
        String f = Integer.toString(1);
        System.out.println(f.getClass());

		double q = 1.1;
		double w = 1;
		double w2 = (double) 1;

		System.out.println(b);

		// int c = 1.1;
		double y = 1.1;
		int r = (int) 1;
		System.out.println(e);

		// 1 to String
		String g = Integer.toString(1);
		System.out.println(f.getClass());
		
		
	}

}

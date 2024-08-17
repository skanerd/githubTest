class Item2{
    public void print(){
        System.out.println("Hello world");  
    }
}
 
class ClasspathDemo2 {
    public static void main(String[] args){ // 자바를 실행할 때 main이 실행
        Item2 i1 = new Item2(); // Item2 클래스를 인스턴스화
        i1.print();
    }
}
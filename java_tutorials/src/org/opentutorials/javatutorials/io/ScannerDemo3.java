package org.opentutorials.javatutorials.io;
 
import java.util.Scanner;
import java.io.*;
 
public class ScannerDemo3 {
 
    public static void main(String[] args) {
        try {
            File file = new File("out.txt"); // 같은 경로에 있어야한다.
            Scanner sc = new Scanner(file); // 파일(형식)을 가져올 것이다.
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
        	// 예외의 경우도 설정해준다.
        	// 객체지향을 배울 때 좀 더 자세히 배울 것.
            e.printStackTrace();
        }
         
    }
 
}
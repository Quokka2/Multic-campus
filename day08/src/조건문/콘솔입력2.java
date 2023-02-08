package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력>> ");
		String data = sc.next();
		System.out.println("나의 이름은 " + data);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("나이 입력>> ");
		int data1 = sc.nextInt();
		System.out.println("나의 나이는 " + data1+"세");
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("취미 입력>> ");
		String data2 = sc.next();
		System.out.println("나의 취미는 " + data2 + "입니다.!");
		
		sc.close();
		sc1.close();
		sc2.close();
	}
}

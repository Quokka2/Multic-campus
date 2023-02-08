package 조건문;

import java.util.Scanner;

public class 마지막문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사과 구매 갯수>> ");
		int a1 = sc.nextInt();
		System.out.print("사과 개당 가격>> ");
		int a2 = sc.nextInt();
		System.out.print("딸기 구매 갯수>> ");
		int s1 = sc.nextInt();
		System.out.print("딸기 개당 가격>> ");
		int s2 = sc.nextInt();
		
		int total = (a1*a2) + (s1*s2);
		
		System.out.println("=======================");
		System.out.println("사과 구매 가격은 " + (a1*a2) + "입니다.");
		System.out.println("딸기 구매 가격은 " + (s1*s2) + "입니다.");
		System.out.println("전체 구매 가격은 " + (total) + "입니다.");
		
		sc.close();
	}

}

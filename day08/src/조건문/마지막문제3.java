package 조건문;

import java.util.Scanner;

public class 마지막문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작>> ");
		int st = sc.nextInt();
		System.out.print("종료>> ");
		int end = sc.nextInt();
		int sum = 0;
		for (int i = st; i <= end; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		sc.close();
	}

}

package 조건문;

import java.util.Scanner;

public class 마지막문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID = ");
		String data1 = sc.next();
		System.out.print("PW = ");
		String data2 = sc.next();
		if (data1.equals("root") && data2.equals("1234")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		
		sc.close();
	}

}

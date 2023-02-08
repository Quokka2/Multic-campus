package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력>> ");
		String data = sc.next();
		System.out.println("나의 이름은 " + data);

		System.out.print("키 입력>> ");
		double data1 = sc.nextDouble();
		System.out.println("나의 키는 " + data1 + "입니다.");

		System.out.print("체중 입력>> ");
		double data2 = sc.nextDouble();
		System.out.println("나의 체중는 " + data2 + "입니다.");

		System.out.print("식사여부 입력(true/false)>> ");
		boolean data3 = sc.nextBoolean();
		System.out.println("나는 저녁을 " + data3 + "했습니다.");

		System.out.print("좌우명 입력>> ");
		sc.nextLine(); // 엔터 처리 하려고 쓴거!
		String data4 = sc.nextLine();
		System.out.println("나의 좌우명은 " + data4 + "입니다.!");

		sc.close();
	}
}

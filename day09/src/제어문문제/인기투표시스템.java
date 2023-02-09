package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int data = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		
		while (true) {
			System.out.println("1.아이유 2.BTS 3.뉴진스 4.종료");
			System.out.print("선택 번호>> ");
			data++;
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("시스템을 종료합니다.");
				System.out.println("전체 투표 횟수는" + (data - 1) + "표");
				System.out.println("아이유 : "+ a +"표");
				System.out.println("유재석 : "+ b +"표");
				System.out.println("BTS : "+ c +"표");
				break;
			}
			if (choice == 1) {
				a++;
			}else if (choice == 2) {
				b++;
			}else if (choice == 3) {
				c++;
			}else {
				System.out.println("");
			}
		}
		sc.close();
	}
}
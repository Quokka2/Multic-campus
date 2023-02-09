package 로그인;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int target = r.nextInt(100);
		Scanner sc = new Scanner(System.in);
		
		int data = 0;
		while (true) {
			System.out.println("1. 아이유 2. BTS 3. 뉴진스 4. 종료");
			System.out.print("선택 번호>> ");
			data = sc.nextInt();
			if (data == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("오답입니다.");
				System.out.println("다시 시도해주세요.");
				if (data >= target) {
					System.out.println("다운");
				} else {
					System.out.println("업");
				}
			}
		}
		sc.close();
	}

}

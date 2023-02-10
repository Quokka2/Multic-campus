package 배열응용;

import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		// 배열 변수 설정
		int[] x = new int[10000];
		Random r = new Random(42);
		for (int i = 0; i < x.length; i++) {
			x[i] = r.nextInt(451);
		}
		// 1. 만점자가 몇 명인지?? 누구인지(인덱스)
		// 2. 0점이 몇 명인지?
		// 3. 평균은 어떻게 되었는지?? 합계를 먼저 구해야 함
		int count = 0;
		int y = 0;
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 450) {
				count++;
				System.out.println(count + " : 만점자 번호는" + i + "번");
			}
			if (x[i] == 0) {
				y++;
				System.out.println(y + " : 낙제생 번호는" + i + "번");
			}
			if (x[i] >= 0) {
				sum = sum + x[i];
			}
		}
		double avg = (double) sum / x.length; // 평균

		int avgPlusMinus = 0;
		for (int i : x) {
			if ((avg - 50 <= i) && (i <= avg + 50)) {
				avgPlusMinus++;
			}
		}

		System.out.println("======================");
		System.out.println("평균 범위에 있는 수험생수는 " + avgPlusMinus + "명");
		System.out.println("전체 만점자 수는" + count + "명");
		System.out.println("전체 낙제생 수는" + y + "명");
		System.out.println("전체 평균 : " + avg);
	}
}

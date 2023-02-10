package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {

		int[] jumsu2 = new int[1000];
		int count = 0;
		int sum = 0;

		Random r = new Random();

		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(20) + 1;
		}
		for (int x : jumsu2) {
			if (x >= 19) {
				count++;
				sum = sum + x;
			}
		}
		System.out.println(count);
		System.out.println(sum);

	}

}

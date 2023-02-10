package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1.
		int[] x = new int[5];
		for (int i = 0; i < x.length; i++) {
			System.out.println("숫자 입력 : ");
			x[i] = sc.nextInt();
		}
		int sum = 0;
		sum = x[0] + x[2];
		System.out.println(sum);

		// 2.
		String[] y = new String[3];
		for (int i = 0; i < y.length; i++) {
			System.out.println("언어 입력 : ");
			y[i] = sc.next(); // 일반적으로 next를 더 많이 쓴다 코테에서도 sc많이 나옴
		}
		System.out.println(y[0] + " 보다는 " + y[1]);
		sc.close();
	}
}

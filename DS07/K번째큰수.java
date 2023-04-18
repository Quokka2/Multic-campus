package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = { 3, 4, 5, 1, 2, 8, 7, 6 };
		int k = 2;

		Arrays.sort(num);
		for (int x : num) {
			System.out.print(x + " ");
		}
		System.out.println();
		String num2 = Arrays.toString(num);
		System.out.println(num2);
		System.out.println(Arrays.toString(num));

	}

}

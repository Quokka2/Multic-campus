package 배열응용;

import java.util.Random;

public class 우리반성적변동2 {

	public static void main(String[] args) {
		Random r = new Random(42);

		int[] n1 = new int[10000];
		int[] n2 = new int[10000];
		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}
		int count1 = 0; // 동일한 개수 카운트
		int count2 = 0; // 동일하지 않은 개수 카운트
		int count3 = 0;
		int count4 = 0;

		for (int i = 0; i < n2.length; i++) {
			if (n1[i] == n2[i]) {
				count1++;
			} else {
				count2++;
			}
			if (n1[i] < n2[i]) {
				count3++;
			} else if (n1[i] > n2[i]) {
				count4++;
			}
		} // for
		System.out.println("1, 2학기 성적 동일 >> " + count1 + "명");
		System.out.println("1, 2학기 성적 변동 >> " + count2 + "명");
		System.out.println("2학기 성적 상승 >> " + count3 + "명");
		System.out.println("2학기 성적 하락 >> " + count4 + "명");

	}

}

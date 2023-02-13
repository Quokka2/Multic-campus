package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] a = { 44, 66, 22, 99, 100 };
		int[] b = a.clone();
		System.out.println(a == b);
		b[0] = 22;
		b[2] = 88;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			System.out.print(b[i] + " ");
			if (a[i] == b[i]) {
				count1++;
			}else if (a[i] < b[i]) {
				count2++;
				System.out.println(과목명[i]);
			}
		}
		System.out.println();
		System.out.println("동일한 과목수는 : " + count1);
		System.out.println("상승한 과목수는 : " + count2);
	}
}

package 배열응용;

public class 우리반성적변동3 {

	public static void main(String[] args) {
		// 배열 변수
		String[] name = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] a1 = { 77, 88, 99, 55, 70 };
		int[] a2 = { 99, 100, 88, 80, 70 };
		// 초기화
		int count1 = 0;
		int count2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int avg1 = 0;
		int avg2 = 0;

		// 성적 배열 변수 호출
		for (int i = 0; i < a2.length; i++) {
			if (a1[i] < a2[i]) {
				count1++;
			}
			if (a1[i] == a2[i]) {
				count2++;
			}
			// 3번
			if (a2[i] == 100) {
				System.out.println("2학기 성적 만점 >> " + (i + 1) + "번 " + name[i]);
			}
			sum1 = sum1 + a1[i];
			sum2 = sum2 + a2[i];
			avg1 = sum1 / a1.length;
			avg2 = sum2 / a2.length;

			// 5번
			if (name[i] == "뉴진스") {
				System.out.println("뉴진스 성적 1학기 : " + a1[i] + " 2학기 : " + a2[i]);
			}
		}
		// 1번
		System.out.println("2학기 성적 상승 >> " + count1 + "명");
		// 2번
		System.out.println("2학기 성적 동일 >> " + count2 + "명");

		// 4번
		if (avg1 > avg2) {
			System.out.println("1학기 승");
		} else if (avg1 < avg2) {
			System.out.println("2학기 승");
		} else {
			System.out.println("무승부");
		}
	}
}

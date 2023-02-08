package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			// i가 8이 되면 for문 종료!!
			if (i == 8) {
				System.exit(0);
			}
			if (i % 2 != 0) { // 홀수
				continue; //이번 i만 for문 안의 내용을 실행하지 말아라!
			}
			System.out.println(i);
		}

	}

}

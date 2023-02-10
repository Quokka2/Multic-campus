package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		String[] x = { "서울", "부산", "대구", "성남", "인천" };
		for (String s : x) {
			System.out.print(s + " ");
		}
		System.out.println();
		String[] y = { "red", "green", "yellow", "blue", "lime" };
		for (String s : y) {
			System.out.print(s + " ");
		}
		System.out.println();
		double[] z = { 1.1, 1.2, 1.3, 1.4, 1.5 };
		for (double s : z) {
			System.out.print(s + " ");
		}

	}

}

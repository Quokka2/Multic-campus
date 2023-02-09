package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
//		int[] x = new int[10];
//		System.out.println(x.length);
//		x[0] = 10;
//		x[1] = 20;
//		
//		for (int i = 0; i < x.length; i++) {
//			System.out.print(x[i] + " ");
//		}

//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);

		// 가족 성별
		char[] sex = { '남', '여', '남', '남' };
		for (int i = 0; i < sex.length; i++) {
			System.out.print(sex[i] + " ");
		}System.out.println();
		// 가족 이름
		String[] name = { "아빠곰", "엄마곰", "아들곰1", "아들곰2" };
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}System.out.println();
		// 가족 시력
		double[] eye = { 2.0, 2.0, 1.5, 1.5 };
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}System.out.println();
		// 가족 밥먹음?
		boolean[] food = { true, true, true, true };
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}

	}

}

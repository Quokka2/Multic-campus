package 메서드연습;

public class 내가게2 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		int result1 = cal.add(300, 200);
		double result2 = cal.add(11.1, 22.9);
		double result3 = cal.add(11.1, 1);
		String result4 = cal.add("점심", 1);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}

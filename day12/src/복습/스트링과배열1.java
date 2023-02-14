package 복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		// 스프링의 일부를 추출, 확인사용하는 메서드
		String s1 = "나는 프로그래머야";
		String s2 = "진짜!!!";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(0));
		char c = s1.charAt(0);
		System.out.println(s1.endsWith("야"));
		boolean result = s1.endsWith("야");
		String result2 = s1.substring(3); // 인덱스 3부터 끝까지 추출
		String result3 = s1.substring(3, 8); // 인덱스 3부터 7번까지 추출
		boolean result4 = s1.contains(s2);
		int index = s1.lastIndexOf("프"); // 프 글자의 자리수 축출
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s1.replace("나", "너")); // 비파괴 함수

	}

}

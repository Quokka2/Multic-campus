package 복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		// 스프링의 일부를 추출, 확인사용하는 메서드
		String s = "   010-1111-2222   ";
		System.out.println(s.trim()); // 공백제거
		String s2 = s.trim();
		// 문자열 "-"을 기준으로 문자열 3개로 분리 후 배열로 저장
		String[] s3 = s2.split("-");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		// 배열의 첫번째 문자열을 구분
		if (s3[0].equals("010")) {
			System.out.println("SK");
		} else if (s3[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("APPLE");
		}
		// 두번째 문자열의 길이가 4개 이상이면 최신폰 아니면 올드폰
		if (s3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		// 전체 전화번호의 길이가 10글자 이상이면 유효한 아니면 유효하지 않은 전화번호
		int total = s3[0].length() + s3[1].length() + s3[2].length();
		System.out.println(total);
		if (total >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않는 전화번호");
		}
	}

}

package 복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"부자","요리","식도락"},
				{"독서","게임","쇼핑"},
				{"영화","캠핑","휴양"}
		};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}
}

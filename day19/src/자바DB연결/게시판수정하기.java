package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 NO와 CONTENT를 입력하세요.");

		int no = sc.nextInt();
		String content = sc.next();

		Bbs3DAO dao = new Bbs3DAO();
		dao.update(no, content);

	}
}

package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정보를 입력하세요.(NO/TITLE/CONTENT/WRITER)");

		int no = sc.nextInt();
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();

		Bbs3DAO dao = new Bbs3DAO();
		dao.insert(no, title, content, writer);
	}
}

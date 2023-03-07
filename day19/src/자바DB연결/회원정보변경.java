package 자바DB연결;

import java.util.Scanner;

public class 회원정보변경 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 ID와 TEL를 입력하세요.");

		String id = sc.next();
		String tel = sc.next();

		MemberDAO2 dao = new MemberDAO2();
		dao.update(id, tel);
		
	}
}

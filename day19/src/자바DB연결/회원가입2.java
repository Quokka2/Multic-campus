package 자바DB연결;

import java.util.Scanner;

public class 회원가입2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정보를 입력하세요.(ID/PW/NAME/TEL)");

		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		String tel = sc.next();

		MemberDAO2 dao = new MemberDAO2();
		dao.insert(id, pw, name, tel);
	}
}

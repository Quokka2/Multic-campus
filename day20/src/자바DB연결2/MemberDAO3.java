package 자바DB연결2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import 화면DB연결2.MemberVO;

public class MemberDAO3 {

	public int delete(String id) {
		int result = 0;
		try {
			// 1. 오라클 11g와 연결한 부품 설정 / 커넥터 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			// 2. 오라클 11g에 연결해보자.(java --- oracle) / DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			// 3. SQL문을 만든다.
			String sql = "delete from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)로 만들어주기.");
			// 4. SQL문을 오라클프로그램에 전송.
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("탈퇴 성공.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(MemberVO bag) {
		int result = 0;
		try {
			// 1. 오라클 11g와 연결한 부품 설정 / 커넥터 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			// 2. 오라클 11g에 연결해보자.(java --- oracle) / DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			// 3. SQL문을 만든다.
			String sql = "update hr.MEMBER set tel=? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTel());
			System.out.println("3. SQL문 부품(객체)로 만들어주기.");
			// 4. SQL문을 오라클프로그램에 전송.
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result >= 1) {
				System.out.println("수정 성공.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int insert(MemberVO bag) {
		int result = 0;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());

			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

}

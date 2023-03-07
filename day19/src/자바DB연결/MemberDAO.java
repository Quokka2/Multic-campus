package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {

	public void insert() {
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
			String sql = "insert into hr.MEMBER values ('win3', 'win3', 'win3', 'win3')";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 부품(객체)로 만들어주기.");
			// 4. SQL문을 오라클프로그램에 전송.
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

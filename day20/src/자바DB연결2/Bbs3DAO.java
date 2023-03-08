package 자바DB연결2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//테이블 하나당 DAO하나! ==> CUD를 완성!!
public class Bbs3DAO {

	public void delete(int no) {
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
			String sql = "delete from hr.BBS3 where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)로 만들어주기.");
			// 4. SQL문을 오라클프로그램에 전송.
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update(int no, String content) {
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
			String sql = "update hr.BBS3 set content = ? where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, content);
			ps.setInt(2, no);
			System.out.println("3. SQL문 부품(객체)로 만들어주기.");
			// 4. SQL문을 오라클프로그램에 전송.
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(int no, String title, String content, String writer) {

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			// 3. SQL문을 만든다.
			String sql = "insert into hr.BBS3 values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			// 4. SQL문을 오라클프로그램에 전송.
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

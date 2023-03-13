package 미니프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProDAO {
	// insert문
	public int insert(ProVO bag) {
		int result = 0;
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
			// 3. SQL문 생성
			String sql = "insert into HR.MP_BAS values (?, ?, ?, ?, ?)";
			// SQL문장을 담당하는 객체로 만들어줘야 자바가 인식가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bag.getCode()); // SQL문 ? 에 입력할 데이터를 순서대로 작성
			ps.setString(2, bag.getName()); // 매게변수가 bag으로 들어오니까 가방에서 데이터를 꺼내서 입력
			ps.setString(3, bag.getCost());
			ps.setString(4, bag.getSort());
			ps.setString(5, bag.getId());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			// 4. SQL문 전송
			result = ps.executeUpdate(); // 전송이 잘되면 result = 1;로 반환
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("장바구니 입력 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// delete문
	public int delete(ProVO bag) {
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
			String sql = "delete from HR.MP_BAS where code = ? and id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bag.getCode());
			ps.setString(2, bag.getId());
			System.out.println("3. SQL문 부품(객체)로 만들어주기.");
			// 4. SQL문 전송
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// ArrayList를 이용한 table 출력
	public ArrayList<ProVO> list() {
		ResultSet rs = null;
		ArrayList<ProVO> list = new ArrayList<>();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select * from HR.MP_BAS ORDER BY CODE";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();
			while (rs.next()) {
				int code = rs.getInt(1);
				String name = rs.getString(2);
				String cost = rs.getString(3);
				String sort = rs.getString(4);
				String id = rs.getString(5);
				System.out.println("검색한 결과 >> " + code + " " + name + " " + cost + " " + sort + " " + id);

				ProVO bag = null;
				bag = new ProVO();
				bag.setCode(code);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				bag.setId(id);

				list.add(bag);
				System.out.println("리스트에 들어간 가방수>> " + list.size());
			}
			// DB처리와 관련된 메모리 할당된 것 해제시켜주자.
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// read
	public ProVO2 one(int code) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가! 들어가 있음.
		// 참조형 변수를 초기화할 때는 null(주소가 없다라는 의미)
		ProVO2 bag2 = null;

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

			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!
			String sql = "select * from HR.MP_PRO where code = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, code);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시, CUD사용하는 executeUpdate랑 다르다.
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음. 성공.");
				int code2 = rs.getInt(1); // code
				String name = rs.getString(2); // name
				String cost = rs.getString(3); // cost
				String sort = rs.getString(5); // sort
				System.out.println(code2 + " " + name + " " + cost + " " + sort);

				bag2 = new ProVO2();
				bag2.setCode(code2);
				bag2.setName(name);
				bag2.setCost(cost);
				bag2.setSort(sort);
			} else {
				System.out.println("검색결과 없음. 실패.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag2; // 검색결과가 있어서 if문이 실행된 후 bag2로 반환해준다.
	}

	// read
	public ProVO3 one1(String id) {
		ResultSet rs = null;
		ProVO3 bag3 = null;

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
			String sql = "select * from HR.MP_CUS where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			// 4. SQL문 전송
			rs = ps.executeQuery(); // select
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) {
				System.out.println("검색결과 있음. 성공.");
				String id2 = rs.getString(1);
				System.out.println(id2 + "");

				bag3 = new ProVO3();
				bag3.setId(id2);
			} else {
				System.out.println("검색결과 없음. 실패.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag3;
	}
}

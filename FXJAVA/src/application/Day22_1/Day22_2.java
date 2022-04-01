package application.Day22_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class Day22_2 {
	//1. 필드
	private Connection connection; // 연동객체
	//2. 생성자
	public Day22_2() {
		
		//1. DB 드라이브 클래스 호출 [DB 회사 마다 다름]
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					// JDBC : JAVA DABABASE CONNECTION
					// jdbc.mysql// IP주소(본인 pc이면 localhost : port / DB이름?DB시간설정)
					// ,계정명, DB비밀번호
					"jdbc:mysql://localhost:3306/javafx?server"
					,"root"
					,"1234");
			System.out.println("DB 연동 성공");
		} catch (Exception e) {
			System.out.println("DB 연동 실패");
		}
		
		
	}
	//3. 데이터삽입 메소드
	public boolean write(String 작성자, String 내용) {
		
		// 1. SQL 작성[ DB내 테이블 데이터 사입 ]
			//db내 테이블에 데이터 저장 : insert into 테이블명 (필드명1, 필드명2) values(필드명1의값, 필드명2의값)
		String sql = "insert into test(writer, content) values(?,?)";
		try {
			// 2. SQL 설정 [ 연결된 DB에 SQL 설정]
				// PreparedStatement : 연결된 DB에서 테이블 조작(삽입, 삭제, 수정, 생성) 할때 쓰는 인터페이스
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, 작성자); // sql내 작성한 첫번째 ? 에 변수 넣기
			ps.setString(2, 내용);  // sql내 작성한 두번째 ? 에 변수 넣기
			// 3. SQL 실행
			ps.executeUpdate(); // sql 삽입 실행
			// * 성공시 true
			return true;
		} catch (Exception e) {
			System.out.println("sql 연결실패 사유: " + e);
		}
		// * 실패시 false
		return false;
	}
	
	// 4. 데이터 호출 메소드
	public ArrayList<Data> get(){
		
		// * DB에서 가져온 데이터를 저장할 리스트 선언
		ArrayList<Data> 데이터목록 = new ArrayList<>();
		
		try {
			// 1. sql 작선 [데이터 호출]
		 		// select * (모든필드) from 테이블명
			String sql = "select * from test";
			// 2. sql 조작
			PreparedStatement ps = connection.prepareStatement(sql);
			// 3. SQL 실행
			ResultSet rs = ps.executeQuery();
			// * 결과물 하나가 아니고 여러개 이므로 반복문 사용해서
				// 한줄씩 객체화 -> 리스트에 저장
			while(rs.next()) {// 다음 줄[레코드] 가 있으면 / 다음 줄 가져오기
				// 객체화
				Data temp = new Data(rs.getInt(1), rs.getString(2), rs.getString(3));
				// 2. 객체 리스트에 저장
				데이터목록.add(temp);
			}
			//성공시
			return 데이터목록;
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 실패시
		return null;
	}
	
	
	
}

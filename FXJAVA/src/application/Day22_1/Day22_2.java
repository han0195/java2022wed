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
	//1. �ʵ�
	private Connection connection; // ������ü
	//2. ������
	public Day22_2() {
		
		//1. DB ����̺� Ŭ���� ȣ�� [DB ȸ�� ���� �ٸ�]
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					// JDBC : JAVA DABABASE CONNECTION
					// jdbc.mysql// IP�ּ�(���� pc�̸� localhost : port / DB�̸�?DB�ð�����)
					// ,������, DB��й�ȣ
					"jdbc:mysql://localhost:3306/javafx?server"
					,"root"
					,"1234");
			System.out.println("DB ���� ����");
		} catch (Exception e) {
			System.out.println("DB ���� ����");
		}
		
		
	}
	//3. �����ͻ��� �޼ҵ�
	public boolean write(String �ۼ���, String ����) {
		
		// 1. SQL �ۼ�[ DB�� ���̺� ������ ���� ]
			//db�� ���̺� ������ ���� : insert into ���̺�� (�ʵ��1, �ʵ��2) values(�ʵ��1�ǰ�, �ʵ��2�ǰ�)
		String sql = "insert into test(writer, content) values(?,?)";
		try {
			// 2. SQL ���� [ ����� DB�� SQL ����]
				// PreparedStatement : ����� DB���� ���̺� ����(����, ����, ����, ����) �Ҷ� ���� �������̽�
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, �ۼ���); // sql�� �ۼ��� ù��° ? �� ���� �ֱ�
			ps.setString(2, ����);  // sql�� �ۼ��� �ι�° ? �� ���� �ֱ�
			// 3. SQL ����
			ps.executeUpdate(); // sql ���� ����
			// * ������ true
			return true;
		} catch (Exception e) {
			System.out.println("sql ������� ����: " + e);
		}
		// * ���н� false
		return false;
	}
	
	// 4. ������ ȣ�� �޼ҵ�
	public ArrayList<Data> get(){
		
		// * DB���� ������ �����͸� ������ ����Ʈ ����
		ArrayList<Data> �����͸�� = new ArrayList<>();
		
		try {
			// 1. sql �ۼ� [������ ȣ��]
		 		// select * (����ʵ�) from ���̺��
			String sql = "select * from test";
			// 2. sql ����
			PreparedStatement ps = connection.prepareStatement(sql);
			// 3. SQL ����
			ResultSet rs = ps.executeQuery();
			// * ����� �ϳ��� �ƴϰ� ������ �̹Ƿ� �ݺ��� ����ؼ�
				// ���پ� ��üȭ -> ����Ʈ�� ����
			while(rs.next()) {// ���� ��[���ڵ�] �� ������ / ���� �� ��������
				// ��üȭ
				Data temp = new Data(rs.getInt(1), rs.getString(2), rs.getString(3));
				// 2. ��ü ����Ʈ�� ����
				�����͸��.add(temp);
			}
			//������
			return �����͸��;
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ���н�
		return null;
	}
	
	
	
}

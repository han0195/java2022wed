package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.product;
import dto.reply;

public class productdao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static productdao productdao = new productdao();
	
	public productdao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB 드라이버 가져오기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234"); // 2. DB 주소 연결 
		} catch (Exception e) {
			
		}
	}
	// 1. 제품 등록
	public boolean add(product product) {
		try {
			String sql = "insert into product(pname,pimg,pcontent,pcategory,pprice,pactivation,mnum)values(?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, product.getPname());
			ps.setString(2, product.getPimg());
			ps.setString(3, product.getPcontent());
			ps.setString(4, product.getPcategory());
			ps.setInt(5, product.getPprice());
			ps.setInt(6, product.getPactivation());
			ps.setInt(7, product.getMnum());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
		
		}
		return false;
	}
	// 2. 모든 제품 출력 [ tableview 사용x -> arraylist 사용]
	public ArrayList<product> list(){
		ArrayList<product> productlist = new ArrayList<product>();
		try {
			String sql = "select * from product";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				product product = new product(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getInt(7),
						rs.getString(8),
						rs.getInt(9)
						);
				productlist.add(product);
			}
			return productlist;
		} catch (Exception e) {
			System.out.println("[SQL 오류]" + e);
		}
		return null;
	}
	// 3. 제품 조회
	
	// 4. 제품 삭제
	public boolean productdelet(int pnum) {
		try {
			String sql = "delete from product where pnum = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, pnum);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("[SQL 오류]" + e);
		}
		return false;
	}
	// 5. 제품 수정
	public boolean productupdate(product product) {
		try {
			String sql = "update product set pname=?,pimg=?,pcontent=?,pcategory=?,pprice=? where pnum=?";
			ps = con.prepareStatement(sql);
			ps.setString( 1 , product.getPname() );
			ps.setString( 2 , product.getPimg() );
			ps.setString( 3 , product.getPcontent() );
			ps.setString( 4 , product.getPcategory() );
			ps.setInt( 5 , product.getPprice() );
			ps.setInt( 6 , product.getPnum() );
			ps.executeUpdate();
			return true;
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return false;
	}
}

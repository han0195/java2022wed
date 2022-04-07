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
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB ����̹� ��������
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234"); // 2. DB �ּ� ���� 
		} catch (Exception e) {
			
		}
	}
	// 1. ��ǰ ���
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
	// 2. ��� ��ǰ ��� [ tableview ���x -> arraylist ���]
	public ArrayList<product> list(String category, String search){
		ArrayList<product> productlist = new ArrayList<product>();
		try {
			String sql = null;
			if(search == null) {
				sql = "select * from product where pcategory = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, category);
			}else {
				sql = "select * from product where pcategory = ? and pname like '%"+search+"%'";
				ps = con.prepareStatement(sql);
				ps.setString(1, category);
			}
			
			
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
			System.out.println("[SQL ����]" + e);
		}
		return null;
	}
	// 3. ��ǰ ��ȸ
	
	// 4. ��ǰ ����
	public boolean productdelet(int pnum) {
		try {
			String sql = "delete from product where pnum = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, pnum);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("[SQL ����]" + e);
		}
		return false;
	}
	// 5. ��ǰ ����
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
		}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
		return false;
	}
	public boolean activation(int pnum) {
		try {
			String sql = "select pactivation from product where pnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, pnum);
			rs = ps.executeQuery();
			if(rs.next()) { // �˻������ �����ϸ� �������ڵ� ��������
					String upsql = null;
				if(rs.getInt(1) == 1) {
					upsql = "update product set pactivation = 2 where pnum=?";
				}else if(rs.getInt(1) == 2) {
					upsql = "update product set pactivation = 3 where pnum=?";
				}else if (rs.getInt(1) == 3) {
					upsql = "update product set pactivation = 1 where pnum=?";
				}
				
				ps = con.prepareStatement(upsql);
				ps.setInt(1, pnum);
				ps.executeLargeUpdate();
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
		
	}
}
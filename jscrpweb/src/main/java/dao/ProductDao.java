package dao;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mysql.cj.xdevapi.JsonArray;

import controller.board.rereplywrite;
import dto.Cart;
import dto.Category;
import dto.Product;
import dto.Stock;

public class ProductDao extends Dao {
	// 부모클래스의 생성자 호출 -> db 연결
	public ProductDao() {
		super();
	}

	// 외부클래스에서 접근 객체
	private static ProductDao productDao = new ProductDao();

	public static ProductDao getProductDao() {
		return productDao;
	}

	// 메소드는 반환타입 에 따른 return 값 설정
	// 반환타입이 클래스이면 -> null , 객체명
	// 반환타입이 기본자료형이면 -> false , 0 , 2 , 0.1
///////////////////////////////////  카테고리 ////////////////////////
	// 1. 카테고리 등록 [ C ]
	public boolean csave(String cname) {
		String sql = "insert into category(cname)values('" + cname + "')";
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	// 2. 카테고리 호출 [ R ]
	public ArrayList<Category> getcategorylist() {
		ArrayList<Category> list = new ArrayList<Category>();
		String sql = "select * from category";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) { // 1개 호출시 if // 여러개 호출시 while
				Category category = new Category(rs.getInt(1), rs.getString(2));
				list.add(category);
			}
			return list;
		} catch (Exception e) {
		}
		return null;
	}

	// 3. 카테고리 수정 [ U ]
	// 4. 카테고리 삭제 [ D ]
///////////////////////////////////  제품 ////////////////////////////////	
	// 1. 제품 등록
	public boolean psave(Product product) {
		String sql = "insert into product(pname,pprice,pdiscount,pimg,cno ) " + "values(?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, product.getPname());
			ps.setInt(2, product.getPprice());
			ps.setFloat(3, product.getPdiscount());
			ps.setString(4, product.getPimg());
			ps.setInt(5, product.getCno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	// 2. 제품 모든 호출
	public ArrayList<Product> getproductlist() {
		ArrayList<Product> products = new ArrayList<Product>();

		String sql = "select * from product";

		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getInt(5),
						rs.getString(6), rs.getInt(7));
				products.add(product);
			}
			return products;
		} catch (Exception e) {
		}
		return null;
	}

	// 3. 제품 개별 호출
	public Product getproduct(int pno) {
		String sql = "select * from product where pno = " + pno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				Product product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getInt(5),
						rs.getString(6), rs.getInt(7));
				return product;
			}
		} catch (Exception e) {
		}
		return null;
	}

	// 4. 제품 수정
	// 4-2 제품 상태 변경
	public boolean activechange(int pno, int active) {
		String sql = "update product set pactive = " + active + " where pno=" + pno;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	// 5. 제품 삭제
///////////////////////////////////  재고 ////////////////////////////////	
	// 1. 제품의 재고 등록
	public boolean ssvae(Stock stock) {
		try {
			String sql = "insert into stock( scolor , ssize , samount , pno )values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, stock.getScolor());
			ps.setString(2, stock.getSsize());
			ps.setInt(3, stock.getSamount());
			ps.setInt(4, stock.getPno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	// 2. 제품의 재고 호출
	public ArrayList<Stock> getStock(int pno) {
		ArrayList<Stock> list = new ArrayList<Stock>();
		try {
			String sql = "select * from stock where pno = " + pno + " order by scolor asc , ssize desc ";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Stock stock = new Stock(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));
				list.add(stock);
			}
			return list;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	// 3. 제품의 재고 수정
	public boolean stockupdate(int sno, int samount) {
		String sql = "update stock set samount = " + samount + " where sno=" + sno;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}

	// 4. 제품의 재고 삭제
//////////////////////////찜하기/////////////////////////////////////////
	public int saveplike(int pno, int mno) {
		try {
			// 1. 검색 제품번호와 회원번호가 동일하면
			String sql = "select plikeno from plike where pno=" + pno + " and mno=" + mno;
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) { // 2. 만약에 존재하면 삭제처리
				sql = "delete from plike where plikeno = " + rs.getInt(1);
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
				return 2; // 삭제
			} else { // 3. 만약에 존재하지 않으면 등록처리
				sql = "insert into plike( pno , mno )values( " + pno + "," + mno + " ) ";
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
				return 1; // 등록
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return 3; // DB오류
	}
	
	public boolean getplike(int pno, int mno) {
		String sql = "select * from plike where pno=? and mno=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, pno);
			ps.setInt(2, mno);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("ㅋㅋㅋㅋsef" + e);
		}
		return false;
	}
	 ////////////////////////장바구니///////////////////////
	public boolean savecart(  Cart cart ) {
		String sql = "select cartno from cart where sno= ? and mno= ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, cart.getSno());
			ps.setInt(2, cart.getMno());
			rs = ps.executeQuery();
			if(rs.next()) {	//1. 장바구니내 동일한 제품이 존재하면 수량 업데이트 처리
				sql = "update cart set samount = samount + ?, totalprice = totalprice + ? where cartno=?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, cart.getSamount());
				ps.setInt(2, cart.getTotalprice());
				ps.setInt(3, cart.getCartno());
				ps.executeUpdate();return true;
			}else {	//2. 존재하지않으면 등록
				sql = "insert into cart(samount, totalprice, sno, mno)values(?,?,?,?)";
				ps = con.prepareStatement(sql);
				ps.setInt(1, cart.getSamount());
				ps.setInt(2, cart.getTotalprice());
				ps.setInt(3, cart.getSno());
				ps.setInt(4, cart.getMno());
				ps.executeUpdate();	return true;	
			}	
		} catch (Exception e) {
			System.out.println("sef" + e);
		}
		return false;
	}
	
	// 장바구니 출력 메소드 [  
		public JSONArray getcart( int mno ) {
			JSONArray jsonArray = new JSONArray(); // json배열 선언 
			String sql = "select "
					+ "	A.cartno as 장바구니번호 , "
					+ "    A.samount as 구매수량 , "
					+ "    A.totalprice as 총가격 , "
					+ "    B.scolor as 색상 , "			
					+ "    B.ssize as 사이즈 , "
					+ "    B.pno as 제품번호 "
					+ "from cart A "
					+ "join stock B "
					+ "on A.sno = B.sno "
					+ "where mno = " + mno;
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while( rs.next() ) {
					// 결과내 하나씩 모든 레코드를 -> 하나씩 json객체 변환  
					JSONObject object = new JSONObject();
					object.put( "cartno" , rs.getInt(1) );
					object.put( "samount" , rs.getInt(2) );
					object.put( "totalprice" , rs.getInt(3) );
					object.put( "scolor" , rs.getString(4) );
					object.put( "ssize" , rs.getString(5) );
					object.put( "pno" , rs.getInt(6) );
					// 하나씩 json객체를 json배열에 담기 
					jsonArray.put( object );
				}
				return jsonArray;
			}catch (Exception e) { System.out.println( e );}  return null; 
			
		}
}

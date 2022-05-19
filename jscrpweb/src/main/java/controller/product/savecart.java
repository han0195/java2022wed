package controller.product;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import dao.MemberDao;
import dao.ProductDao;
import dto.Cart;
import dto.Stock;

/**
 * Servlet implementation class savecart
 */
@WebServlet("/product/savecart")
public class savecart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public savecart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("json");
		// json형식 문자열 -> json 객체로 변환
		try {
			// 1. 통신한 데이터를 JSONArray형으로 형변환
			JSONArray jsonArray = new JSONArray(data);
			// 2. 반복문 이용한 jsonarray에서 jsonobject  호출
			int error = -1; // 여러개 DB처리중 오류 여부 저장
			int i = 0;
			for(i = 0; i < jsonArray.length() ; i++) {
				//3. jsonarray 배열내 i 번째 객체 호출
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				//4. 해당 객체에 키 를 이용한 값 호출
				System.out.println(jsonObject.get("pname"));
				System.out.println(jsonObject.get("color"));
				System.out.println(jsonObject.get("size"));
				System.out.println(jsonObject.get("amount"));
				System.out.println(jsonObject.get("pprice"));
				System.out.println(jsonObject.get("totalprice"));
				System.out.println(jsonObject.get("point"));
				// 5. json -> Dto
				String mid = (String) request.getSession().getAttribute("login");
				int mno = MemberDao.getmemberDao().getmno(mid);
				// json 객체명.get(키)
				int amount = Integer.parseInt(jsonObject.get("amount").toString());
				int totalprice = Integer.parseInt(jsonObject.get("totalprice").toString());
				// sno
				String color = (String) jsonObject.get("color");
				String size =(String) jsonObject.get("size");
				int pno = Integer.parseInt(request.getParameter("pno"));
				int sno = 0;
				ArrayList<Stock> list = ProductDao.getProductDao().getStock(pno);
				for(Stock s : list) {
					if(s.getSsize().equals(size) && s.getScolor().equals(color)) {
						sno = s.getSno();
					}
				}
				
				Cart cart = new Cart(0 , amount, totalprice,sno, mno);
				System.out.println("json - > dto : " + cart.toString());
				boolean result = ProductDao.getProductDao().savecart(cart);
				if(!result) {error = i;} // 만일 하나라도 오류가 발생하면		
			}
			System.out.println("error 번호: " + error);
			if(error == -1) { response.getWriter().print(-1);}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

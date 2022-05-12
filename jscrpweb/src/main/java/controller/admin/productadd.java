package controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.ProductDao;
import dto.Product;

/**
 * Servlet implementation class productadd
 */
@WebServlet("/admin/productadd")
public class productadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productadd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 1. 프로젝트폴더(개발자PC) 저장 // 2. 서버(톰캣) 폴더에 저장
		String realpath = request.getSession().getServletContext().getRealPath("/admin/productimg");
		
		MultipartRequest multi = new MultipartRequest(
				request, // 요청 타입
				realpath, // 저장폴더위치
				1024*1024*1024,	// 파일 최대용량 = 바이트 기준
				"UTF-8", // 파일 인코딩 타입 
				new DefaultFileRenamePolicy() // 보안방식 =
				);
		
		
		String pname = multi.getParameter("pname");
		int pprice = Integer.parseInt(multi.getParameter("pprice")); 
		float pdiscount = Float.parseFloat(multi.getParameter("pdiscount"));
		int cno =Integer.parseInt(multi.getParameter("cno")); 
		String pimg = multi.getFilesystemName("pimg"); // 첨부파일 파일명은 쵸청시 .getFilesystemName
		
		Product product = new Product(0, pname, pprice, pdiscount, 0, pimg, cno);
		boolean result = ProductDao.getProductDao().psave(product);
		if(result) {
			response.getWriter().print(1);
		}else {
			response.getWriter().print(2);
		}
	}

}

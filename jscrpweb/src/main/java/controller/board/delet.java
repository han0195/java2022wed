package controller.board;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dto.Board;

/**
 * Servlet implementation class delet
 */
@WebServlet("/board/delet")
public class delet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bno = Integer.parseInt(request.getParameter("bno"));
		Board board = BoardDao.getBoardDao().getboard(bno);
		System.out.println(bno);
		boolean result = BoardDao.getBoardDao().delete(bno);
		response.setCharacterEncoding("UTF-8"); // 응답 인코딩 타입 = 한글
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if(result) {
			// * 삭제 성공시 해당 파일도 서버에서 삭제처리 // 경로찾기
			String uploadpath = request.getSession().getServletContext().getRealPath("/board/upload/" + board.getBfile());
			File file = new File(uploadpath);// 해당파일 객체화
			file.delete(); // 파일삭제하기 (file 클래스내 제공되는 delete() 메소드)
			
			// 1. HTML 내보내기
//			out.print("<html>");
//			out.print("<body>");
//			out.print("</body>");
//			out.print("</html>");
			// 2. JS 내보내기
			out.println("<script>");
			out.println("alert('해당 게시물이 삭제 되었습니다.')");
			out.println("location.href='boardlist.jsp'");
			out.println("</script>");
		}else {
			out.println("<script>");
			out.println("alert('오류[삭제실패] 관리자 문의바람.')");
			out.println("location.href='boardlist.jsp'");
			out.println("</script>");
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

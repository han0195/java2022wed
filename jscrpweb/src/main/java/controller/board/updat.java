package controller.board;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.BoardDao;
import dto.Board;

/**
 * Servlet implementation class updat
 */
@WebServlet("/board/updat")
public class updat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updat() {
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
		String uploadpath = request.getSession().getServletContext().getRealPath("/board/upload") ;
		
		// 첨부파일 업로드 [ MultipartRequest : cos 라이브러리 제공 클래스 ] 
		MultipartRequest multi = new MultipartRequest(
				request ,		// 1. 요청방식 
				uploadpath , 	// 2. 파일 저장 경로 
				1024*1024*10 ,	// 3. 파일 최대 용량 허용 범위 [ 10MB ] 
				"UTF-8" ,		// 4. 인코딩타입 
				new DefaultFileRenamePolicy() 	// 4. 보안방식 : 동일한 파일명이 있을경우 자동 이름 변환 
		);	
		int bno = Integer.parseInt(multi.getParameter("bno"));
		String title = multi.getParameter("btitle");
		if(title.equals("")) {
			response.sendRedirect("/jspweb/error.jsp");
		}else {
			String bcontent = multi.getParameter("bcontent");
			String bfile = multi.getFilesystemName("bfile");
			
			Board board = BoardDao.getBoardDao().getboard(bno);
			if(bfile != null) {
				String uploadpath1 = request.getSession().getServletContext().getRealPath("/board/upload/" + board.getBfile());
				File file = new File(uploadpath1);// 해당파일 객체화
				file.delete(); // 파일삭제하기 (file 클래스내 제공되는 delete() 메소드)
				board.setBfile(bfile);
			}
			board.setBtitle(title);
			board.setBcontent(bcontent);
			
			boolean result = BoardDao.getBoardDao().update(board);
			if(result) {
				response.sendRedirect("boardview.jsp?bno="+bno);
			}else {
				System.out.println("error.jsp");
			}
		}
		
	}

}

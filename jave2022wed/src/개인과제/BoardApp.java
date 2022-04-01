package 개인과제;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BoardApp {
	/*
	 * 게시판 + 댓글 프로그램 [ 예외처리 , 파일처리 , 리스트 ]
	 * 		// [m]게시판 클래스
	 * 				// 제목, 내용, 작성자, 작성일, 조회수, 댓글리스트
	 * 		// [m]댓글 클래스
	 * 				// 내용, 패스워드, 작성자, 작성일
	 * 		// [c]컨트롤러 클래스
	 * 				// 1.목록 2.쓰기 3.보기 4.수정 5.삭제 6.댓글쓰기	
	 * 				// 7.게시물저장 8.게시물불러오기edit document 9.댓글저장 10.댓글불러오기
	 * 		// [v]Day11_04 클래스
	 * 				// 입출력 [ 입력받아 컨트롤러에게 입력받은 값 전달 ]
	 * 
	 */
	/*
	 *  비회원제 게시판/댓글 프로그램 [ 예외처리 , 파일처리 , 리스트 ]
	 * 		// [m]게시물 클래스 
	 * 				// 제목 , 내용 , 패스워드 , 작성자 , 작성일 , 조회수 , 댓글리스트
	 * 		// [m]댓글 클래스 
	 * 				// 내용 , 패스워드 , 작성자 , 작성일 
	 * 		// [c]컨트롤러 클래스
	 * 				// 1.목록 2.쓰기 3.보기 (3)4.수정 5.삭제 6.댓글쓰기
	 * 				// 7.게시물저장 8.게시물불러오기 9.댓글저장 10.댓글불러오기 
	 * 		// [v]Day11_4_BoardApp 클래스 
	 * 				// 입출력 [ 입력받아 컨트롤러에게 입력받은 값 전달 ] 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			try {
				Controller.respone();
				System.out.println("*** 비회원 게시판 프로그램 ***");
				System.out.println("번호\t제목\t내용\t\t날짜\t\t조회수");
				// 게시물 출력
				Controller.listview();
				System.out.println("------------------------------------");
				System.out.println("1.쓰기 2.보기"); int ch = s.nextInt();
				if(ch == 1) {// 1. 쓰기
					System.out.println("*** 게시물 쓰기 ***");
					System.out.println("제목: "); String tit = s.next();
					System.out.println("내용: "); String con = s.next();
					System.out.println("패스워드: "); String pw = s.next();
					Controller.write(tit, con, pw);
				}else if(ch == 2){// 2. 보기
					System.out.println("보기 인덱스: "); int index = s.nextInt();
					boolean view = Controller.view(index);
						if(view) {// 성공ㅈ
							while(true) {
								System.out.println("제목\t내용\t\t날짜\t\t조회수");
								System.out.println(Controller.Boardlist.get(index).getTitle()+"\t"+Controller.Boardlist.get(index).getContent()+"\t\t"+Controller.Boardlist.get(index).getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd "))+"\t\t"+Controller.Boardlist.get(index).getViews());
								System.out.println("-----------댓글창---------------");
								System.out.println("제목\t내용");
								//댓글출력
								for(Comment temp : Controller.Boardlist.get(index).getCommentlist()) {
									System.out.println(temp.getContent()+"\t"+temp.getWriter());
								}
								System.out.println("--------------------------------");
								System.out.println("1.수정 2.삭제 3.댓글쓰기 4.뒤로가기"); int ch2 = s.nextInt();
								if(ch2 == 1) {
									System.out.println("수정 제목: "); String tit = s.next();
									System.out.println("수정 내용: "); String con = s.next();
									System.out.println("패스워드: "); String pw = s.next();
									boolean result = Controller.edit(index, pw, tit, con);
									if(result) {
										System.out.println("수정성공");
									}else {
										System.out.println("에러] 수정실패");
									}
								}else if(ch2 == 2) {
									
								}else if(ch2 == 3) {
									
								}else if(ch2 == 4) {
									break;
								}
								else {
									System.out.println("알수없는 행동");
								}
							}			
						}else {// 실패
							
						}//보기 실패 end
					
				}else {// 그위
					System.out.println("잘못된 선택");
				}
			} catch (Exception e) {
				System.out.println("프로그램에러 " + e);
			}	
		}// 프로그램 반복문
		
		
	}
}

package 비회원게시판;
//비회원제 게시판 [ 클래스 버전 ]

import java.util.Scanner;

//0. 게시물 설계 => 클래스 선언
				// 필드 : 제목, 내용, 작성자, 비밀번호
				// 생성자: 사용유무 선택
		
			//1. 첫화면 [ 모든 게시물 (번호, 작성자, 제목) 출력 ]
			//2. 메뉴 [ 1. 글쓰기 2. 글보기 ]
				//1. 글쓰기 [ 제목, 내용, 작성자, 비밀번호를 입력받아 => 4개변수 -> 객체화 ]
				//2. 글보기 [ 해당 글번호의 입력받아 해당 글 상세페이지(번호, 작성자, 제목, 내용) 표시 ]
					// 글번호는 배열에 저장되는 순서 [ 인덱스 ]
					// 글보기 메뉴
			//3. 글보기 메뉴 [1. 목록보기 2.삭제 3.수정 ]
					// 1. 삭제시 : 작성자와 비밀번호 입력받아 동일하면 삭제
					// 2. 수정시 : 작성자와 비밀번호 입력받아 동일하면 제목과 내용만 수정
public class 비회원게시판2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Board[] b = new Board[100];
		
		while(true) {
			System.out.println("**** 비회원 게시판 ***");
			System.out.println("번호\t작성자\t제목");
			int i = 0;
			for(Board temp : b) {
				if(temp != null) {
					System.out.println(i +"\t"+ temp.writer +"\t"+ temp.title);
				}
				i++;
			}
			System.out.println("1. 글쓰기 2. 글보기"); int ch = s.nextInt();
			
			if(ch == 1) {
				System.out.println("*** 글쓰기 ***");
				System.out.println("제목: "); String tit = s.next();
				System.out.println("내용: ");	 String con = s.next();
				System.out.println("작성자: ");	String wr = s.next();
				System.out.println("비밀번호: ");	String pw = s.next();
				Board t = new Board(tit, con, wr , pw);
				int s1 = 0;
				for(Board temp : b) {
					if(temp == null) {
						b[s1] = t;
						break;
					}
					s1++;
				}
				
				
			}else if(ch == 2) {
				System.out.println("*** 글보기 ***");
				System.out.println("번호: "); int ch2 = s.nextInt();
				
				if(b[ch2] != null) {
					System.out.println("번호\t작성자\t제목\t내용");
					System.out.println(ch2 +"\t" +b[ch2].writer +"\t" + b[ch2].title +"\t" + b[ch2].content);
					
				}else {
					System.out.println("해당글없음");
				}
				while(true) {
				
				System.out.println("[1. 목록보기 2.삭제 3.수정 ]"); int ch3 = s.nextInt();
					
					if(ch3 == 1) {
					break;
					}else if(ch3 == 2) {
						System.out.println("***삭제***");
						System.out.println("비밀번호: "); String pw = s.next();
						
						if(b[ch2].pw.equals(pw)) {
							b[ch2] = null;
							for(int i1 = ch2; i1 < b.length ; i1++) {
								if(i1 == b.length - 1) {
									b[i1] = null;
								}else {
									b[i1] = b[i1 + 1];
								}
							}
						}
						
						
					}else if(ch3 == 3) {
						System.out.println("*** 수정 ***");
						System.out.println("비밀번호: "); String pw = s.next();
											
						if(b[ch2].pw.equals(pw)) {
							System.out.println("제목: "); String tit = s.next();
							System.out.println("내용: "); String con = s.next();
							b[ch2].title = tit;
							b[ch2].content = con;
						}
					}else {
						System.out.println("알수없는해동");
					}
					
				}
				
				
				
			}else {
				System.out.println("알수없는행동입니다");
			}
			
		}
		
		
		
		
	}
	
	
	
}

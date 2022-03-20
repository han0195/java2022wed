package 비회원게시판;
//0. 게시물 설계 => 클래스 선언
	// 필드 : 제목, 내용, 작성자, 비밀번호
	// 생성자: 사용유무 선택

import java.util.Scanner;

//1. 첫화면 [ 모든 게시물 (번호, 작성자, 제목) 출력 ]
//2. 메뉴 [ 1. 글쓰기 2. 글보기 ]
//1. 글쓰기 [ 제목, 내용, 작성자, 비밀번호를 입력받아 => 4개변수 -> 객체화 ]
//2. 글보기 [ 해당 글번호의 입력받아 해당 글 상세페이지(번호, 작성자, 제목, 내용) 표시 ]
	// 글번호는 배열에 저장되는 순서 [ 인덱스 ]
	// 글보기 메뉴
//3. 글보기 메뉴 [1. 목록보기 2.삭제 3.수정 ]
	// 1. 삭제시 : 작성자와 비밀번호 입력받아 동일하면 삭제
	// 2. 수정시 : 작성자와 비밀번호 입력받아 동일하면 제목과 내용만 수정
public class 비회원게시판3 {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		Board[] b = new Board[100];
		
		while (true) {
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
				int j = 0;
				for(Board temp : b) {
					if(temp == null) {
						b[j] = t;
						break;
					}
					j++;
				}		
			}else if(ch == 2) {
				System.out.println("*** 글보기 ***");
				System.out.println("인덱스: "); int index = s.nextInt();
				if(b[index] != null) {
					while (true) {
						System.out.println("번호\t작성자\t제목\t내용");
						System.out.println(index + "\t" + b[index].writer + "\t" + b[index].title + "\t" + b[index].content);
						System.out.println("1. 목록보기 2.삭제 3.수정"); int ch2 = s.nextInt();
						
						if(ch2 == 1) {
							break;
						}else if(ch2 == 2) {
							System.out.println("삭제");
							System.out.println("비밀번호: "); String pw = s.next();
							if(b[index].pw.equals(pw)) {
								b[index] = null;
								for(int w = index ; w < b.length ; w++) {
									if(w == b.length - 1) {
										b[i] = null;
									}else {
										b[i] = b[i + 1];
									}
								}
								break;
							}				
						}else if(ch2 == 3) {
							System.out.println("수정");
							System.out.println("비밀번호: "); String pw = s.next();
							
							if(b[index].pw.equals(pw)) {
								System.out.println("제목: "); String tit = s.next();
								System.out.println("내용: "); String con = s.next();
								
								b[index].title = tit;
								b[index].content = con;
							}
						}else {
							System.out.println("알수없는 행동입니다");
						}					
					}			
				}		
			}
		}
	}
	}

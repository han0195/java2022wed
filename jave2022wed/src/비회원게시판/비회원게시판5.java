package 비회원게시판;

import java.util.Scanner;

public class 비회원게시판5 {
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
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		Board[] b = new Board[100];
		
		while(true) {
			System.out.println("--------- 도서 대여 프로그램 -----------");
			System.out.println("번호\t작성자\t제목");
			for(int i = 0 ; i < b.length ; i++) {
				if(b[i] != null) {
					System.out.println(i + "\t" + b[i].writer + "\t" + b[i].title);
				}
			}
			System.out.println("1. 글쓰기 2. 글보기"); int ch = s.nextInt();
			
			
			if(ch == 1) {
				System.out.println("*** 글 쓰기 ***");
				System.out.println("제목: "); String t1 = s.next();
				System.out.println("내용: ");	String c = s.next();
				System.out.println("작성자: "); String w = s.next();
				System.out.println("비밀번호: "); String p = s.next();
				
				Board t = new Board(t1, c, w, p);	
				for(int i = 0; i < b.length ; i++) {
					if(b[i] == null) {
						b[i] = t;
						break;
					}
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
								for(int i = index ; i < b.length ; i++) {
									if(i == b.length - 1) {
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
								System.out.println("제목: "); String t = s.next();
								System.out.println("내용: "); String c = s.next();							
								b[index].title = t;
								b[index].content = c;
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

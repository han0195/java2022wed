package 비회원게시판;

import java.util.Scanner;

public class 비회원게시판 {
	// 비회원제 게시판 [ 클래스 버전 ]
	
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
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in); // 입력객체 선언
		Board[] b = new Board[100];			// 클래스배열 선언
		
		
		while(true) { // 프로그램시작
			System.out.println("------- 비회원 게시판 ------");
			System.out.println("번호\t작성자\t제목"); 
			int sw = 0;				// 반복횟수저장
			for(Board temp : b) { // 반복
				if(temp != null) {	// 널이아니면 전부 출력
					System.out.println(sw +"\t"+ temp.writer + "\t" + temp.title );
				}
				sw++;	// 반복횟수 ++
			}
			System.out.println("------------------------------------------");
			System.out.println("1. 글쓰기 2. 글보기");	int ch = s.nextInt(); // 선택입력ㅂ다기
			if(ch == 1) {
				System.out.println("글쓰기");
				System.out.println("제목: "); String tit = s.next();	// 제목입력받기
				System.out.println("내용: ");	String con = s.next();	// 내용입력ㅂ다기	
				System.out.println("작성자: "); String wr = s.next();	// 작성자 입력받기
				System.out.println("비번: ");	String pw = s.next();	// 비밀번호 입력받기
				Board tem = new Board(tit, con, wr, pw);			//객체화 
				int j = 0;	//반복횟수 증가
				for(Board temp : b){	// 반복
					if(temp == null) {	//비어있으면 
						b[j] = tem;	// 저장
						break;
					}
					j++;
				}
				
				
			}else if(ch == 2) { // 글보기
				System.out.println("원하는 인덱스: "); int index = s.nextInt(); //번호입력받기
				if(b[index] != null) { // 해당번호 글이 있으면
					while(true) {	//무한반복
						System.out.println("번호\t작성자\t제목\t내용");
						System.out.println(index + "\t" + b[index].writer + "\t" + b[index].title + "\t" + b[index].content); // 해당번호 인덱스의 필드 출력
						System.out.println("---------------------------------------------");
						System.out.println("1. 목록보기 2.삭제 3.수정 "); int ch2 = s.nextInt();	// 선택입력받기
						
						if(ch2 == 1) {// 목록보기
							break;	// 반복문빠져나오기
						}else if(ch2 == 2) {
							System.out.println("ㅅ***삭제");
							System.out.println("비밀번호: "); String pw = s.next(); // 비밀번호 입력받기
							
							if(b[index].pw.equals(pw)) {	// 해당 pw 맞으면
								b[index] = null;	// 초기화
							}
							
							for(int i = index ; i < b.length ; i++) {	// 반복
								if(i == b.length - 1) {	// 마지막인덱스라면 그냥 null
									b[i] = null;
								}else {	//아니라면 한칸씩 땡기기
									b[i] = b[i + 1];
								}
							}
							break;
							
						}else if(ch2 == 3 ) { // 수정
							System.out.println("*** 수정");
							System.out.println("비밀번호: "); String pw = s.next(); //비밀번호입력받기
							
							System.out.println("제목: ");	String tit = s.next();	// 제목입력받기
							System.out.println("내용: "); String con = s.next();	// 내용입력받기
							
							b[index].title = tit;	//해당필드의 저장
							b[index].content = con;	//해당필드의 저장
						}else{	//그외
							System.out.println("알수없는 행동");
						}
					}
								
					
				}else {
					System.out.println("해당하는 글이없습니다");
				}
				
				
				
				
				
			}
			
			
			
			
			
		}
		
		
		
	}

}

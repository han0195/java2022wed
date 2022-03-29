package 개인과제도서관리리스트;
	// 도서관리 리스트버전
 	// 기능 [1.등록 2.목록 3.삭제 4.수정]
	// 필드 1. 도서명 2. 저자

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 도서관리 {// 13:38; 참고횟수 2
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); // 입력객체선언
		ArrayList<Book> book = new ArrayList<>(); // 북 클래스 리스트 선언
		while(true) {
			System.out.println("***** 도서관리 리스트버전 *****");
			System.out.println("1.등록 2.목록 3.삭제 4.수정"); int ch = s.nextInt();
			
			if(ch == 1) {//등록
				System.out.println("**** 등록 페이지 ****");
				System.out.println("도서명: "); String tit = s.next();
				System.out.println("저자: ");  String wri = s.next();
				book.add(new Book(tit, wri)); // 객체 생성후 book list 저장
			}else if(ch == 2) {//목록
				System.out.println("도서명\t저자");
				for(Book temp : book) {
					System.out.println(temp.get도서명() +"\t"+ temp.get저자()); // 출력
				}
			}else if(ch == 3) {// 삭제
				System.out.println("*** 도서삭제 ***");
				System.out.println("삭제할 도서명: "); String tit = s.next();
				int i = 0;
				for(Book temp : book) {
					if(temp.get도서명().equals(tit)) {
						book.remove(i);
						break;
					}
					i++;
				}
			}else if(ch == 4) {// 수정
				System.out.println("**** 도서수정 ****");
				System.out.println("수정할 도서명: "); String tit = s.next();
				System.out.println("수정할 도서명: "); String wri = s.next();
				int i = 0;
				for(Book temp : book) {
					if(temp.get도서명().equals(tit)) {
						book.get(i).set저자(wri);
						break;
					}
					i++;
				}
			}else {
				System.out.println("알수없는행동입니다");
			}
		}// while
	
	}// me
}// ce

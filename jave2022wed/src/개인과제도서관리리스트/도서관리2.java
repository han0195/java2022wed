package 개인과제도서관리리스트;

import java.util.ArrayList;
import java.util.Scanner;

//도서관리 리스트버전
	// 기능 [1.등록 2.목록 3.삭제 4.수정]
	// 필드 1. 도서명 2. 저자
public class 도서관리2 { // 8 : 22
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Book> book = new ArrayList<>();
		
		while(true) {
			System.out.println("**** 도서관리 리스트버전 ****");
			System.out.println("[1.등록 2.목록 3.삭제 4.수정]"); int ch = s.nextInt();
			if(ch == 1) {
				System.out.println("*** 도서등록 ***");
				System.out.println("도서명: "); String tit = s.next();
				System.out.println("저자: ");  String wri = s.next();
				book.add(new Book(tit, wri));
			}else if(ch == 2) {
				System.out.println("도서명\t저자");
				for(Book temp : book) {
					System.out.println(temp.get도서명() +"\t"+ temp.get저자());
				}
			}else if(ch == 3) {
				System.out.println("*** 도서삭제 ***");
				System.out.println("삭제할 도서명: "); String tit = s.next();
				int i = 0;
				for(Book temp : book) {
					if(temp.get도서명().equals(tit)) {
						book.remove(i);
						break;
					}				
				}
			}else if(ch == 4) {
				System.out.println("*** 도서수정 *** ");
				System.out.println("도서명: "); String tit = s.next();
				System.out.println("수정할도서명: "); String wri = s.next();
				for(Book temp : book) {
					if(temp.get도서명().equals(tit)) {
						temp.set저자(wri);
						break;
					}
				}
			}else {
				System.out.println("알수없는 선택");
			}
			
		}
		
	}
}

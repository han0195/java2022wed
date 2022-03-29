package 개인과제도서관리리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class 도서관리4 {
	//도서관리 리스트버전
			// 기능 [1.등록 2.목록 3.삭제 4.수정]
			// 필드 1. 도서명 2. 저자
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Book> book = new ArrayList<Book>();
		
		while(true) { // 6 : 54
			System.out.println("도서관리프로그램");
			System.out.println("[1.등록 2.목록 3.삭제 4.수정]"); int ch = s.nextInt();
			if(ch == 1) {
				System.out.println("도서등록");
				System.out.println("도서명: "); String tit = s.next();
				System.out.println("저자명: "); String wri = s.next();
				book.add(new Book(tit, wri));
			}else if(ch == 2) {
				System.out.println("도서명\t저자");
				for(int i = 0 ; i < book.size() ; i++) {
					System.out.println(book.get(i).get도서명() +"\t"+ book.get(i).get저자());
				}
			}else if(ch == 3) {
				System.out.println("도서삭제");
				System.out.println("삭제할도서명: "); String tit = s.next();
				for(int i = 0 ; i < book.size() ; i ++) {
					if(book.get(i).get도서명().equals(tit)) {
						book.remove(i);
					}
				}
			}else if(ch == 4) {
				
			}
		}
	}
}

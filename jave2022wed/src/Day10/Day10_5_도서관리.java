package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_도서관리 {
	
	public static void main(String[] args) {
		
		//1. 리스트[객체] 생성
		ArrayList<Book> booklise = new ArrayList<Book>();
		//리스트클래스 < 리스트안에 저장할 클래스 >
		// <클래스> : 해당 클래스의 여러 객체를 리스트에 저장 // 길이는 가변 [기본 : 10]
		
		Scanner scan = new Scanner(System.in);	 // 입력객체
				
		while(true) {
			System.out.println("1.등록 2.목록3.삭제4.수정");
			int ch = scan.nextInt();
			if(ch == 1) {
				// 1. 변수를 입력받기
				System.out.println("도서명: "); String 도서명 = scan.next();
				System.out.println("저자: "); String 저자 = scan.next();
				// 2. 객체화 [ 여러개 변수 => 1개 객체]
				Book book = new Book(도서명, 저자);
				// 3. 배열저장 [ 공백을 찾아서 ] vs 리스트 [공백찾기]
				booklise.add(book);
				// ????? : .add(객체명)
					// 마지막 인덱스에 자동적으로 객체가 추가
				
			}
			else if(ch == 2) {
				// 1. 배열 [ null 제외 ] vs 리스트
				System.out.println("도서명\t저자");
				for(Book book : booklise) {
					System.out.println(book.get도서명() + "\t" + book.get저자());
				}
 			}
			else if(ch == 3) {
				// 1.배열[ 삭제후에 뒤 인덱스 당기기] vs 인덱스[자동]
				// 1 2 3 [2삭제] 1 null 3      vs 1 2 3 [2삭제] 1 3 4
				System.out.println("삭제할 도서명: "); String 도서명 = scan.next();
				//도서 찾기
				for(Book temp : booklise) {
					if(temp.get도서명().equals(도서명)) {
						booklise.remove(temp);
						break;
					}
				}//for end
			}
			else if(ch == 4) {
				System.out.println("수정할 도서명: "); String 도서명 = scan.next();
				for( Book book : booklise) {
					if(book.get도서명().equals(도서명)){
						System.out.println(" 수정할 저자이름: "); String 저자 = scan.next();
						book.set저자(저자);
					}
					
				}
			}else {
				System.out.println("알수없는 행동");
			}//선택 if end
			
		}// while end
		
		
		
		
	}// me
		
}// ce

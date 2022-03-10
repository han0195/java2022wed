package Day07;
	
public class Book {
	//1. 필드
		int bisbn;
		String btitle;
		String bwriter;
		boolean brental;
		String bid;
		
	//2. 생성자
		Book() {}
		Book(int bisbn, String btitle, String bwriter, boolean brental, String bid){
			this.bisbn = bisbn;
			this.btitle = btitle;
			this.bwriter = bwriter;
			this.brental = brental;
			this.bid = bid;
		}
	//3. 메소드
		//1. 도서검색
		void 도서검색() {
			System.out.println("------------------------도서 검색------------------------");
			System.out.println("도서명: "); String title = Day07_05Application.scanner.next();
			for(Book temp : Day07_05Application.book) {
				if(temp != null && temp.btitle.equals(title)) {// 일치하는게있으면
					System.out.println("ISBN\t도서명\t작가\t도서대여여부\t대여회원");
					System.out.printf("%d\t%s\t%s\t%b\t%s\n", temp.bisbn, temp.btitle, temp.bwriter, temp.brental, temp.bid);
					return;
				}
			}
			System.out.println("검색하신 도서가 없음");
		}// 도서검색 for문 end
		
		
		
		//2. 도서목록
		void 도서목록() {
			System.out.println("---------------------도서 목록-----------------");
			System.out.println("ISBN\t도서명\t작가\t도서대여여부\t대여회원");
			for(Book temp : Day07_05Application.book) {
				if(temp != null) {
					System.out.println();
					System.out.printf("%d\t%s\t%s\t%b\t%s\n", temp.bisbn, temp.btitle, temp.bwriter, temp.brental, temp.bid);
				}else {
					return;
				}
			}
				
		}
		//3. 도서대여
		void 도서대여(String result) { //**5 여기서 인자를 받아오고
			System.out.println("----------------------도서대여-------------------------");
			System.out.println("대여할 isbn: "); int isbn = Day07_05Application.scanner.nextInt();
			for(Book temp : Day07_05Application.book) {
				if(temp != null && temp.bisbn == isbn) {// 일치하면
					if(temp.brental == true) {//렌탈이 true이면
						temp.brental = false; // 빌림
						temp.bid = result; // 일로준다
						System.out.println("대여 성공");
						return;
					}else {//렌탈이 false 면
						System.out.println("이미대여 됬습니다");
						return;
					}
				}
			}//for end
			System.out.println("해당 도서가 없습니다");
		}//도서대여 end
		
		
		//4. 도서반납
		void 도서반납(String result) {
			System.out.println("----------------------도서반납-------------------------");
			System.out.println("대여한 isbn: "); int isbn = Day07_05Application.scanner.nextInt();
			for(Book temp : Day07_05Application.book) {
				if(temp != null && temp.bisbn == isbn && temp.bid == result) {// 일치하면
					if(temp.brental == false) {//렌탈이 true이면
						temp.brental = true; // 빌림
						temp.bid = null;
						System.out.println("반납 성공");
						return;
					}else {//렌탈이 false 면
						System.out.println("반납 실패");
						return;
					}
				}
			}//for end
			System.out.println("대여중인 해당 도서가 없습니다");
		}
		
		//5. 도서등록
		void 도서등록() {
			System.out.println("----------------------도서등록--------------------");
			System.out.println("ISBN: "); int isbn = Day07_05Application.scanner.nextInt();
			System.out.println("도서명: "); String title = Day07_05Application.scanner.next();
			System.out.println("작가: ");	  String bwriter = Day07_05Application.scanner.next();
			//중복체크
			for(Book temp : Day07_05Application.book) {
				if( temp != null && temp.bisbn == isbn) {
					System.out.println("중복된 ISBN입니다");
					return; // 도서중복 종료
				}
			}
			
			//객체화
			Book book1 = new Book(isbn, title, bwriter , true, null);
			int i = 0;
			for(Book temp : Day07_05Application.book) {
				if(temp == null) {
					Day07_05Application.book[i] = book1;
					System.out.println("도서등록성공");
					return;
				}
				i++;
			}
			return;

		}// 도서등록 종료
		
		
		//6. 도서삭제
		void 도서삭제() {
			System.out.println("-------------------------도서삭제---------------------------");
			System.out.println("삭제할 ISBN: "); int isbn = Day07_05Application.scanner.nextInt();
			int i = 0;//반복횟수
			for(Book temp : Day07_05Application.book) {
				if(temp != null && temp.bisbn == isbn) {// 일치하면
					Day07_05Application.book[i] = null;
					if(Day07_05Application.book[i + 1] != null) {
						Day07_05Application.book[i] = Day07_05Application.book[i + 1];
						 Day07_05Application.book[i + 1] = null;
					}
					System.out.println("삭제성공");
					return;
				}
				i++;
			}			
		}// 도서삭제 end
 		
		//도전void 순위() {
			
		//}
}

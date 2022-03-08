package Day06;

import java.util.Scanner;

import javax.swing.border.Border;

public class Day06_06 {
	
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
		
		// 준비 [ 모든 {} 안에서 사용되는 변수 선언 ]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[3];
			// * Board 객체를 100개를 저장할수 있는 1차원 배열 선언
		
		//프로그램 실행
		while(true) { // 프로그램 실행 무한루프
			
			System.out.println("------------------------커뮤니티 ----------------------------");
			// 모든 게시물 조회
			System.out.println("번호\t작성자\t제목");
//----------------------------------------------------------------------------------------------
			//배열내 모든 객체(게이시물 출력 반복문
			int index = 0; // 인덱스 변수 [배열내 객체 수 체크] 
				for(Board board : boardlist) {
					if(board != null) {
						System.out.printf("%d\t%s\t%s\n", index, board.writer, board.title);
					}
					index++; // 인덱스 증가
				}
//--------------------------------------------------------------------------------------------------
			System.out.println("1.글쓰기 2.글보기");
			int ch = scanner.nextInt();
//-----------------------------------------------------------------------------------------------------------------------
			int ch1;
			if (ch == 1) {//1.글쓰기
		  //글쓰기---------------------------------------------------------------------------------------------------------------------
				System.out.println("-----------------------------글 쓰기 페이지--------------------------------");
				System.out.println("title : ");		String title = scanner.next();
				System.out.println("content: ");	String content = scanner.next();
				System.out.println("writer: ");		String wrtier = scanner.next();
				System.out.println("password: ");	String password =scanner.next();
				// 2. 4개 변수를 객체화 [ 객체를 만들어서 4개변수를 객체내 필드에 저장 ]
				Board border = new Board(title, content, wrtier, password);
						// 4개 필드를 갖는 생성자 사용
				//3. 배열내 빈공간을 찾아서 빈공간에 객체 대입
		  //--------------------------------------------------------------------------------------------------------------------
				int i = 0;
				for(Board temp : boardlist) {
					if(temp == null) { // 빈공간 찾았으면
						boardlist[i] = border; // 해당 인덱스에 새로운 객체 저장
						break;
					}
					i++;
				}
			}//1.글쓰기 end
//--------------------------------------------------------------------------------------------------------------------
			else if(ch == 2) {//2.글보기
				System.out.println(" 게시물 번호(인덱스) 선택: "); int bno = scanner.nextInt();
				if(boardlist[bno] == null) {System.out.println("해당게시글이없습니다");}// 해당 인덱스가없으면
				else {// 해당인덱스가있으면
					System.out.println("-----------------------------게시물 상세페이지------------------------");
					System.out.printf("작성자: %s 제목: %s \n", boardlist[bno].writer, boardlist[bno].title);
					System.out.printf("내용: %s\n", boardlist[bno].content);
					System.out.println("-----------------------------------------------------------------");
					System.out.println("1. 목록보기 2.삭제 3.수정"); int ch2 = scanner.nextInt();	
					if( ch2 == 1 ) {// 목록보기
						
					}// 1.목록보기 end
					else if(ch2 == 2) {// 2. 삭제
						System.out.println("--------------------------------삭제--------------------------");
						System.out.println("작성자를 입력해주세요: "); String id = scanner.next();
						System.out.println("비밀번호를 입력해주세요: "); String pw = scanner.next();
						if(boardlist[bno].writer.equals(id) && boardlist[bno].passwerd.equals(pw)) {// 작성자 비밀번호가 일치하다면
							boardlist[bno] = null;
							System.out.println("삭제가 완료되었습니다");
							// 삭제후에 삭제된 인덱스 뒤로 한칸씩 앞으로 이동
							//왜??? 만약에 해당 코드가 없을경우 배열내 공백
							for( int i = bno; i < boardlist.length ; i++ ) {// * 검색된 게시물의 인덱스 부터 마지막인덱스 까지 1씩 증가
								if( i == boardlist.length-1 ) // 삭제할려는게 마지막인덱스면 앞으로 땡겨올 필요가 없으니깐 그냥 null처리
									boardlist[i] = null;
								else {					      //마지막 인덱스 가 아니라면 앞으로 이동 처리
									boardlist[bno] = boardlist[bno+1];// 삭제된 게시물 다음 게시물
								}
									// * 2인덱스 = 3인덱스
									// * 3인덱스 = 4인덱스
							    	// ~~~~~~~~~~~~
									// * 98인덱스 = 99인덱스
									// * 99인덱스 = null	
							}
						}
						else {
							System.out.println("삭제가 실패했습니다");
						}
	//------------------------------------------------------------------------------
						
	//------------------------------------------------------------------------------
					}// 2.삭제 end
					else if(ch2 == 3) {
						System.out.println("작성자를 입력해주세요: "); String id = scanner.next();
						System.out.println("비밀번호를 입력해주세요: "); String pw = scanner.next();
						if(boardlist[bno].writer.equals(id) && boardlist[bno].passwerd.equals(pw)) {// 작성자 비밀번호가 일치하다면
							System.out.println("-------------------------------수정-----------------------------");
							System.out.println("수정할 제목을 입력해주세요: ");boardlist[bno].title = scanner.next();
							System.out.println("수정할 내용을 입력해주세요: ");boardlist[bno].content = scanner.next();
							System.out.println("수정 완료되었습니다");
						}
						else {
							System.out.println("수정 실패했습니다");
						}
					}// 3.수정 end
					else {System.out.println("알수없는 번호");}
					
				}
			}// 글보기 end
			else {
				System.out.println("알수없는 번호");
			}
		
		}// 프로그램 while
	}// me
}// cs



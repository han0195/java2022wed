package Day05;

import java.util.Scanner;

public class Day05_02 {
	
	// 회원제 방문록 프로그램 [ 2차원배열 ] 
		// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
			// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
			// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
		// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
			// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
			// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	
	
	///////////////////////
	
	
	public static void main(String[] args) {
		
		// 준비
		Scanner scanner = new Scanner(System.in); // 입력객체
			// 회원 100명[id,password,name] 저장하는 배열
		String[][] memberlist = new String[100][3]; // 100행 3열	=> 회원당 1행	[1열=id][2열=pw][3열=name]
			// 방문록 100개[ title , contents , writer ] 저장하는 배열 
		String[][] boardlist = new String[100][3];	// 게시물당 1행
		
		while(true) { // 무한루프 [ 종료조건 : x ] 
			System.out.println("------------------------");
			System.out.println("-------회원제 방문록-------");
			System.out.println("------------------------");
			System.out.print("1.회원가입 2.로그인 선택 : "); int ch = scanner.nextInt();
			
			if( ch == 1 ) { 
				System.out.println("-------- 회원가입 페이지 ---------");
				System.out.print(" MEMBER ID : "); 			String id = scanner.next();
				System.out.print(" MEMBER PASSWORD : "); 	String password = scanner.next();
				System.out.print(" MEMBER NAME : "); 		String name = scanner.next();
				// String 3개 변수를 입력받아 memberlist 2차원 배열에 저장 
					// 1. 빈 공간[ 정수=0 , 객체(문자열) = null  ]을 찾아서 저장 [ 만약에 빈공간이 없으면 회원 100명 초과 ]
					// 2. 아이디 중복체크 
				
				// 아이디 중복체크 
				boolean idcheck = true;
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						// == nell : 회원 x !- = 회원 o 
						System.out.println("아이디가 중복되었습니다");
						idcheck = false;
						break;
					}
				}//for e
				
				boolean pwcheck = true;
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][1] != null && memberlist[i][1].equals(password)) {
						// == nell : 회원 x !- = 회원 o 
						System.out.println("비밀번호가 중복되었습니다");
						pwcheck = false;
						break;
					}
				}//for e
				
				
				// 저장부분
				if(idcheck == true && pwcheck == true) {
					for( int i =0 ; i<memberlist.length ; i++ ) {
						if( memberlist[i][0] == null) { // i번째 행 에 id가 없으면 = 빈공간
							memberlist[i][0] = id;	memberlist[i][1] = password; 
							memberlist[i][2] = name; // i번째 각 열에 데이터 저장 
							System.err.println(" 알림]] 회원가입이 되었습니다.");
							break; // 저장했으면 끝 [ 1번만 저장 ]
						}
					}// for e
				}// if e
				else {
					System.out.println("에러) 회원가입 실패");
				}
				
 			} // if end 
			
			// 로그인
			else if( ch == 2 ) {
				System.out.println("-------- 로그인 페이지 ---------");
				System.out.print(" MEMBER ID : "); 			String id = scanner.next();
				System.out.print(" MEMBER PASSWORD : "); 	String password = scanner.next();
				
				boolean logincheck = false; // 로그인 성공 기본값
				for( int i =0 ; i<memberlist.length ; i++ ) { // 배열내 데이터가 입력받은 id와 password가 동일하면 로그인처리
					if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
							memberlist[i][1].equals(password) ) { // i번째 행에 id와 password 가 입력받은 값과 equals 같으면
						
							// null 은 객체가 아니기 때문에 equals 가 불가능 => == 가능
						System.err.println(" 알림]] 로그인 성공 ");
						
						logincheck = true; // 로그인 성공
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						while( true ) {
							System.out.println("---------------------------------------------");
							System.out.println("-------------------방문록----------------------");
							System.out.println("번호\t작성자\t제목\t내용");
							
									//모든 방문록 출력
									for(int j = 0; j < boardlist.length; j++) {
										if(boardlist[j][0] != null) {
											System.out.printf("%d\t%s\t%s\t%s \n0", j, boardlist[j][2], boardlist[j][0], boardlist[j][1]);
										}
									}// 방문록 출력 for문 e
									
							System.out.println("1.방문록남기기 2.로그아웃 선택: "); int ch2 = scanner.nextInt();
							
							if(ch2 == 1 ) { 
								System.out.println("--------------------------글쓰기------------------------");
								System.out.println(" title: "); String title = scanner.next();
								System.out.println(" content: "); String content = scanner.next();
								//배열내 공백찾아서 저장
								for( int j = 0; j < boardlist.length; j++) {
									if(boardlist[j][0] == null) {
										boardlist[j][0] = title;
										boardlist[j][1] = content;
										boardlist[j][2] = id; // 로그인시 사용된 id 대입.
										System.out.println(" 알림)) 방문록 작성이 완료되었습니다.");
										break;
									}
								}
							}
							else if(ch2 == 2) { 
								System.out.println("알림)) 로그아웃");
								break; // 가장 가까운 반복문 탈출
							}
							else { System.out.println("알림)) 알수 없는 번호입니다!!");}
						}	//회원 메뉴 while 
						
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						
					} //if end == login
				} // login for end
				// 로그인 실패시
				if( logincheck == false ) System.out.println("알림)) 회원정보가 다릅니다");
				
			}// ch == 2 if e
			else { System.err.println(" 알림]] 알수 없는 번호입니다.!!"); }
		} // while 1 end = 초기 메뉴 end
		
		
		
	} // m e 
} // c e 


package Day05;

import java.util.Scanner;

public class Day05_04_도서_대여 { // c s

	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in); // 스캐너 선언
		//전역 변수 선언
		String 회원[][] = new String[100][2];
		String 도서[][] = new String[100][3];
		// [0] id [1] pw

		
		회원[99][0] = "admin";
		회원[99][1] = "1234";
		//테스트
		회원[98][0] = "1234";
		회원[97][1] = "1234";
		도서[99][0] = "1234";
		while(true) {//메인메뉴
			System.out.println(" ---------메인 메뉴 ----------");
			System.out.println(" 1. 회원가입 2. 로그인 "); int 선택 = scanner.nextInt();
			if(선택==1 ) { //회원가입 선택시
				System.out.println("아이디를 입력해주세요 : "); String id = scanner.next();
				System.out.println("비밀번호를 입력해주세요 : "); String pw = scanner.next();
				for(int i = 0; i<회원.length; i++) { // 반복 실행
					if (회원[i][0] != null && 회원[i][0].equals(id)) { //중복체크
						System.out.println("중복되는 아이디입니다.");
					}
					회원[i][0] = id; //아디입력
					회원[i][1] = pw; //비번입력
					break; // 탈출
				}	
			} // 회원가입 끝
			
			
			else if(선택 == 2) { // 로그인
				System.out.println("-----------------로그인-----------------------");
				System.out.println("아이디: "); String id = scanner.next();
				System.out.println("비밀번호: "); String pw = scanner.next();
				
				Boolean pass = false; // 성공여부 판단
				
				for(int i = 0; i < 회원.length; i++){//로그인 여부 확인
					if(id != null && id.equals(회원[i][0])) { // 아이디 여부확인
						if(pw != null && pw.equals(회원[i][1])) { // 비밀번호 여부확인
							pass = true;
							break;
						}
					}
				}// 로그인 여부 for e
				
				
				while(pass){
					if(pass == true && id!="admin") {
						System.out.println("로그인성공"); 
						System.out.println("-----------------------------메뉴-----------------------");
						System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃"); int 메뉴선택 = scanner.nextInt();
						
						if(메뉴선택 == 1) {
							System.out.println("도서이름을 입력해주세요: ");	String 도서검색 = scanner.next();  
							for(int i = 0; i < 도서.length; i++) {
								if(도서[i][0].equals(도서검색)) {
									System.out.println("------------------------검색 도서------------------------");
									System.out.println("도서명\t도서 대여 여부\t대여인");
									System.out.println(도서[i][0] + 도서[i][1] + 도서[i][2]);
									break;
								}
							}// 도서 찾기 for e
						}// 도서검색 if e
						else if(메뉴선택 == 2) {
							System.out.println("------------------------도서 목록------------------------");
							for(int i = 0; i < 도서.length; i++) {
								if(도서[i][0] != null) {
									System.out.println("도서명\t도서 대여 여부\t대여인");
									System.out.println(도서[i][0] + 도서[i][1] + 도서[i][2]);
								}
							}
						}// 도서 찾기 반복문 e
						
						else if(메뉴선택 == 3) {// 도서 대여
							System.out.println("대여할 도서의 이름을 입력해주세요: "); String 도서명 = scanner.next();
							boolean 메뉴3여부 = true; 
							for(int i = 0; i < 도서.length; i++) {
								메뉴3여부 = false;
								if(도서[i][0] != null && 도서[i][0].equals(도서명)) { // 찾은도서가 있는지
									System.out.println("찾았습닏다");//테스트
								} // 찾은도서가 있는지
							}
						}
						else if(메뉴선택 == 4) {// 도서 반납
							
						}
						else if(메뉴선택 == 5) {
							System.out.println("로그아웃");
							break;
						}
						
					} 
				}
				//관리자메뉴 시작
				if(id.equals("admin")) { // 아이디가 어드민이면
					while(true) {
					System.out.println("----관리자메뉴----");
					System.out.println("1. 도서등록 2. 도서목록 3. 도서삭제 4. 로그아웃"); int 관리자선택 = scanner.nextInt();
					if (관리자선택 == 1) { // 등록 start
						System.out.println("등록할 도서 이름 : "); String 제목 = scanner.next();
						for(int j = 0; j<100; j++) {// j를 1부터 100까지 반복 대입 실행
							if (도서[j][0]==null) {// 도서 배열에서 제목이 빈 칸이라면
								(도서[j][0]) = 제목;}
								else if (도서[j][0]!=(null)) {//제목이 빈 칸이 아니면
									(도서[j+1][0])=제목;
								}
								break;
							
							
						} // for end
						
					}// 등록 end
					if (관리자선택 == 2) { // 목록 start
						System.out.println("------------------------도서 목록------------------------");
						for(int i = 0; i < 도서.length; i++) {
							if(도서[i][0] != null) {
								System.out.println("도서명\t도서 대여 여부\t대여인");
								System.out.println(도서[i][0] + 도서[i][1] + 도서[i][2]);
							
							}//if e
						}
					}// 도서 찾기 반복문 e
					if (관리자선택 == 3) { // 삭제 start
						System.out.println("삭제할 도서명 입력 : "); String 삭제도서명 = scanner.next();
						for(int i = 0; i<도서.length; i++) {
							if(도서[i][0]!=null) {
								if (도서[i][0].equals(삭제도서명)) {
									도서[i][0]=null;
								}
							}
						}
					} // 삭제 end
					if (관리자선택 == 4) {
						break;
					}
				}
			}//관리자메뉴 end
				
		}//로그인 end
			else { 
				System.out.println("에러) 알수없는 행동입니다");
			}// 로그인 성공여부 체크 if e
			

		}//while end
		
	} // m e
	
} // c e
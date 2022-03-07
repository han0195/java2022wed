package Day05;

import java.util.Scanner;

/*
	 *  1.입출력 2.변수/자료형/연산 3.제어/반복 4.제어/반복 5.배열
	 *  
	 *  도서 대여 console프로그램
	 *  1. 배열 변수
	 *  	1.회원 [아이디(중복x), 비밀번호]
	 *  	2.도서 [도서명(중복x), 도서대여여부, 대여인(로그인시 아이디)]
	 *  2. 초기메뉴
	 * 		1.회원가입 2.로그인 
	 * 				1.회원가입시 아이디 중복체크
	 * 	3.로그인시 메뉴
	 * 		1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃
	 * 		2.도서목록시 모든 도서명 출력
	 * 		3.도서대여시 도서대여여부가 가능할때 도서대여
	 *  	4.도서반납시 본인이 대여한 도서만 반납 처리
	 * 		5.로그아웃
	 *  
	 *  4.로그인시 아이디가 admin 이면 관리자메뉴
	 *  	1.도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃
	 *  			1.도서등록시 도서명을 입력받아 도서 등록처리
	 *  			2.도서목록시 모든 도서명 출력
	 *  			3.도서삭제시 삭제할 도서명을 입력받아 동일한 도서명 삭제[null]
	 *  			4.로그아웃시 초기메뉴로 				
	 */ 

public class Day05_04_도서_대여 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] 회원 = new String[100][2];
		// [0] = id [1] = pw
		String[][] 도서 = new String[100][3];
		도서[99][0] = "admin";
		도서[99][1] = "admin";
		
		while(true) {
			System.out.println("-------------------도서 대여프로그램------------------");
			System.out.println("1.회원가입 2.로그인");
			System.out.println("선택>> "); int 선택 = scanner.nextInt();
			
			if(선택 == 1) {
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
			}
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
				
				while(pass) {
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
							}else {
								System.out.println("에러)) 현재 보유중인 도서가 없습니다");
							}//if e
						}
					}// 도서 찾기 반복문 e
					else if(메뉴선택 == 3) {
						
					}
					else if(메뉴선택 == 4) {}
					else if(메뉴선택 == 5) {}
					else {}
				}
				// 로그인성공 if e
				if(회원[99][0].equals("admin")) {
					/*
					 * 형꺼
					 */
				}// admin 로그인 if e 
				else{
					System.out.println("로그인실패");
				}
				
			}else { 
				System.out.println("에러) 알수없는 행동입니다");
			}// 로그인 성공여부 체크 if e
			
			
			
			
			
			
		}//while e
		
		
		
	}// m e
}// c e

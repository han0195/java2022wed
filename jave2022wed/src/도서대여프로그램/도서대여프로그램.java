package 도서대여프로그램;

import java.util.Scanner;

public class 도서대여프로그램 {
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
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// 입력객체 선언
		
		String mem[][] = new String[100][3]; // 회원 배열 선언
		String book[][] = new String[100][3];// 책 배열 선언
		
		//관리자 미리등록
		mem[99][0] = "admin"; // id
		mem[99][1] = "1234";  // pw
		mem[99][2] = "운영자";  // name
		
		while(true) {// 프로그램 무한반복
			try {
				System.out.println("***** 메인메뉴 *****");
				System.out.println("1.회원가입 2.로그인 >>"); int ch = sc.nextInt();//선택입력받기
				
				if(ch == 1) {//1.회원가입			
						System.out.println("***** 회원가입 *****");
						System.out.println("아이디: ");		String id = sc.next(); // id 입력받기
						System.out.println("비밀번호: ");		String pw = sc.next();	// pw 입력받기
						System.out.println("이름: ");			String name = sc.next(); // name 입력받기
						boolean pass = true;
						//중복체크
						for(int i = 0; i < mem.length ; i++) { // mem 길이만큼 반복하면서
							if(mem[i][0] != null && mem[i][0].equals(id)) {			// id 같다면
								System.out.println("아이디 중복"); 
								pass = false;					// 저장 x
								break;							// 중복체크 반복문 빠져나오기
							}
						}
						// 저장
						if(pass) {// 만약 pass true라면
							for(int i = 0; i < mem.length ; i++) { // mem 길이만큼반복
								if(mem[i][0] == null) {				// mem이 null 이라면
									mem[i][0] = id;				//3개값 저장
									mem[i][1] = pw;
									mem[i][2] = name;
									System.out.println("회원가입 성공");
									break;						// 반복문 빠져나오기
								}
							}
							
						}// 저장 if 문 end																									
				}else if(ch == 2) {//2.로그인
					System.out.println("아이디: ");   	String id = sc.next(); // id 입력받기
					System.out.println("비밀번호: ");		String pw = sc.next(); // pw 입력받기
					boolean pass = false; // pass 값 등록
					//중복체크
					for(int i = 0; i < mem.length ; i++) { // mem 배열길이만큼 반복
						if(mem[i][0] != null && mem[i][0].equals(id)) {// 아이디가 같으면
							if(mem[i][0] != null && mem[i][1].equals(pw)) { // 비밀번호가 같으면
								pass = true; // 로그인 통과 true
							}
						}
					}
					//로그인 성공시
					while (pass) {					
						if(id.equals(mem[99][0])) {// 관리자 로그인 1.도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃
							System.out.println("***** 관리자 메뉴 *****");
							System.out.println("1.도서등록 2.도서목록 3.도서삭제 4.로그아웃"); int ch2 = sc.nextInt(); // 선택입력받기
							
							if(ch2 == 1) { //도서등록
								System.out.println("***** 도서등록 *****");
								System.out.println("도서명: "); String bn = sc.next(); //도서이름받기
								for(int i = 0; i < book.length ; i++) { //book 배열길이 만큼 반복
									if(book[i][0] == null) {	// 해당인덱스가 null이라면
										book[i][0] = bn;
										book[i][1] = "비대여";// bn값넣기
										System.out.println("도서등록성공");
										break;					// 반복문 빠져나오기
									}
								}
							
							}else if(ch2 == 2) {//도서 목록
								System.out.println("***** 도서목록 *****");
								System.out.println("제목\t\t도서대여여부\t\t대여인");
								for(int i = 0; i < book.length ; i++) { // 도서 목록 보기 반복문
									if(book[i][0] != null) {	// null 이아니면 전부 출력
										System.out.println(book[i][0]+"\t\t"+book[i][1]+"\t\t"+book[i][2]); //출력
									}
								}
							}else if(ch2 == 3) {// 도서 삭제
								System.out.println("***** 도서삭제 *****");
								System.out.println("삭제할 도서: "); String bn = sc.next(); //도서이름받기
								for(int i = 0; i < book.length ; i++) {
									if(book[i][0] != null && book[i][0].equals(bn)) {
										System.out.println("삭제성공");
										book[i][0] = null;
										book[i][1] = null;
										book[i][2] = null;
									}
								}
							}else if(ch2 == 4){//로그아웃
								break;
							}else {
								System.out.println("알수없는 행동");
							}
							
							
						}else{// 일반회원 로그인 1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃
							System.out.println("***** 회원 메뉴 *****");
							System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃"); int ch2 = sc.nextInt();// 선택값 입력받기
							
							if(ch2 == 1) { // 도서검색
								System.out.println("*****도서검색*****");
								System.out.println("도서명: "); String bn = sc.next(); // 도서이름 입력받기
								
								for(int i = 0; i < book.length ; i++) {// book배열안에 bn 이름찾기
									if(book[i][0] != null && book[i][0].equals(bn)) { // 도서명일치 목록 축력
										System.out.println("제목\t\t도서대여여부\t\t대여인");
										System.out.println(book[i][0]+"\t\t"+book[i][1]+"\t\t"+book[i][2]);
									}
								}
								
								
							}else if(ch2 == 2) { //도서목록
								System.out.println("***** 도서목록 *****");
								System.out.println("제목\t\t도서대여여부\t\t대여인");
								for(int i = 0; i < book.length ; i++) { // 도서 목록 보기 반복문
									if(book[i][0] != null) {	// null 이아니면 전부 출력
										System.out.println(book[i][0]+"\t\t"+book[i][1]+"\t\t"+book[i][2]);
									}
								}
								
							}else if(ch2 == 3) { // 도서대여
								System.out.println("***** 도서대여 *****");
								System.out.println("대여할 도서명: "); String bn = sc.next(); //도서명 입력받기
								boolean pass2 = false; // 도서 대여 성공여부
								for(int i = 0; i < book.length ; i++) {	// 반복문
									if(book[i][0] != null && book[i][0].equals(bn) && book[i][2] == null) { // 빈값이아니면서 이름받기
										System.out.println("대여성공");
										book[i][1] = "대여중";
										book[i][2] = id; // 대여인의 아이디 값 넣기
										pass2 = true;	//성공 true
										break;				// 반복문 빠져나오기
									}
								}
								
								if(pass2 == false) {System.out.println("대여불가");} // pass가 안되면 출력
								
							}else if(ch2 == 4) { // 도서반납
								System.out.println("***** 도서 반납 *****");
								System.out.println("반납할 도서: "); String bn = sc.next();
								boolean pass2 = false; // 도서 반납 성공여부
								for(int i = 0; i < book.length ; i++) {
									if(book[i][0] != null && book[i][0].equals(bn) && book[i][2].equals(id)) { //도서명이랑 아디가 일치하면
										System.out.println("반납성공");
										book[i][1] = "비대여";
										book[i][2] = null; // 반납
										pass2 = true; // 성공 true
										break;	//반복문빠져나오기
									}
								}
								
								if(pass2 == false) {System.out.println("대여불가");} // pass가 안되면 출력
					
							}else if(ch2 == 5) { // 로그아웃
								break;
							}else { // 그외
								System.out.println("알수없는 번호");
							}
						}// 회원 메뉴 조건문 end
					}
					
					
					
					
					
				}
			}catch (Exception e) {
				System.out.println("실행할수있는 입력어가 아닙니다" + e);
			}//
		}// whi e	
			
	}// me
}// ce



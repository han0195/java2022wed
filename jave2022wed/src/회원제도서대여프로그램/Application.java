package 회원제도서대여프로그램;

import java.util.Scanner;

//Day07_05Application 클래스 : 입출력 관련코드1
	//Book 클래스 : 도서 관련 코드
	//Member 클래스 : 회원 관련 코드
	
	//* 도서 대여 console 프로그램[ 클래스 버전 ]
		// 1. 클래스 설계
			//1. book
				//필드 : ISBN(도서번호), 도서명, 작가, 도서대여여부, 대여회원
				//메소드 : 1.도서검색 2.도서목록 3.도서대여 4.도서반납 1.도서등록 2.도서삭제
	
			//2. member
				//필드 : 번호, 회원아이디, 비밀번호, 이름, 연락처
				//메소드 : 1. 회원가입 2.로그인 3.아이디찾기
	
			//2. 화면 설계
				//1. 초기 메뉴[ 1. 회원가입, 2.로그인 3.아이디찾기 4.비밀번호찾기 ]
				//2. 일반회원메뉴 [1. 도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃 ]
				//3. 관리자메뉴 [1. 도서등록 2.도서목록 3.도서삭제 4.순위(도전) 5.로그아웃]
	
	// * main 밖에 변수를 선언하는 이유는 : 모든 괄호에서 사용하기위해
		//지역변수 {} 안에
			//서로다른 {} 에서는 사용불가
		// static : 프로그램 시작시 메모리 할당 / 프로그램 종료시 메모리 초기화
			// 프로그램 전반적으로 모든곳에 사용되는 메모리[변수]
public class Application {
	static Book[] b = new Book[100];
	static Member[] mem = new Member[100];
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
					
		while(true) {
			System.out.println("***** 도서 대여 프로그램 *****");		
			System.out.println("1. 회원가입, 2.로그인 3.아이디찾기 4.비밀번호찾기"); int ch = s.nextInt();
			
			if(ch == 1) {		
				boolean pass = Member.회원가입();
				
				if(pass) {
					System.out.println("회원가입성공");
				}else {
					System.out.println("회원가입실패");
				}
			}else if(ch == 2) {
				String id = Member.로그인();
				if(id == null) {
					System.out.println("로그인실패");
				}else if(id.equals("admin")){
					Application.adminmeun(id);
				}else {
					Application.meun(id);
				}
			}else if(ch == 3) {
				Member.아이디찾기();
			}else if(ch == 4) {
				Member.비밀번호찾기();
			}else {
				System.out.println("알수없는 행동");
			}
			
			
			
		}
	
			
		
	}
	
	public static void meun(String id) {
		while(true) {
			System.out.println("---------메인메뉴---------");
			System.out.println("[1. 도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃 ]");
			int ch = Application.s.nextInt();
			if(ch == 1) {
				
			}else if(ch == 2) {
				System.out.println("ISBN\t도서명\t작가\t도서대여여부\t대여회원");
				Book.도서목록();
			}else if(ch == 3) {
				boolean pass = Book.도서대여(id);
				if(pass) {
					System.out.println("대여성공");
				}else{
					System.out.println("대여실패");
				}
			}else if(ch == 4) {// 도서반납
				boolean pass = Book.도서반납(id);
				if(pass) {
					System.out.println("반납성공");
				}else{
					System.out.println("반납실패");
				}
			}else if(ch == 5) {
				break;
			}else {
				System.out.println("알수없는 행동");
			}
			
		}			
	}
	
	public static void adminmeun(String id) {
		while (true) {
			System.out.println("관리자 메뉴");
			System.out.println("[1. 도서등록 2.도서목록 3.도서삭제 4.로그아웃]");
			int ch = Application.s.nextInt();
			if(ch == 1) {
				boolean pass = Book.도서등록();
				if(pass) {
					System.out.println("등록성공");
				}else {
					System.out.println("등록실패");
				}
			}else if(ch == 2) {
				System.out.println("ISBN\t도서명\t작가\t도서대여여부\t대여회원");
				Book.도서목록();
			}else if(ch == 3) {
				Book.도서삭제();
			}else if(ch == 4) {
				break;
			}else {
				System.out.println("알수없는행동");
			}
			
			
		}
	}
}

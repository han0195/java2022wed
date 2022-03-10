package Day07;

import java.util.Arrays;
import java.util.Scanner;

public class Day07_05Application {
	
	//Day07_05Application 클래스 : 입출력 관련코드
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
	
	// 모든 괄호에서 쓰기위해 클래스의 입력객체 선언
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[100];
	static Book[] book = new Book[100];
	
	// 0. 코드를 읽어주는 시작 메소드 [ 스레드 ]
	public static void main(String[] args) {
	
		//메소드 호출 
		// 1. menu(); 내부호출 불가능
			// static : 메모리 우선할당 이기 때문에 static 외 메소드, 필드 x
			// main 메소드 static 메소드 이기때문에 static 메소드만 내부호출 가능
		//2. 외부호출
			// 1. 객체 생성(메모리할당) -> 메소드 호출
			Day07_05Application appli = new Day07_05Application();
			appli.menu();
	} //me
	
	//1. 초기 메뉴 메소드 
	void menu() {
		while (true) {
			System.out.println("-------------------- 도서 대여 프로그램 -------------------------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			Member member = new Member();
			int ch = scanner.nextInt();
			if(ch == 1) {
				boolean result = member.회원가입();
				if( result ) {
					System.out.println("회원가입성공");
				}else {
					System.out.println("회원가입실패");
				}
			}
			else if(ch == 2) {
				//로그인 메소드 호출
					// 1. 일반회원 메뉴 메소드 호출
					// 2. 관리자 메뉴 메소드 호출
				String result = member.로그인();
				if(result == null) {
					System.out.println("동일한 회원정보가 없습니다");
				}else if(result.equals("admin")){
					//2. 관리자메뉴
					System.out.println("로그인 성공");
					adminmenu(); // 내부 메소드 호출
				}else {
					//1. 일반회원메뉴
					System.out.println("로그인 성공");
					membermeu(result); // 외부 메소드 호출 //**2 여기서 받고
				}
			}
			else if(ch == 3) {
				//아이디찾기 메소드 호출
				member.아이디찾기();
			}
			else if(ch == 4) {
				//비밀번호 메소드 호출
				member.비밀번호찾기();
			}
			else {
				System.out.println("알수없는 번호");
			}
		}// while end 
	}//menu end
	
	//2. 일반회원 메뉴 메소드
	void membermeu(String result) { // **3 일로 인자를주고
		while (true) {
			System.out.println("-------------------- 회원 메뉴 --------------------------");
			System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃");
			int ch = scanner.nextInt();
			Book book = new Book();
			if(ch == 1) {// 도서검색
				book.도서검색();
			}else if(ch == 2){//도서목록
				book.도서목록();
			}else if(ch == 3){//도서대여4
				book.도서대여(result); // **4 인자를 받아온다
			}else if(ch == 4){//도서반납
				book.도서반납(result);
			}else if(ch == 5){//로그아웃
				return;
			}else {// 그외
				System.out.println("알수없는 행동");
			}	
		}// w e	
	}
	
	//3. 관리자 메뉴 메소드
	void adminmenu() {
		while (true) {
			System.out.println("-------------------- 관리자 메뉴 --------------------------");
			System.out.println("1.도서등록 2.도서목록 3.도서삭제 4.순위(도전) 5.로그아웃");
			int ch = scanner.nextInt();
			Book book = new Book();
			if(ch == 1) {// 도서등록
				book.도서등록();
			}else if(ch == 2){//도서목록
				book.도서목록();
			}else if(ch == 3){//도서삭제
				book.도서삭제();
			}else if(ch == 4){//순위(도전)
				
			}else if(ch == 5){//로그아웃
				return;
			}else {// 그외
				System.out.println("알수없는 행동");
			}	
		}// w e	
	}
	
	
	
	
}// ce

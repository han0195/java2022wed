package 모바일뱅크프로그램;

import java.util.Scanner;

// 모바일 뱅크 프로그램 [ 2인 과제 ] 
// 요구사항
	// 회원 주요기능: 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
	// 주요기능: 1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.계좌목록 7.로그아웃
	// 5.대출: 1.대출가입 2. 대출상환 3.남은대출금 4.뒤로가기
		// 설계 : 통장, 대출, 회원
		// 필드
			//통장: 1.회원번호 2.계좌번호 3.잔액
			//회원: 1.회원번호 2.아이디 3.비밀번호 4.이름 5.연락처
			//대출: 1.계좌번호 2.예금주 3.회원번호 4.남은대출금
		//메소드 1. 회원가입 2.로그인 3. 아이디찾기 4.비밀번호찾기
		//		5.계좌생성 6.입금 7.출금 8.이체 6.계좌목록
		//    	7.대출가입 8.대출상환 9.남은대출금확인
public class 모바일뱅크프로그램 {
	static Scanner s = new Scanner(System.in); // 입력객체 선언
	public static void main(String[] args) {
		while(true) { // 프로그램실행
			System.out.println("**** 로그인 창 ****");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			int ch = s.nextInt(); // 선택입력받기
			if(ch == 1) {//회원가입
				System.out.println("id: "); String id = s.next();
				System.out.println("pw: ");	String pw = s.next();
				System.out.println("name: "); String name = s.next();
				System.out.println("phone: "); String phone = s.next();
				boolean pass = Contorller.회원가입(id, pw , name, phone); // id pw name phone 주면서 회원가입 메소드출력
				if(pass) {//회원가입이 성공
					System.out.println("회원가입성공");
				}else {//실패
					System.out.println("회원가입실패");
				}
			}else if(ch == 2) {//로그인
				System.out.println("id: "); String id = s.next(); 
				System.out.println("pw: "); String pw = s.next();
				int idpwpass = Contorller.로그인(id, pw); //id pw 주면서 로그인메소드 호출
				if(idpwpass == -1) { // 회원번호 -1이 반환되면
					System.out.println("로그인실패");
				}else { // 가입이 성공되면 
					System.out.println("로그인성공");
					System.out.println(idpwpass);
					메인메뉴(idpwpass); // 메인메뉴에다 회원번호를 주면서 출력
				}
				
			}else if(ch == 3) {
				System.out.println("name: "); String name = s.next();
				System.out.println("phone: "); String phone = s.next();
				Contorller.아이디찾기(name, phone);
				
			}else if(ch == 4) {
				System.out.println("id: "); String id = s.next();
				System.out.println("phone: "); String phone = s.next();
				Contorller.비밀번호찾기(id, phone);
			}else {
				System.out.println("알수없는행동");
			}
		}
		
		
	}
	//////////////////////////////////////////////
	public static void 메인메뉴(int bno) { // 회원번호 가져오기 
		while (true) {
			System.out.println("--------- 은행 업무 -----------");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.계좌목록 6.대출서비스");
			int ch = s.nextInt(); // 선택입력받기
			if(ch == 1) {
				System.out.println("사용하실 계좌비밀번호: "); String pw = s.next();
				boolean pass = Contorller.계좌생성(bno, pw); // 계좌생성메소드 호출
				if(pass) {
					System.out.println("계좌생성 성공");
				}else {
					System.out.println("계좌생성 실패");
				}
			}else if(ch == 2) {
				System.out.println("입금할계좌: "); String 계좌번호 = s.next();
				System.out.println("입금액: ");	int mon = s.nextInt();
				boolean pass = Contorller.입금(계좌번호, mon);
				if(pass) {
					System.out.println("입금 성공");
				}else {
					System.out.println("입금 실패");
				}
			}else if(ch == 3) {
				System.out.println("출금계좌: "); String num = s.next();
				System.out.println("pw: "); String pw = s.next();
				System.out.println("출금액: "); int mon = s.nextInt();
				boolean pass = Contorller.출금(num, pw, mon);
				if(pass) {
					System.out.println("출금 성공");
				}else {
					System.out.println("출금 실패");
				}
			}else if(ch == 4) {//이체
				System.out.println("출금계좌: "); String num = s.next();
				System.out.println("입금계좌: ");	String num2 = s.next();
				System.out.println("이체금");		int mon = s.nextInt();
				boolean pass = Contorller.이체(num, num2, mon);
				if(pass) {
					System.out.println("이체 성공");
				}else {
					System.out.println("이체 실패");
				}
			}else if(ch == 5) {//계좌목록
				Contorller.계좌목록(bno);
			}else if(ch == 6) {//대출목록
				대출화면(bno);
			}else if(ch == 7){
				break;
			}else {
			System.out.println("알수없는 행동");
			}	
		}
		
	}
	public static void 대출화면(int bno) {// 회원번호 가져오기
		while(true) {
			System.out.println("**** 대출서비스 ****");
			System.out.println("1.대출가입 2.대출상환 3.남은대출금 4.뒤로가기");
			int ch = s.nextInt();
			
			if(ch == 1) {
				System.out.println("대출금액: "); int money = s.nextInt();
				System.out.println("pw: "); String pw = s.next();
				
				boolean pass = Contorller.대출가입(money, pw, bno);
				if(pass) {
					System.out.println("대출가입 성공");
				}else {
					System.out.println("대출가입 실패");
				}
			}else if(ch == 2) {
				System.out.println("출금계좌: "); String 출금계좌 = s.next();
				System.out.println("비밀번호: "); String pw = s.next();
				System.out.println("갚을금액: "); int money = s.nextInt();
				boolean pass = Contorller.대출상환(출금계좌, pw, money, bno);
				if(pass) {
					System.out.println("대출상환 성공");
				}else {
					System.out.println("대출상환 실패");
				}
			}else if(ch == 3) {
				Contorller.남은대출금확인(bno);
			}else if(ch == 4) {
				break;
			}else {
				System.out.println("알수없는 행동입니다");
			}
			
		}
	}
}





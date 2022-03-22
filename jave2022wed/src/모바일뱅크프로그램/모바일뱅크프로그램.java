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
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) { // 프로그램실행
			System.out.println("**** 로그인 창 ****");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			int ch = s.nextInt();
			if(ch == 1) {
				System.out.println("id: ");
				System.out.println("pw: ");
				System.out.println("name: ");
				System.out.println("phone: ");
				System.out.println("");
				boolean pass = Contorller.회원가입();
				if(pass) {
					System.out.println("회원가입성공");
				}else {
					System.out.println("회원가입실패");
				}
			}else if(ch == 2) {
				
			}else if(ch == 3) {
				
			}else if(ch == 4) {
				
			}else {
				System.out.println("알수없는행동");
			}
		}
		
		
	}
	//////////////////////////////////////////////
	public static void 메인메뉴() { // 회원번호 가져오기 
		
	}
	public static void 대출화면() {// 회원번호 가져오기
		
	}
}





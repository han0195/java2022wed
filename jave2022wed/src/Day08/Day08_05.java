package Day08;

import java.util.Arrays;
import java.util.Scanner;

public class Day08_05 {

	// 모바일 뱅크 프로그램 [ 2인 과제 ] 
		// 요구사항
		// 회원 주요기능: 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
		// 주요기능: 1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.계좌목록 7.로그아웃
		// 설계 : 통장, 대출, 회원
			// 필드
				//통장: 1.회원번호 2.계좌번호 3.잔액 4.남은대출금
				//회원: 1.회원번호 2.아이디 3.비밀번호 4.이름 5.연락처
				//대출: 1.계좌번호 2.예금주 3.회원번호 4.남은대출금
			// 메소드 
				//회원 :

	static Scanner scanner = new Scanner(System.in);
	static Member[] member = new Member[100];// 저장할 배열선언
	static Bank[] bank = new Bank[100];// 저장할 배열선언
	
	public static void main(String[] args) {
		Day08_05 menu = new Day08_05();
		menu.menu();
		
	}// me
	
	void menu() {// 초기메뉴 
		while (true) { // 프로그램 실행
			System.out.println("---------------------------모바일 뱅크 프로그램---------------------------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기"); int ch = scanner.nextInt();
			Member member = new Member();
			if(ch == 1) {// 1.회원가입
				boolean result = member.SignUp();
				if(result) {
					System.out.println("가입성공 환영합니다");
				}else {
					System.out.println("실패 환영합니다");
				}
			}else if(ch == 2){// 2.로그인
				String result = member.iogin();
				if(result == null) {
					System.out.println("로그인실패 일치하는 회원이 없습니다");
				}else {//로그인성공
					System.out.println("로그인성공");
					login_menu();
				}
			}else if(ch == 3){// 3.아이디찾기
				member.idfind();
			}else if(ch == 4){// 4.비밀번호찾기
				member.pwfind();
			}else {//그외
				System.out.println("알수없는 행동");
			}// 선택종료	
			
		}//while end
	}// 초기메뉴 종료
	
	void login_menu() {// 로그인메뉴
		while (true) {
			System.out.println("---------------------------모바일 뱅크 프로그램---------------------------");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.계좌목록"); int ch = scanner.nextInt();
			if(ch == 1) {// 1.계좌생성
				
			}else if(ch == 2){// 2.입금
				
			}else if(ch == 3){// 3.출금
				
			}else if(ch == 4){// 4.이체
				
			}else if(ch == 5){// 5.대출
				
			}else if(ch == 6){// 6.계좌목록
				
			}else if(ch == 7){// 6.로그아웃
				
			}else {// 그외
				
			}
		}// while end
	}// 로그인 메뉴 end
	
	
}// ce

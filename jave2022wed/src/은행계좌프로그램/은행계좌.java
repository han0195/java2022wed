package 은행계좌프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class 은행계좌 {
	//은행계좌프로그램 [상속]
		// 은행[super] => 필드 [ 1.계좌번호, 2.비밀번호, 3.계좌주, 4.예금액 ]
		// 국민은행[sub], 신한은행[sub], 하나은행[sub]
		// 주 기능 : 1. 계좌생성 2.입금 3. 출금 4.이체 5.내계좌목록 6.대출
	public static ArrayList<은행> bank = new ArrayList<은행>();// 은행클래스 리스트 선언
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);// 입력객체 선언
		
		while (true) {//프로그램시작
			System.out.println("------------ 은행 계좌 프로그램 ------------");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.내계좌목록 6.대출");
			int ch = s.nextInt();// 선택입력받기
			
			if(ch == 1) {// 계좌번호생성
				System.out.println("1.농협은행 2.신한은행 3.하나은행"); int 은행선택 = s.nextInt();
				System.out.println("비밀번호: "); String pw = s.next();// 비밀번호 입력받기
				System.out.println("계좌주: "); String name = s.next();// 이름입력 받기
				boolean pass = 은행컨트롤러.계좌생성(은행선택, pw, name);
				if(pass) {//성공
					System.out.println("계좌생성 성공");
				}else {//실패
					System.out.println("계좌생성 실패");
				}
				
			}else if(ch == 2) {// 입금
				System.out.println("계좌번호: "); String 계좌번호 = s.next();
				System.out.println("입금액: ");	int 입금액 = s.nextInt();
				boolean pass = 은행컨트롤러.입금(계좌번호, 입금액);
				if(pass) {
					System.out.println("입금 성공");
				}else{
					System.out.println("입금 실패");
				}			
			}else if(ch == 3) {// 출금
				System.out.println("계좌번호: "); String 계좌번호 = s.next();
				System.out.println("비밀번호: "); String 비밀번호 = s.next();
				System.out.println("출금: ");	int 출금액 = s.nextInt();
				boolean pass = 은행컨트롤러.출금(계좌번호, 출금액, 비밀번호);
				if(pass) {
					System.out.println("출금 성공");
				}else {
					System.out.println("출금 실패");
				}
			}else if(ch == 4) {// 이체
				System.out.println("계좌번호: "); String 계좌번호 = s.next();
				System.out.println("비밀번호: "); String pw = s.next();
				System.out.println("받는계좌번호: "); String 받는계좌 = s.next();
				System.out.println("이체금: "); int 금액 = s.nextInt();
				boolean pass = 은행컨트롤러.이체(계좌번호, pw, 받는계좌, 금액);
				if(pass) {
					System.out.println("이체 성공");
				}else {
					System.out.println();
				}
			}else if(ch == 5) {// 내계좌목록보기
				System.out.println("이름: "); String name = s.next();
				은행컨트롤러.내계좌목록(name);
			}else if(ch == 6) {//대출
				
			}
			else {
				System.out.println("알수없는 행동");
			}
			
		}// while end
		
	}// me
}// ce

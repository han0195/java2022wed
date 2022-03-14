package Day09;

import java.util.Scanner;

//은행계좌프로그램 [상속]
		// 은행[super]
		// 국민은행[sub], 신한은행[sub], 하나은행[sub]
		// 주 기능 : 1. 계좌생성 2.입금 3. 출금 4.이체 5.내계좌목록 6.대출
public class Day09_06_은행계좌 {
	// ** main 밖에서 선언하는 이유
		//* 모든 클래스에서 사용하기 위해 static 배열로 선언
		// static변수는 프로그램 시작시 메모리할당 -> 프로그램 종료시 메모리가 초기화됨
	public static Bank[] banklist = new Bank[100];
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {// 프로그램 무한루프 [ 종료조건 x ]
			
			System.out.println("------------계좌 시스템-----------");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.계좌목록 6.대출 선택");
			int ch = scan.nextInt();
			//다른 클래스내 멤버 호출 하는 방법
				//1. 객체 생성[new] 해서 메소드 호출
				//2. static 메소드는 객체 없이 호출 가능
			은행컨트롤러 컨트롤 = new 은행컨트롤러();
			
			if( ch == 1 ) {
				System.out.println("+++ 계좌등록 페이지 +++");
				System.out.println("비밀번호: "); 	String pw = scan.next();
				System.out.println("계좌주: ");	String name = scan.next();
				System.out.println("은행선택: 1.국민 2.신한 3.하나 >"); int ch2 = scan.nextInt();
				String result = 컨트롤.계좌생성(pw, name, ch2);
				// 메소드 반환 저장 = 계좌번호 혹은 null
				// 메소드 실행후 메세지 출력
				if(result != null) { // 계좌번호가 null 아니면
					System.out.println("알림)) 계좌생성완료");
					System.out.println("계좌번호: " + result);
				}else {
					System.out.println("에러)) 계좌생성 실패");
				}
				
			}else if(ch == 2 ) {
				System.out.println("+++ 입금 페이지 +++");
				System.out.println("계좌번호: "); String 계좌번호 = scan.next();
				System.out.println("입금액: "); int money = scan.nextInt();
				int result = 컨트롤.입금(계좌번호, money);
				if(result != 0) {
					System.out.println("입금 성공");
					System.out.println("잔액: " + result);
				}else {
					System.out.println("에러)) 입금 실패");
				}
				
			}else if( ch == 3 ) {
				System.out.println("+++ 출금 페이지 +++");
				System.out.println("계좌번호: "); String 계좌번호 = scan.next();
				System.out.println("비밀번호: "); String pw = scan.next();
				System.out.println("출금액: "); int money = scan.nextInt();
				int result = 컨트롤.출금(계좌번호,pw ,money);
				if(result == 0) {
					System.out.println("에러)) 출금 실패");
					
				}else if(result == 1){
					System.out.println("에러)) 잔액 부족");
				}else {
					System.out.println("출금 성공");
					System.out.println("잔액: " + result);
				}
			}else if ( ch == 4 ) {
				System.out.println("+++ 이체 페이지 +++");
				System.out.println("계좌번호: "); String 계좌번호 = scan.next();
				System.out.println("비밀번호: ");	String pw = scan.next();
				System.out.println("이체금액: "); int money = scan.nextInt();
				System.out.println("받는계좌: ");	String 받는계좌 = scan.next();
				
				int result = 컨트롤.이체(계좌번호, pw, money, 받는계좌);
				
				if(result == 4) {
					System.out.println("계좌정보가 없습니다");
				}else if (result == 2) {
					System.out.println("이체 성공");
				}else if(result == 1) {
					System.out.println("잔액 부족");
				}
				
				
			}else if( ch == 5 ) {
				System.out.println("+++ 계좌목록 페이지 +++");
				System.out.println("계좌주이름: "); String name = scan.next();
				Bank[] result = 컨트롤.계좌목록(name);
				int i = 0;
				for(Bank temp : result) {
					if(temp != null) {
						System.out.println(i+ "번 " + "계좌번호" + temp.get계좌번호());
					}
					i++;
				}
			
				
			}else if( ch == 6 ) {
				System.out.println("+++ 대출 페이지 +++");
			}else {
				System.out.println("에러)) 알수없는 행동");
			}
		}// while end
		
	}//me		
}//ce

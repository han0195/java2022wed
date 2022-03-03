package Day03;

import java.util.Scanner;

public class Day03_07 {
	public static void main(String[] args) { // m s
		
		boolean run = true; // 실행여부
		
		int balance = 0; // 예금액
		
		Scanner scanner = new Scanner(System.in); //입력객체
		
		while(run) { // while( 조건식 ) {  } : 무한루프
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 5.4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택>"); 
			int 선택 = scanner.nextInt();
			
			if( 선택 == 1 ) {// 막약에 입력값이 1이면
				System.out.println("예금액: "); int 예금액 = scanner.nextInt();
				//입력받은 예금액을 통장에 추가 +
				balance += 예금액;
			}
			else if( 선택 == 2 ) {// 막약에 입력값이 2이면
				System.out.println("출금액: "); int 출금액 = scanner.nextInt();
				// 만약에 출금액이 예금액보다 더 크면 잔액부족
				if (출금액 > balance) { System.out.println("알림) 잔액이 부족합니다");				}
				else {balance -= 출금액;} //입력받은 출금액을 통장에서 빼기 -
			}
			else if( 선택 == 3 ) {// 막약에 입력값이 3이면
				System.out.println("잔고: " + balance); 
			}
			else if (선택 == 4 ) {// 막약에 입력값이 4이면
				break; // 무한루프 탈출 
			}else {
				System.out.println("알수없는 번호 입니다");
			}
			
			
		}// w e
		
		System.out.println("프로그램 종료");
		
	} // m e
}// c e

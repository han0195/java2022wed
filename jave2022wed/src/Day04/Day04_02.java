package Day04;

import java.util.Scanner;

public class Day04_02 {
// 자판기 프로그램
			// 1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
					// 1. 메뉴판에서 제품선택하면 장바구니에 넣기
					// 2. 재고가 부족하면 알림( 재고부족)
			// 2. 초기 재고 [ 제품10개씩 ]
			// 3. 결제시 금액을 입력받아 결제액 만큼 차감후 잔돈 출력
					// 1. 투입한 금액보다 결제액이 이 더크면 결제 취소 [ 금액부족 ]
	public static void main(String[] args) {
		
		// 공통변수 [ 모든 괄호내에서 사용하는 변수들 ]
		Scanner scanner = new Scanner(System.in); // 1. 입력결제
		int 콜라재고 = 10;	int 환타재고 = 10;	int 사이다재고 = 10; // 2. 재고변수
		int 콜라구매수 = 0;	int 환타구매수 = 0;	int 사이다구매수 = 0;
		
		
		// 프로그램 시작 [ 무한 루프 ]
		while(true) {
			System.out.println("-------------------------메뉴-----------------------");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.print(">>>>>>>>선택: "); int 선택 = scanner.nextInt();
			
			int 결제여부;
			if( 선택 == 1 ) { // 콜라 구매
				if(콜라재고 == 0) { // 콜라재고가 0이면 구매불가
					System.out.println(" 알림) 재고가 없습니다. 재고 준비중");
				}
				else { // 콜라재고가 있으면 구매가능
					System.out.println("[[ 콜라 담았습니다]]");
					콜라구매수++; // 장바구니에 콜라 담기
					콜라재고--;	// 콜라재고 차감
				}
			}// 콜라 e
			else if( 선택 == 2) { //환타 구매
				if(환타재고 == 0) { // 환타재고가 0이면 구매불가
					System.out.println(" 알림) 재고가 없습니다. 재고 준비중");
				}
				else { // 환타재고가 있으면 구매가능
					System.out.println("[[ 환타 담았습니다]]");
					환타구매수++; // 장바구니에 콜라 담기
					환타재고--;	// 환타재고 차감
				}	
			}// 환타 e
			else if( 선택 == 3) { // 사이다 구매
				if(사이다재고 == 0) { // 사이다재고가 0이면 구매불가
					System.out.println(" 알림) 재고가 없습니다. 재고 준비중");
				}
				else { // 사이다재고가 있으면 구매가능
					System.out.println("[[ 사이다 담았습니다]]");
					사이다구매수++; // 장바구니에 콜라 담기
					사이다재고--;	// 사이다재고 차감
				}
			}// 사이다 e
			
			
			else if( 선택 == 4) { // 결제
				System.out.println("------------------ 장바구니 -----------------------");
				System.out.println("제품명\t수량\t금액");
				if(콜라구매수 != 0) System.out.println("콜라\t"+콜라구매수+"\t"+콜라구매수 * 300);
				if(환타구매수 != 0) System.out.println("콜라\t"+환타구매수+"\t"+환타구매수 * 200);
				if(사이다구매수 != 0) System.out.println("콜라\t"+사이다구매수+"\t"+사이다구매수 * 100);
				int 총결제액 = (콜라구매수 * 300) + (환타구매수 * 200) + (사이다구매수*100);
				System.out.println("제품 총 결제액: " + 총결제액);
				System.out.println("--------------------------------------------------");
				System.out.println("1.결제 2.취소"); int 결제여부1 = scanner.nextInt();
				if(결제여부1 == 1) {// 결제
					//1. 금액 입력받는다
					//2. 금액이 결제액보다 적으면 결제불가 -> 금액 재 입력
					//3. 금액이 결제액보다 많으면 결제성공 -> 장바구니 초기화
					System.out.print("잔액을 입력해주세요: ");	int 잔액 = scanner.nextInt();
						while (true) {
							if(잔액 < 총결제액) {
								System.out.println("알림) 금액이 부족합니다 금액을 재 입력해주세요");
								System.out.print("잔액을 입력해주세요: ");	잔액 = scanner.nextInt();
							}
							else {
								System.out.println("알림) 결제가 성공하셨습니다");
								System.out.println(" 알림) 잔돈 출력: " +(잔액 - 총결제액)+ "원");
								콜라구매수 = 0;		환타구매수 = 0;		사이다구매수 = 0;
								break;
							}
						} // while문 종료
				} //if 결제 종료
				else if(결제여부1 == 2) {// 취소
					System.out.println("알림)) 구매목록 모두 지우기");
					콜라재고 += 콜라구매수;	환타재고 += 환타구매수;	사이다재고 += 사이다구매수;
					콜라구매수 = 0;		환타구매수 = 0;		사이다구매수 = 0;
				}
				else { // 그외
					System.err.println("알림) 알수없는 행동입니다1.");
				}
				
			}// 결제 e
			else { System.err.println("알림) 알수없는 행동입니다."); }
		}
		
	}

}

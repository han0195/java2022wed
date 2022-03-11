package 키오스크;

import java.util.Scanner;

public class Day04 {
	// 자판기 프로그램
				// 1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
						// 1. 메뉴판에서 제품선택하면 장바구니에 넣기
						// 2. 재고가 부족하면 알림( 재고부족)
				// 2. 초기 재고 [ 제품10개씩 ]
				// 3. 결제시 금액을 입력받아 결제액 만큼 차감후 잔돈 출력
						// 1. 투입한 금액보다 결제액이 이 더크면 결제 취소 [ 금액부족 ]
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 입력객체 선언
		
		//공통변수 선언
			//재고
		int 콜라재고 = 10; int 환타재고= 10; int 사이다재고 = 10; // 콜라 환타 사이다 재고 저장할 변수 선언
			//장바구니
		int 콜라 = 0; int 환타 =0; int 사이다 = 0;// 콜라재고 환타재고 사이다재고 저장할 변수 선언
		
		while (true) {// 프로그램 실행
			System.out.println("----------------------------자판기-----------------------");
			System.out.println("1.콜라(300) 2.환타2(200) 3.사이다(100) 4.결제"); int ch = scan.nextInt(); // 선택 입력받기
			if(ch == 1) {// 1번 선택시		
				if(콜라재고 != 0) {// 콜라 재고가 0개 아니라면
					System.out.println("콜라를 장바구니에 담았습니다");	
					콜라재고--;  // 콜라 재고 --
					콜라++; // 장바구니
				}else {
					System.out.println("콜라재고가 없습니다");
				}
			}else if(ch == 2) {// 2번 선택시
				if(환타재고 != 0) {// 환타 재고가 0개 아니라면
					System.out.println("환타를 장바구니에 담았습니다");			
					환타재고--;  // 환타 재고 --
					환타++; // 장바구니
				}else {
					System.out.println("환타재고가 없습니다");
				}
			}else if(ch == 3) {// 3번 선택시			
				if(사이다재고 != 0) {// 사이다 재고가 0개 아니라면
					System.out.println("사이다를 장바구니에 담았습니다");	
					사이다재고--;  // 사이다 재고 --
					사이다++; // 장바구니
				}else {
					System.out.println("사이다재고가 없습니다");
				}
			}else if(ch == 4){// 4번 선택시
				System.out.println("--------------------------------결제-------------------------------");
				//총결제 금액 출력
				System.out.println("제품명\t수량\t가격");
				if(콜라 != 0) {System.out.printf("%s\t%s\t%d\n","콜라",콜라, 콜라 * 300);} // 콜라구매가 0개가 아니라면 출력
				if(환타 != 0) {System.out.printf("%s\t%s\t%d\n","환타",환타, 환타 * 200);} // 환타구매가 0개가 아니라면 출력
				if(사이다 != 0) {System.out.printf("%s\t%s\t%d\n","사이다",사이다, 사이다 * 100);} // 사이다구매가 0개가 아니라면 출력
				int 총 = (콜라 * 300) + (환타 * 200) + (사이다 * 100); // 총결제금액 입력받기
				System.out.println("총 결제금액: " + 총);
				System.out.println("1.결제 2.취소"); int ch2 = scan.nextInt(); // 선택입력받기
				if(ch2 == 1) {// 1을 선택했다면
					System.out.println("입금해주세요"); int 돈 = scan.nextInt(); // 돈 입금받기
					while (true) {// 결제 프로그램 무한반복
						if(돈 > 총) {// 돈이 총가격보다 더 크다면
							System.out.println("결제성공");
							System.out.println("거스름돈" + (돈 - 총));
							break; // 거래 완료 결제프로그램 빠져나오기
						}else{// 아니라면
							System.out.println("돈이 충분하지않습니다 다시입금: "); 돈 = scan.nextInt();// 돈 다시 입력받기
						}
					}// while end
					
				}else if(ch2 == 2) {// 2을 선택했다면
					System.out.println("결제가 취소되었습니다.");
					System.out.println("장바구니를 비움니다");
					콜라재고 += 콜라; 환타재고 +=환타; 사이다재고 +=사이다; // 재고 초기화
					콜라 = 0; 환타 = 0; 사이다 = 0;// 장바구니 초기화
				}
				
			}else {// 그외
				System.out.println("알수없는 행동");
			}
			
			
		}// 프로그램 end
		
	}// ms 
}// cs

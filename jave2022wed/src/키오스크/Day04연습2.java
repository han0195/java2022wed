package 키오스크;

import java.util.Scanner;

public class Day04연습2 {
	//자판기 프로그램
	// 1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
			// 1. 메뉴판에서 제품선택하면 장바구니에 넣기
			// 2. 재고가 부족하면 알림( 재고부족)
	// 2. 초기 재고 [ 제품10개씩 ]
	// 3. 결제시 금액을 입력받아 결제액 만큼 차감후 잔돈 출력
			// 1. 투입한 금액보다 결제액이 이 더크면 결제 취소 [ 금액부족 ]
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int 콜라재고 = 10; int 환타재고 = 10; int 사이다재고 =0;
		int 콜라 = 0; int 환타 = 0; int 사이다 = 0;
		
		while(true) {
			System.out.println("---------------------------자판기----------------------------");
			System.out.println("1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제");
			System.out.println("선택>> "); int ch = scan.nextInt();
			if(ch == 1) {
				if( 콜라재고 != 0 ) {
					System.out.println("콜라를 담았습니다");
					콜라재고--;
					콜라++;
				}else {
					System.out.println("콜라재고가 없습니다");
				}				
			}else if(ch == 2) {
				if( 환타재고 != 0 ) {
					System.out.println("환타를 담았습니다");
					환타재고--;
					환타++;
				}else {
					System.out.println("환타재고가 없습니다");
				}				
			}else if(ch == 3) {
				if( 사이다재고 != 0 ) {
					System.out.println("사이다를 담았습니다");
					사이다재고--;
					사이다++;
				}else {
					System.out.println("사이다재고가 없습니다");
				}				
			}else if(ch == 4) {
				System.out.println("-------------------------------결제창------------------------");
				System.out.println("제품명\t수량\t가격");
				if( 콜라 != 0) {System.out.printf("%s\t%d\t%d\n", "콜라", 콜라, 콜라 * 300);}
				if( 환타 != 0) {System.out.printf("%s\t%d\t%d\n", "환타", 환타, 환타 * 200);}
				if( 사이다 != 0) {System.out.printf("%s\t%d\t%d\n", "사이다", 사이다, 사이다 * 100);}
				int 총 = (콜라 * 300) + (환타 * 200) + (사이다 * 100);
				System.out.println("총가격: " + 총);
				System.out.println("1.결제 2.취소"); int ch2 = scan.nextInt();
				if(ch2 == 1) {
					System.out.println("돈을 입금해주세요"); int 돈 = scan.nextInt();
					while (true) {
						if(돈 > 총) {
							System.out.println("결제가 완료되었습니다");
							System.out.println("거스름돈: " + (돈 - 총));
							콜라 = 0; 환타 =0; 사이다 = 0;
							break;
						}else {
							System.out.println("돈이 부족합니다 입금: "); 돈 = scan.nextInt();
						}
					}
					
				}else if(ch2 == 2){
					System.out.println("결제가 취소됩니다 장바구니 초기화");
					콜라재고 += 콜라; 환타재고 += 환타; 사이다재고 += 사이다;
					콜라 = 0; 환타 = 0; 사이다 = 0;
				}else {
					System.out.println("알수없는 행동입니다");
				}
				
			}else {
				System.out.println("알수없는 행동입니다");
			}
		}
		
		
		
		
		
	}

}

package 엘베;

import java.util.Scanner;

public class Main {
	/* 참고횟수: 
	 * 
	 * 1.엘리베이터 객체 생성
	 * 		1.층수
	 * 2.초기메뉴 [1. 엘리베이터 호출] 엘리베이터 기본값 = 0층
	 * 		1. 현재층수 입력받기 *호출시 층층마다 출력
	 * 		2. 목적층수 입력받기
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);// 입력객체 선언
		
		Elevator elevator = new Elevator(10);// 처음 기본값 1 인자 선언
		
		while (true) {
			System.out.println("-----------------------------------엘리베이터-------------------------------------------");
			System.out.println("현재몇층입니까? 1~20: "); int 호출층수 = scanner.nextInt(); // 현재 층수 입력받기
			
			boolean 도착여부 = false; // 엘베 도착 여부
			if(elevator.층수 != 호출층수) {// 같은층수가 아니면
				if(호출층수 < elevator.층수) {// 호출층수 보다 엘베위치가 높으면
					while(true) {// 엘베 가동 시작
						elevator.층수--;// 엘베가 내려가면서 하나씩 내려가기
						System.out.println(elevator.층수 + "층");
						if(호출층수 == elevator.층수) { // 엘베가 같은층이되면
							System.out.println("도착");
							도착여부 = true;
							break; 					// 중지
						}// 같은층이면 end
					}// 엘베가동 end	
				}else {// 호출층수 보다 엘베위가 낮으면
					while(true) {// 엘베 가동 시작
						elevator.층수++;// 엘베가 올라가면서 하나씩 플러스
						System.out.println(elevator.층수 + "층");
						if(호출층수 == elevator.층수) { // 엘베가 같은층이되면
							System.out.println("도착");
							도착여부 = true;
							break; 					// 중지
						}// 같은층이면 end
					}// 엘베가동 end	
				}					
				
			}else if(호출층수 < 0 && 호출층수 > 20) { // 범위에서 벗어나면
				System.out.println("에러)) 1~20층 까지 입력해주세요");
			}
			
			
			if(도착여부 == true){// 층수가 같으면
				System.out.println("몇층의 가겠습니까?: "); int 목적층수 = scanner.nextInt(); // 목적층수 입력받기
				if(목적층수 >= 1 && 목적층수 <= 20) {// 범주안일때
					if(elevator.층수 < 목적층수) {// 엘베층수보다 목적층수가 높을때
						System.out.println("올라갑니다");
						while(true) {
							elevator.층수++;
							if(elevator.층수 == 목적층수) {
								System.out.println("도착했습니다");
								break;
							}
						}// while end
					}//else if() {// 엘베층수보다 목적층수가 낮을때
						
					
				}else {// 범주가 벗었났을때
					
				}
				
				
			}
			System.out.println(elevator.층수);
		}// while
	}// me
}// cs

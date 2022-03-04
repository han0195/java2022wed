 package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_03 { // c s

	public static void main(String[] args) { // m s
		
		// 준비
		int 플레이어; // 사용자가 선택한 수 저장
		int 컴퓨터;	// 컴퓨터가 난수를 생성한 수 저장
		int 게임수 = 0;  // 총 가윙바위보 실행 횟수 저장
		int 플레이어승리수 = 0; int 컴퓨터승리수 = 0; // 각 승리 수 저장
		Scanner scanner = new Scanner(System.in);
		
		//프로그램 실행 [ 무한루프 종료조건 : 3번 입력시에 종료(break) ]
		while(true) {
			System.out.println("----------------가위바위보 게임--------------------");
			System.out.println("가위(0) 바위(1) 보 (2)   종료(3): "); System.out.println("선택>>>>");
			플레이어 = scanner.nextInt(); // 입력한 수 저장
			System.out.println("플레이어가 낸수: " + 플레이어);
			
			Random random = new Random(); // 난수 객체 선언
						//random.nextInt() : int가 표현할수 있는 범위내 난수 발생
						//random.nextInt(수) : 0 ~ 수 전까지 범위내 난수 발생
							//random.nextInt(10) : 0~9 중 난수 발생
							//random.nextint(11)+10 : 10~20중 난수 발생
			컴퓨터 = random.nextInt(3); // 난수중 정수(int형)로 가져오기
			
				//종료조건
			if (플레이어 == 3) {
				System.out.println("알림) 게임종료");
				System.out.println(" 총 게임 횟수는: " + 게임수);
				if(플레이어승리수 > 컴퓨터승리수) {
					System.out.println(" 플레이어승리");
				}else if(컴퓨터승리수 > 플레이어승리수) {
					System.out.println(" 컴퓨터승리");
				}else {System.out.println(" 무승부");}
				break;
			}else if( 플레이어 >= 0 || 플레이어 <= 2) {
				// 승리자 판단
				if(플레이어 == 0 && 컴퓨터 == 2 || 플레이어 == 1 && 컴퓨터 == 0 ||	플레이어 == 2 && 컴퓨터 == 1) { // 플레이어 승리 경우의수
					플레이어승리수++;
					System.out.println("승리");
				}else if(플레이어 == 컴퓨터) { // 비기는 수
					System.out.println("무승부");
				}else {// 그외는 컴퓨터 승리
					컴퓨터승리수++;
					System.out.println("패배");
				}
			}else {
				System.out.println("알수없는 행동입니다");
			}
			
			
			게임수++; // 반복 완료 +1
		} //while문 종료
		
		
	} // m e

} // c e

package 가위바위보;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
	//준비 공유변수[플레이어, 컴퓨터[난수 생성], 게임수, 플레이어 승리수]
	//프로그램 실행
		// 1.가위 2.바위 3.보 4.종료
		// 게임후 승리판단
			//반복
		// 4. 종료 눌르면
		// 게임횟수, 플레이어 컴퓨터 승리여부
	

	public static void main(String[] args) {
		//준비
		int 플레이어; // 사용자가 선택한 수 저장
		int 컴퓨터; // 컴퓨터가 선택한 수 저장
		int 게임수 = 0; // 게임한 횟수 체크
		int 플레이어승리수 =0; // 플레이어 승리횟수 체크
		int 컴퓨터승리수 = 0; // 컴퓨터승리수 체크
		
		Scanner scan = new Scanner(System.in); // 입력객체 선언
		Random random = new Random(); // 난수를 받기위해 랜덤객체 선언
		
		//프로그램 실행
		while(true) { //무한루프 실행
			System.out.println("-------------------------가위바위보 게임-----------------");
			System.out.println("0.가위 1.바위 2.보 3.종료");
			System.out.println("선택>> "); 플레이어 = scan.nextInt(); // 플레이어 선택입력받기
			
			컴퓨터 = random.nextInt(3); // 0~2까지 int형 난수를 받음
			
			if( 플레이어 >= 0 && 플레이어 <= 2){// 플레이어가 012를 선택하면 게임시작
				if(플레이어 == 0 && 컴퓨터 == 2 || 플레이어 == 1 && 컴퓨터 == 0 || 플레이어 == 2 && 컴퓨터 == 1) { // 플레이어가 이기면
					System.out.println("승리");
					플레이어승리수++; // 플레이어 승리수 ++
					게임수++;	// 게임횟수 ++
				}else if(플레이어 == 컴퓨터){ // 비기면
					System.out.println("무승부");
					게임수++; // 게임횟수++
				}else {// 컴퓨터가 이기면
					System.out.println("패배");
					컴퓨터승리수++; // 컴퓨터승리수++
					게임수++;	// 게임횟수++
				}
			}else if(플레이어 == 3) {// 종료를 선택하면
				System.out.println("--------------게임종료-------------");
				System.out.println("종합판");
				System.out.println("게임횟수: " + 게임수); 
				System.out.println("--------------승리자-------------");
				if(플레이어승리수 > 컴퓨터승리수) { //플레이어승링
					System.out.println("플레이어 승리");
					break;// 프로그래종료 시키기
				}else if(플레이어승리수 < 컴퓨터승리수){//컴퓨터승리
					System.out.println("컴퓨터 승리");
					break;// 프로그래종료 시키기
				}else {// 무승부
					System.out.println("무승부");
					break;// 프로그래종료 시키기
				}
			}else {// 그외
				System.out.println("알수없는 행동");
			}
			
		}//  while end
		

	} // me

} // cs

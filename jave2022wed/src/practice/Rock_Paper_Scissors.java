package practice;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {// 구현횟수: 1 | 시간: x
	// 가위바위보 게임				  
	// 가위(0) 바위(1) 보(2)	종료(3) 
	// 플레이어 입력받기
	// 컴퓨터의 램덤한 숫자 받기
	// 비교
	// 판독
	// 결과
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);	// 입력 객체 선언
		int player_win = 0;
		int computer_win = 0;
		int count = 0;
		
		while(true) {
			System.out.println("-----------------------------가위바위보---------------------------------");
			System.out.println("가위(0), 바위(1), 보(2)   종료(3)");
			System.out.println("선택>>>>");
			int player = scanner.nextInt();	// 플레이어 입력받아 int형 저장
			
			Random random = new Random();	// 랜덤 객체 선언
			int computer = random.nextInt(4);	// 0~3 램덤한 난수 받아오기
			System.out.println(computer);
			
			if(player >= 0 && player < 3) { // 플레이
				if(player == 0 && computer == 2 || player == 1 && computer == 0 || player == 2 && computer == 1) { // 플레이어가 이겼을때
					System.out.println("승리");
					System.out.printf("플레이어: %d\n",player);
					player_win++;
				}else if(player == computer){ // 무승부
					System.out.println("무승부");
					System.out.printf("플레이어: %d\n",player);
				}else {	// 컴퓨터가 이겼을때
					System.out.println("패배");
					System.out.printf("플레이어: %d\n",player);
					computer_win++;
				}
				count++;
			}else if(player == 3){// 종료
				System.out.println("--------------------------------------------------------------");
				System.out.println("게임종료");
				System.out.printf("총 게임 횟수: %d\n", count);
				if(player_win > computer) {System.out.println("플레이어 승리");}//플레이어 승리
				else if(player_win < computer) {System.out.println("컴퓨터 승리");}//컴퓨터 승리
				else {System.out.println("무승부");} // 무승부
				break;
 			} 
			
			
			}

		
		
		
		
		
		
		
		
	} //m e

} //c e 

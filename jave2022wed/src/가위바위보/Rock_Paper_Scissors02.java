package 가위바위보;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors02 {
	//준비 공유변수[플레이어, 컴퓨터[난수 생성], 게임수, 플레이어 승리수]
			//프로그램 실행
				// 1.가위 2.바위 3.보 4.종료
				// 게임후 승리판단
					//반복
				// 4. 종료 눌르면
				// 게임횟수, 플레이어 컴퓨터 승리여부
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int 플레이어;
		int 컴퓨터;
		int 게임수 = 0;
		int 플레이어승리수 = 0; int 컴퓨터승리수 =0;
		
		while (true) {
			System.out.println("----------------가위바위보 게임---------------");
			System.out.println("0.가위 1.바위 2.보 3.종료"); 플레이어 = scan.nextInt();
			컴퓨터 = ran.nextInt(3);
			
			if(플레이어 >= 0 && 플레이어 <= 2) {
				게임수++;
				if(플레이어 == 0 && 컴퓨터 == 2 || 플레이어 == 1 && 컴퓨터 == 0 || 플레이어 == 2 && 컴퓨터 == 1) {
					System.out.println("승리");
					플레이어승리수++;
				}else if(플레이어 == 컴퓨터){
					System.out.println("무승부");
				}else {
					System.out.println("패배");
					컴퓨터승리수++;
				}
			}else if(플레이어 == 3) {
				System.out.println("------------종료-------------");
				System.out.println("총게임수" + 게임수);
				System.out.print("승리: ");
				if(플레이어승리수 > 컴퓨터승리수) {
					System.out.println("플레이어승리");
				}else if(플레이어승리수 == 컴퓨터승리수) {
					System.out.println("컴퓨터승리");
				}else {
					System.out.println("무승부");
				}
			}else {
				System.out.println("알수없는 행동");
			}
			
		}
		
	}

}

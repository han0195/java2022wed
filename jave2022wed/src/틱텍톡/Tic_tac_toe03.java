package 틱텍톡;

import java.util.Random;
import java.util.Scanner;

public class Tic_tac_toe03 {
	/*
	 * 삼목게임
	 * 1. 9칸 생성
	 * 		String 배열이용
	 * 사용자에게 인덱스번호 입력받기
	 * 			1.해당 인덱스에 o 표시 
	 * 			2.이미 둔 자리는 재입력 불가
	 * 
	 * 3. 컴퓨터는: 0~8 사이 난수 발생
	 * 			1. 해당 인덱스에 x표시
	 * 			2. 이미 둔 자리는 재 난수 생성
	 * 5.승리판단
	 * 		가로 인덱스들의 모양이 모두 동일하면
	 * 		012 345 678	3씩증가
	 * 		세로 인덱스들의 모양이 모두 동일하면
	 * 		036 147 258
	 * 		대각선 인덱스들의 모양이 모두 동일하면
	 *      048 246
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		String[] 게임판 = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]",};
		
		while (true) {
			
			for(int i = 0; i < 게임판.length; i++) {
				System.out.print(게임판[i]);
				if(i % 3 == 2) {
					System.out.println();
				}
			}
			
			while(true) {
				System.out.println("원하는 인덱스를 골라주세요");
				int 위치 = scan.nextInt();
				if(게임판[위치].equals("[ ]")) {
					게임판[위치] = "[o]";
					break;
				}else {
					System.out.println("해당위치에 이미 알이 있습니다");
				}
			}
			
			while(true) {				
				int 위치 = random.nextInt(9);
				if(게임판[위치].equals("[ ]")) {
					게임판[위치] = "[x]";
					break;
				}
			}
			
			String 승리알 = "";
//			가로 인덱스들의 모양이 모두 동일하면
//			 * 		012 345 678	3씩증가
//			 * 		세로 인덱스들의 모양이 모두 동일하면
//			 * 		036 147 258
//			 * 		대각선 인덱스들의 모양이 모두 동일하면
//			 *      048 246
			for(int i = 0; i < 6 ; i += 3) {
				if(게임판[i].equals(게임판[i + 1]) && 게임판[i + 1].equals(게임판[i + 2])) {
					승리알 = 게임판[i];
				}
			}
			
			for(int i = 0; i < 3 ; i++) {
				if(게임판[i].equals(게임판[i + 3]) && 게임판[i + 3].equals(게임판[i + 6])) {
					승리알 = 게임판[i];
				}
			}
			
			if(게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) {
				승리알 = 게임판[0];
			}
			if(게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6])){
				승리알 = 게임판[2];
			}
			
			
			if(승리알.equals("[o]")) {
				System.out.println("플레이어승리");
				for(int i = 0; i < 게임판.length; i++) {
					System.out.print(게임판[i]);
					if(i % 3 == 2) {
						System.out.println();
					}
				}
				break;
			}else if(승리알.equals("[x]")) {
				System.out.println("컴퓨터승리");
				for(int i = 0; i < 게임판.length; i++) {
					System.out.print(게임판[i]);
					if(i % 3 == 2) {
						System.out.println();
					}
				}
				break;
			}
			
			
			
			
		}
		

	}

}

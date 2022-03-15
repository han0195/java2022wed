package 틱텍톡;

import java.util.Random;
import java.util.Scanner;

public class Tic_tac_toe {
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
		
		Scanner scan = new Scanner(System.in);//입력객체 선언
		String[] 게임판 = {"[ ]", "[ ]", "[ ]",
						 "[ ]", "[ ]", "[ ]",
						 "[ ]", "[ ]", "[ ]"};// 게임판 만들어놓기
		
		//게임실행
		while(true) { //무한루프 종료조건 : 9칸 모두가 알이있을때
			//게임판 출력
			for(int i = 0; i < 게임판.length; i++){// 게임판개수만큼 출력
				System.out.print(게임판[i]); // 출력
				if(i % 3 == 2) { System.out.println(); } // 012출력후 줄바꿈
			}// 게임판 출력 for end
			 
			// 플레이어 위치 선택
			while(true) { //무한반복
				System.out.println("위치 선택: "); int 위치 = scan.nextInt();// 위치값 받기
				if(게임판[위치].equals("[ ]")) {// 만약 선택안 인덱스가 "[ ]"이라면
					게임판[위치] = "[o]";//해당인덱스에 "[o]"
					break;// 플레이어 위치 종료
				}else {//아니라면 실행문 출력후 다시 반복
					System.out.println("알림) 해당 위치에 이미 알이 있습니다");
				}
			}// 플레이어 위치 while문 종료
			
			//컴퓨터 위치 선택
			Random random = new Random(); // 난수객체 선언
			while(true) {//무한반복
				int 위치 = random.nextInt(9); // 0~8 까지 난수 발생
				if(게임판[위치].equals("[ ]")) {// 해당인덱스가 "[ ]"이라면
					게임판[위치] = "[x]"; // 해당인덱스"[x]" 
					break;
				}
			}
			
			//승리판독
			String 승리알 = ""; // o 인지 x 인 찾기위해
			//가로
			for(int i = 0; i <= 6; i += 3) {// i 0 1 2 / 3증가시켜 => 345 /3증가시켜 => 678 
				if( 게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i + 2]) ) { //해당인덱스 모두 같으면
					승리알 = 게임판[i]; //승리알은 i인덱스값
				}
			}//for end
			
			//세로
			for(int i = 0; i < 3; i++) { // i 0 3 6 /1증가시켜 => 1 4 7
				if(게임판[i].equals(게임판[i + 3]) && 게임판[i + 3].equals(게임판[i + 6])) {//해당인덱스 모두 같으면
					승리알 = 게임판[i];//승리알은 i인덱스값
				}
			}
			
			//대각선
			if(게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) {//해당인덱스 모두 같으면
				승리알 = 게임판[0];//승리알은 0인덱스값
			}
			
			if(게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6])) {//해당인덱스 모두 같으면
				승리알 = 게임판[2];//승리알은 2인덱스값
			}
			
			
			if(승리알.equals("[o]")) { // 승리알이 "[o]"이면
				System.out.println("알림)) 플레이어승리");
				//게임판 출력
				for(int i = 0; i < 게임판.length; i++){// 게임판개수만큼 출력
					System.out.print(게임판[i]); // 출력
					if(i % 3 == 2) { System.out.println(); } // 012출력후 줄바꿈
				}// 게임판 출력 for end
				break; // 게임종료
			}else if(승리알.equals("[x]")) {
				System.out.println("알림)) 플레이어승리");
				//게임판 출력
				for(int i = 0; i < 게임판.length; i++){// 게임판개수만큼 출력
					System.out.print(게임판[i]); // 출력
					if(i % 3 == 2) { System.out.println(); } // 012출력후 줄바꿈
				}
				break; //게임종료
			}
			
		}//게임실행 end
		
		
		

		
	}//me
}//cs

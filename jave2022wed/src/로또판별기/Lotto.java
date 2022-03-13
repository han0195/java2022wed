package 로또판별기;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {//2

	public static void main(String[] args) {
	
		int[] 사용자번호 = new int[6];// 사용자번호 저장할 int 배열
		int[] 추첨번호 = new int[6]; // 추첨번호 저장할 int 배열
		
		Scanner scan = new Scanner(System.in); // 입력객체 선언
		Random random = new Random(); // 난수생성 객체 선언
		
		while (true) { // 프로그램실행
			System.out.println("-----------------------로또--------------------------");
			System.out.println("1.로또 번호입력 2.추첨 3.종료");
			System.out.println("입력>> ");	int ch = scan.nextInt();
			
			if(ch == 1) { // 1번 선택시
				for(int i = 0; i < 사용자번호.length ; i++) {// 6번 반복하여 사용자번호 배열의 저장
					System.out.println((i + 1) + "번째 번호입력: "); int temp = scan.nextInt(); //i번째 번호 입력받기
					boolean 통과 = true; //통과 여부확인
					if(temp >= 1 && temp <= 45) {//유효성검사 1 ~ 45
						for(int j = 0; j < 사용자번호.length; j++) {// 중복여부 반복문
							if(temp == 사용자번호[j]) { // 만약에 같다면
								System.out.println("번호가 중복됩니다");
								통과 = false; // 저장 x
								i--; //반복추가
								break; // 같다면 바로 빠져나오기;
							}
						}// 중복여부 for end
						if(통과 = true) {
							사용자번호[i] = temp;
						}			
					}else {
						System.out.println("에러) 1~45까지만 입력해주세요");
						i--; // 반복한번더
					}// if e
				
				}
				
				
			}else if(ch == 2){ // 2번선택시
				
				for(int i = 0; i < 추첨번호.length; i++) {//난수 넣기
					boolean 통과 = true; // 통과 여부
					int temp = random.nextInt(45) + 1;// 난수 생성하여 temp 값에 저장
					
					for(int temp2 : 추첨번호) {// 중복검사
						if(temp == temp2) { // 중복된다면
							통과 = false;
							i--; // 반복추가
							break;
						}
					}
					
					if(통과 == true) {// 통과가 true 라면
						추첨번호[i] = temp; // 저장
					}
				}
				
				//비교
				System.out.println("-----------결과-------------");
				int 정답개수 = 0; // 정답개수 저장할변수
				for(int temp : 사용자번호) { // 사용자 번호 하나씩 꺼내
					for(int temp2 : 추첨번호) { // 추첨번호랑 비교
						if(temp == temp2) {// 같으면
							정답개수++; // 정답개수 ++
						}
					}
				}
				System.out.println("정답개수: " + 정답개수);
				System.out.println("선택번호: " + Arrays.toString(사용자번호));
				System.out.println("추첨번호: " + Arrays.toString(추첨번호));
				
				
				
				
			}else if(ch == 3){ // 3번선택시
				System.out.println("종료");
				break;// 프로그램 빠져나오기
			}else {// 그외
				System.out.println("알수없는 행동입니다");
			}
			
			
		}//프로그램실행 end
		
		

	}//me

}//ce

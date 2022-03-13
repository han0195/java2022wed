package 로또판별기;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottos {

	public static void main(String[] args) {
		
		int[] 사용자번호 = new int[6]; // 사용자번호 저장시킬 배열 선언
		int[] 추첨번호 = new int[6];	//추첨번호 저장시킬 배열선언
		
		Scanner scan = new Scanner(System.in); // 입력객체선언
		Random random = new Random();//난수객체 선억
		
		while(true) {// 프로그램실행 [무한반복]
			System.out.println("------------------- 로또 --------------------");
			System.out.println("1.로또사기 2.추첨 3.종료");
			System.out.println("선택>> ");	int ch = scan.nextInt(); // 선택입력받기
			
			if(ch == 1) {// 선택이 1이면
				for(int i = 0; i < 사용자번호.length; i++) {//6개 번호 받아오게 for문 선언
					System.out.println((i + 1) + "번째 번호를 입력해주세요");	int temp = scan.nextInt(); // 번호입력받아 임시로저장
					boolean 통과 = true;// 조건들의 통과여부
					if(temp >= 1 && temp <= 45) {		//유효성검사				
						for(int temp2 : 사용자번호) {		//중복검사를 위해 사용자번호 temp2 임시변수에 저장
							if(temp == temp2) {			// 비교
								System.out.println("중복"); 
								통과 = false;				// 같다면 통과 false;
								break;					// 반복문 빠져나오기
							}
						}//for end
					}else {//유효성검사를 통과못했으면
						System.out.println("에러)) 알수없는 번호");
						통과 = false; // 통과여부 false
					}
					
					if(통과 == true) {// 조건들이 true라면
						사용자번호[i] = temp; //저장
					}else {//아니라면
						i--;// 반복횟수 추가
					}
					
					
				}
				
				
			}else if(ch == 2) {// 선택이 2라면
				//난수 6개 
				for(int i = 0; i < 추첨번호.length; i++) {// 추첨번호길이만큼 반복
					boolean 통과 = true;	//조건통과여부
					int temp = random.nextInt(45) + 1; //난수생성
					for(int temp2 : 추첨번호) { // 중복검사
						if(temp == temp2) {		//같다면
							통과 = false;			// 통과 false;
						}
					}//중복검사 end
					
					if(통과) { // 통과가 true라면
						추첨번호[i] = temp; //저장
					}else {// 아니라면
						i--; //반복횟수 추가
					}
					
				}
				
				
				int 맞은개수 = 0; // 맞은개수 저장할변수 
				for(int temp : 사용자번호) { // 사용자번호 하나씩 임시변수에 저장
					for(int tmep2 : 추첨번호) {// 추첨번호 하나씩 임시변수에 저장
						if(temp == tmep2) { // 사용자번호 임시변수에다 추첨번호 임시변수 비교 같다면
						맞은개수++;	//맞은개수 ++
						}
					}
				}//비교 for 문 end
				
				System.out.println("-----------결과-------------");
				System.out.println("맞은개수: " + 맞은개수); // 맞은개수 출력
				System.out.println("선택번호: " + Arrays.toString(사용자번호)); // 사용자번호 배열 출력
				System.out.println("추첨번호: " + Arrays.toString(추첨번호));	//추첨번호 배열출력
				
			}else if(ch == 3) {// 선택이 3이라면
				System.out.println("종료");
				break;//프로그램 while 문 빠져나오기
			}else {//그외
				System.out.println("알수없는 행동");
			}
			
			
			
		}// 프로그램실행 end
		
		
		

	}//me
}//cs

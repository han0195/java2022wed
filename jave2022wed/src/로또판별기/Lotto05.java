package 로또판별기;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto05 {
	//변수 1.사용자번호[] 2,추첨번호[]
			//프로그램실행
				//1.로또 번호입력 2.추첨 3.종료
					//1.유효성 검사
						// 중복검사
				
				//추첨
					//1.난수
					//2.중복체크
					//결과
	public static void main(String[] args) {
		
		int[] 사용자번호 = new int[6];
		int[] 추첨번호 = new int[6];
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			System.out.println("------------------------로또--------------------------");
			System.out.println("1.로또 번호입력 2.추첨 3.종료");
			System.out.println("선택>> "); int ch = scan.nextInt();
			
			if(ch == 1) {
				for(int i = 0; i < 사용자번호.length; i++) {
					System.out.println((i + 1) + "번재 번호를 입력하세요"); int temp = scan.nextInt();
					boolean 통과 = true;
					if(temp >= 1 && temp <= 45){						
						for(int temp2 : 사용자번호) {
							if(temp2 == temp) {
								System.out.println("중복");
								통과 = false;
								break;
							}
						}
					}else {
						System.out.println("에러)) 1~45까지 입력해주세요");
						i--;
					}
					
					
					if(통과) {
						사용자번호[i] = temp;
					}else {
						i--;
					}
					
				}
			}else if(ch == 2) {
				for(int i = 0; i < 추첨번호.length; i++) {
					boolean 통과 = true;
					int temp = random.nextInt(45) + 1;
					
					for(int temp2 : 추첨번호) {
						if(temp == temp2) {
							통과 = false;
							break;
						}
					}
					
					if(통과) {
						추첨번호[i] = temp;
					}else {
						i--;
					}
					
				}
				
				
				int 맞은개수 = 0;
				for(int temp : 사용자번호) {
					for(int temp2 : 추첨번호) {
						if(temp == temp2){
							맞은개수++;
						}
					}
				}
				
				
				
				System.out.println("---------------결과---------------");
				System.out.println("맞은개수: " + 맞은개수);
				System.out.println("선택번호: " + Arrays.toString(사용자번호));
				System.out.println("추첨번호: " + Arrays.toString(추첨번호));
				
				
			}else if(ch == 3) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("알수없는 행동입니다");
			}
			
			
			
		}
 
	}

}

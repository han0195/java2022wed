package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;

public class lottery_lottery {// 구현횟수: 1 // 시간: x
	// 6개의 번호를 입력받아서 로또 추첨
	// 유효성검사 / 중복체크, 배열입력
	// 1. 6개의 입력 받기
	// 2. 6개의 난수 생성
	// 3. 판독
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 입력객체선언
		
		int[] use = new int[6];
		int[] computer = new int[6];
		int same = 0;
		
		boolean pass = true; // 안전하게 저장하기위해 검사
		
		//6개번호 입력받아 use 저장하기
		for(int i = 0; i < 6; i++) { // 6개의 입력객체받기
			System.out.printf("%d번 번호를 입력해주세요", i + 1);
			int num = scanner.nextInt();
			pass = false;
			
			//유효성 검사
			if(num > 0 && num < 46) { // 1 ~ 45 범위가 맞는지 검사
				//중복검사
				for(int j = 0; j < use.length; j++) {
					if(num == use[j]) { // 번호가 같다면
						System.out.println("에러) 번호가 중복되었습니다");
						i--;
					}else {
						pass = true;
					}
				}// f e
			}else { // 아니면 i--해서 반복 1회 추가
				System.out.println("에러) 1~45중에 입력해주세요");
				i--;
			}
					
			//통과여부
			if(pass == true) {
				use[i] = num; 
			}		
		}// f e
		
		
		Random random = new Random(); // 랜덤 객체 선언
		// 램덤 난수생성
		for(int i =0; i < computer.length; i++) {
			
			int num = random.nextInt(45) + 1;	// 난수 생성
			
			// 중복체크
			pass = true; // pass 초기화; true 초기화한 이유: 번호가 같지않으면 통과시키기위해
			for(int j = 0; j < 6; j++) {
				if(num == computer[j]) { // 번호가 같다면
					i--;
					pass = false;
				}
			}// f e
			
			
			if(pass == true) {
				computer[i] = num;
			}	
		}
		
		
		//판독
		for(int temp : use) {
			for(int temp2 : computer) {
				if(temp == temp2) {
					same++;
				}
			}
		}
		System.out.println("------------------추첨-----------------");
		System.out.printf("맞은개수: %d\n", same);
		System.out.println(Arrays.toString(use));
		System.out.println(Arrays.toString(computer));
	}// m e

}// c e

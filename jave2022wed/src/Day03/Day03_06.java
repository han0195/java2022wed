package Day03;

import java.util.Scanner;

public class Day03_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 입력객체
		
//		// 별문제1 : 입력받은 수 만큼 * 출력
//		System.out.println("문제1) 별개수: "); int s1 = scan.nextInt();
//		for(int i = 1; i <= s1; i++) {
//			//*i는 1부터 입력받은 수 까지 i는 1씩증가
//			System.out.print("*");
//		}
//		System.out.println();
////----------------------------------------------------------------------------	
//		
//		// 별문제2 : 입력받은 수 만큼 * 출력 [단 5개마다 줄바꿈 처리]
//		System.out.println("문제2) 별개수: "); int s2 = scan.nextInt();
//		for(int i = 1; i <= s2; i++) {	
//			System.out.print("*");
//			
//			// 5개만 줄바꿈
//			if( i % 5 == 0) { System.out.println();	}
//		}
//		
////-----------------------------------------------------------------------------------		
//		// 별문제 3: 입력받은 줄 만큼 출력
//		System.out.println("문제3) 줄 개수: "); int s3 = scan.nextInt();
//		// 줄 수만큼 반복실행
//		for(int i = 1; i <= s3; i++) {
//			// 줄 수 i 숫자만큼 별출력
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			//줄바꿈
//			System.out.println();
//		}
////-----------------------------------------------------------------------------		
//		// 별문제 4: 입력받은 줄 만큼 출력
//		System.out.println("문제4) 줄 개수: "); int s4 = scan.nextInt();
//		// 줄 수만큼 반복실행
//		for(int i = 1; i <= s4; i++) {
//			// i를 j의 대입해서 i 크기만큼 반복횟수를 줄여서 출력 / j = i - 1
//			for (int j = i; j <= s4; j++) {
//				System.out.print("*");
//			}
//			//줄바꿈
//			System.out.println();
//		}
//		
//		//순서도
////----------------------------------------------------------------------------------	
//		//별문제5 : 입력받은 줄 만큼 출력
//		System.out.println("문제5) 줄 개수: "); int s5 = scan.nextInt();
//		//줄 개수를 입력받아서 반복
//		for(int i = 1; i <= s5; i++) {	
//			//초기값 j 를 i의 대입해서 s5 비교 반복
//			for(int j = i; j < s5 ; j++) {
//				System.out.print(" ");
//			}
//			//x 를 s5 대입한뒤 i 빼기 -> x = 4 < s5 = 5 // 1번반복 *출력
//			//x 를 s5 대입한뒤 i 빼기 -> x = 3 < s5 = 5 // 1번반복 **출력
//			for(int x = s5 - i; x < s5; x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
////--------------------------------------------------------------------------------
//		//별문제6 : 입력받은 줄 만큼 출력
//		System.out.println("문제6) 줄 개수: "); int s6 = scan.nextInt();
//		
//		for(int i = 0; i < s6; i++) {
//		 
//			for(int j = s6 - i ; j < s6; j++) { //
//				System.out.print(" ");
//			}
//			
//			for (int s = i; s < s6; s++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
////--------------------------------------------------------------------------------------------			
//		//별문제7 : 입력받은 줄 만큼 출력
//		System.out.println("문제7) 줄 개수: "); int s7 = scan.nextInt();
//		for (int i = 0; i < s7; i++) {
//			//공백출력
//			for(int j = i; j < s7; j++) {
//				System.out.print(" ");
//			}
//			//별찍기 *트리모양이라 처음 1개 찍고 i * 2 씩하여 별 2개씩 증가
//			for(int s = 0; s <= i * 2; s++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
////-----------------------------------------------------------------------------------------------
//		//별문제8 : 입력받은 줄만큼 출력 
//		System.out.println("문제7) 줄 개수: "); int s8 = scan.nextInt();
//		for(int i = 0; i < s8; i++) {
//			//공백출력
//			for(int j = i; j < s8; j++) {
//				System.out.print(" ");
//			}
//			//7번문제랑 비슷하게 i * 2씩 해서 별찍기
//			for(int s = 0; s <= i * 2; s++) {
//				System.out.printf("%d", i + 1);
//			}
//			System.out.println();
//		}
////-------------------------------------------------------------------------------------------------------		
//		//별문제9 : 입력받은 줄만큼 출력
//		System.out.println("문제9) 줄 개수: "); int s9 = scan.nextInt();
//		
//		for(int i =0; i < s9; i++) {
//			//공백찍기
//			for(int j = s9 - i; j < s9; j++) {
//				System.out.print(" ");
//			}
//			//
//			for(int s = i + 2; s <= s9 * 2 - i; s++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
////---------------------------------------------------------------------------------------------------------		
		//별문제10 : 입력받은 줄만큼 출력
		System.out.println("문제10) 줄 개수: "); int s10 = scan.nextInt();
		
		// 입력받은 객체를 두개의 for문으로 표현하기 위해 2로 나눔 [ 정수는 나눠도 소수로 안변함 ]
		// 5입력시
		int s10_1 = (s10 / 2); // 2 사다리꼴
		int s10_2 = (s10 / 2) + 1; // 3 역사다리꼴
				
		//사다리꼴		
		for (int i = 0; i < s10_1; i++) { //s10_2 만큼 반복 // s10_2 = 2 [2번반복] 0 1
			//사다리꼴 공백 출력
			for(int j = i; j < s10_1; j++) { //i < s10_2 대입해서 반복 
				System.out.print(" ");		//처음 공백 2개 추가 후의 하나씩줄어듬
			}
			
			for(int s = 0; s <= i * 2; s++) { // *이 i 반복횟수 * 2 씩 늘어나니깐 기준값을 i * 2로 비교연산
				System.out.print("*"); 		  // 처음 1개 출력 후의 3개출력
			}								  		//1. 0 <= 0 [1개출력]
			System.out.println(" ");				//2. 0 <= 2 [3개출력]
		}
		
		//역사다리꼴 별찍기
		for(int i =0; i < s10_2; i++) {//s10 만큼 반복 // s10 = 2 [3번반복] 0 1 2  
			//공백찍기
			for(int j = s10_2 - i; j < s10_2; j++) { // 처음 입력개수의 맞개 별 출력하기위해 공백 풀필요
				System.out.print(" ");			 // 그래서 S10 - i 하나씩 추가하기위해
			}											
			//
			for(int s = i; s < s10 - i; s++) { // 처음 별을 다찍고 2개씩 빼기 위해 s10 - i
				System.out.print("*");		  		// 1. 0 < 5 - 0 [5번 출력]0 1 2 3 4 
			}										// 2. 1 < 4 [3번 출력]1 2 3 
			System.out.println();					// 3. 2 < 3 [1번 출력]2
		}
		
		
	}
}

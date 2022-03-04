package Day04;

import java.util.Scanner;

public class Day04_01 {

	public static void main(String[] args) {
		// 제어문 : if, switch
		// 반복문 : for, while : 무한루프
			// | 1. 초기값 2. 조건식 3. 증감식 | 4. 실행문
			// while 형태
			// 		초기값;
			// 		while( 조건식 ) {
			//			실행문;
			//      	증감식;
			// 		}
		
		// for 예)
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		
		//while 예1)
		int i = 1; // 1. 초기값
		while( i <= 10 ) {
			System.out.println(i);	//4. 실행문
			i++;	// 3. 증감식
		}// while e
//------------------------------------------------------------------------------------		
		// for 예2) 1~100 누적합계
		int sum = 0;
		for(int j = 1; j <=100; j++) {
			sum += j;
		}
		System.out.println("for 1~100까지 누적합계: " + sum);
		
		// while 예2) 1~100 누적합계
		int j = 1;			// 1. 초기값
		int sum2 = 0;
		while (j <= 100) { 	// 2. 조건식
			sum2 += j; 		// 4. 실행문
			j++;			// 3. 증감식
		}
		System.out.println("while 1~100까지 누적합계: " + sum2);
		
		// while 예3) 무한루프
		while(true) { // 조건식 true 실행 // true 상수 => 무한;
			System.out.println("무한루프");
			Scanner scan = new Scanner(System.in);
			int exit = scan.nextInt();
			if ( exit == 3 ) {
					break; // 가장 가까운 반복문 탈출 [ if 제외 ]
			}
		//	break;	// 가장 가까운 반복문탈출 [ if제외 ]
		}
	}

}

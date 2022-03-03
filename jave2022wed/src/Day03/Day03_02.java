package Day03;

import java.util.Scanner;

public class Day03_02 {

	public static void main(String[] args) {
		
		// 입력객체 = { } 당 1번 선언
		Scanner scan = new Scanner(System.in);
		
//		// 문제1 : 2개의 정수를 입력받아서 더 큰수 출력
//		System.out.println("정수입력: ");
//		int 정수1 = scan.nextInt(); // int형 변수 선언 하고 입력받은 데이터을 정수로 가져와서 대입
//			//int형 변수 선언 하고 입력받은 값을 정수로 가져와서 대입
//		System.out.println("정수2입력: ");
//		int 정수2 = scan.nextInt();
//		
//		// 제어
//		if( 정수1 > 정수2 ) System.out.println("더 큰수: " + 정수1);
//		// 만약에 입력받은 정수1 변수가 정수2 보다 크면 실행 아니면 다음 조건
//		else if( 정수1 < 정수2 ) System.out.println("더 작은수: " + 정수2);
//		// [다음조건] 정수1변수가 정수2 보다 작으면 실행 아니면 그외
//		else 				  System.out.println(" 같다 ");
//		
//		// 문제2 : 3개의 정수를 입력받아서 가장 큰수 출력
//		System.out.println("정수1입력: "); int 정수3 = scan.nextInt();
//		System.out.println("정수1입력: "); int 정수4 = scan.nextInt();
//		System.out.println("정수1입력: "); int 정수5 = scan.nextInt();
//		int max = 정수3;	//max에 첫번째 값 넣어두기	
//		if ( max < 정수4 ) { max = 정수4;}	// 만약에 max 보다 정수4가 더 크면 교체	
//		if ( max < 정수5 ) { max = 정수5;}
//		System.out.println(" 가장 큰수: " + max);
//		
//		
//		// 문제3 : 4개의 정수를 입력받아서 가장 큰수 출력
//		System.out.println("정수1입력: "); int 정수6 = scan.nextInt();
//		System.out.println("정수1입력: "); int 정수7 = scan.nextInt();
//		System.out.println("정수1입력: "); int 정수8 = scan.nextInt();
//		System.out.println("정수1입력: "); int 정수9 = scan.nextInt();
//		int max2 = 정수6;
//		if ( max2 < 정수7 ) { max2 = 정수7; };
//		if ( max2 < 정수7 ) { max2 = 정수8; };
//		if ( max2 < 정수7 ) { max2 = 정수9; };
//		
//		// 문제4 : 3개의 정수를 입력받아서 오름차순
//		System.out.println("정수1입력: "); int 정수10 = scan.nextInt();
//		System.out.println("정수1입력: "); int 정수11 = scan.nextInt();
//		System.out.println("정수1입력: "); int 정수12 = scan.nextInt();
//		
//		if ( 정수10 > 정수11) {	// > : 오름차순		< : 내림차순
//			// 교체[ 스왑 = 두개 변수에 데이터 교화방법 ]
//			int temp = 정수10; // 임시변수 = 변수1;
//			정수10 = 정수11;	  // 변수1 = 변수2;
//			정수11 = temp;	  // 변수2 = 임시변수;
//		}
//		if ( 정수10 > 정수12) {int temp = 정수10; 정수10 = 정수12;	정수12 = temp;}
//		if ( 정수11 > 정수12) {int temp = 정수11; 정수11 = 정수12;	정수12 = temp;}
//		System.out.printf("입력한 값 오른차순: %d %d %d", 정수10, 정수11,정수12);
		
		
		// 문제5 : 4개의 정수를 입력받아서 오름차순
		System.out.println("정수1입력: "); int 정수13 = scan.nextInt();
		System.out.println("정수1입력: "); int 정수14 = scan.nextInt();
		System.out.println("정수1입력: "); int 정수15 = scan.nextInt();
		System.out.println("정수1입력: "); int 정수16 = scan.nextInt();
		
		if (정수13 > 정수14) {int temp = 정수13; 정수13 = 정수14; 정수14 = temp;}
		if (정수13 > 정수15) {int temp = 정수13; 정수13 = 정수15; 정수15 = temp;}
		if (정수13 > 정수16) {int temp = 정수13; 정수13 = 정수16; 정수16 = temp;}
		
		if (정수14 > 정수15) {int temp = 정수14; 정수14 = 정수15; 정수15 = temp;}
		if (정수14 > 정수16) {int temp = 정수14; 정수14 = 정수16; 정수16 = temp;}
		
		if (정수15 > 정수16) {int temp = 정수15; 정수15 = 정수16; 정수16 = temp;}
		System.out.printf("입력한 값 오른차순: %d %d %d %d", 정수13, 정수14, 정수15, 정수16);
	} // m e

}// c e

package Day03;

public class Day05_05 {
	public static void main(String[] args) {
		
		//반복문 : 1. for  2. while  3. do~while[x]
		// for :
			// 어디서부터 어디까지 몇개씩 증가/감소 하면서 반복처리
			// 1부터 10까지 1씩 증가하면서 반복처리 => 10번 실행
			// 1부터 10까지 3씩 증가하면서 반복처리 => 4번 실행
		// 1.초기값 2.조건식 3.증감식
		// 형태
		//		for( 초기값; 조건식; 증감식 ) {
		//			반복문실행문;
		//		}
		
		// p.121 예제
			for(int i = 1; i<=10; i++) {
				// int i = 1 : 초기값 선언[i는 반복변수]
				// i <= 10 : 조건식 [i가 10이하이면 실행 아니면 실행불가]
				// i++ : 증감식
				System.out.print(i + " ");				
			}
			
		// p.122 1부터 100까지 합을 출력
			int sum = 0; //누적합 을 저장할 변수
			for(int i = 1; i <= 100; i++) {
				//i 1~100 까지 반복할동안 변수에 합하기
				sum += i;
			}// 반복문 종료
			System.out.println("\n1~100까지 누적합 결과 : " + sum);
			
		
		//예제3 : 1부터 100까지 7배수의 누적합계
			int sum2 = 0;
			// * i는 100까지 7씩 증가하면서 실행문 반복처리
			for (int i = 0; i <= 100; i += 7) {
				sum2 += i;
			}
			System.out.println(" 1~100까지 7배수 누적합 결과: " + sum2);
			
		//예제3 : 1부터 100까지 7배수의 누적합계
			int sum3 = 0;
			for( int i = 1; i <= 100; i++) {
				// 배수찾기 : 값 % 수 == 0 이면 값 그 수의 배수
				if (i % 7 == 0) { sum3 += i; }
				//만약에 i가 7의 배수이면 누적합 아니면 x
			}
			
		//예제4 : 2단 구구단 만들기 
			for( int 곱 = 1; 곱<=9 ; 곱++) {
				System.out.println("2 X" +곱+" = " + (2*곱));
				
			}
		
		// for 중첩
			
		// p.124 : 2단 ~ 9단 구구단 만들기 [ 단 = 변수, 곱 = 변수]
			//단 : 2부터 9까지 1씩증가
			//곱 : 1부터 9까지 1씩증가
				// 단 1번 실행될떄마다 곱 9번 반복
			// 구구단 총 실행 횟수 => 72번 실행
		for(int 단 = 2; 단 <= 9; 단++) {
			System.out.printf("--------------%d단---------------\n", 단);
			for(int 곱 = 1; 곱 <= 9; 곱++) {
				System.out.printf(" %d x %d = %d\n", 단, 곱, 단*곱);
			}
		}
	}// m e
}// c e

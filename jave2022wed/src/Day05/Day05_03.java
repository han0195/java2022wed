package Day05;

import java.util.Scanner;

public class Day05_03 {

	public static void main(String[] args) {
		
		// p.181
		int max = 0; // 최대값 저장하는 변수
		int[] array = {1,5,3,8,2}; // 선언+초기값 선언
		
		for(int i = 0; i < array.length; i++) {
			// *i는 0 부터 배열의 길이 까지 1씩증가 실행 반복처리
			if( max < array[i]) max = array[i];
			// * 만약에 max i번쨰 인덱스의 값이 더 크면 max에 i번째 값 대입
			
			
			
		}
		System.out.println("max : " + max );
		
		
		// 8.
		int[][] array2 = {	{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} };
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0; // 개수 저장 변수
		for(int i = 0; i < array2.length; i++) {
			// *행은 0부터 배열의 행길이[3]미만까지 1씩 증가
			for(int j = 0; j < array2[i].length; j++) {
				// *열은 0부터 배열의 열길
				sum += array2[i][j];
				count += 1;	//개수를 구하기위해 하나씩 count
			}// for 열 e
		}// for 행 e
		avg = (double)sum / count; // 평균계싼
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
		
		// 9.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int max2 = 0;
		double avg2 = 0;
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수를 입력해주세요");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]>\n", i);
					scores[i] = scanner.nextInt(); // 점수입력받기
				}
				
			}else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]: %d\n", i, scores[i]);
				}
			}else if(selectNo == 4) {
				for(int i = 0; i < scores.length; i++) {
					if(max2 < scores[i]) {
						max2 = scores[i];
					}
					avg2 += (double)scores[i];		// 더하기		
				}// for e
				avg2 = avg2 / (double) studentNum;	// 평균구하기
				System.out.println("최고점수: " + max2);
				System.out.println("평균점수: " + avg2);
			}else if(selectNo == 5) { // 종료
				run = false;
			}
		}
		
		
		System.out.println("프로그램 종료");
		
	}// m e

}

package Day05;

public class Day05_01 {

	public static void main(String[] args) {
		// 변수 : 하나의 데이터 저장
		// 배열 : 동ㅇ일한 자료형 데이터를 특정기준[인덱스]으로 나열
		// 1차원 배열 : 길이
			// 형태 : 자료형[] 배열명 = new 자료형[길이];
			// int[] arr = new int[3];
			// int int int
			// int형 변수 3개 저장할수 있는 배열
		
		// 2차원 배열 : 가로길이 세로길이
			// 형태 : 자료형[] [] 배열명 = new 자료형 [가로=행] [세로=열];
			// int[][] arr = new int[4][3]
			// int int int int
			// int int int int
			// int int int int
			// * int형 변수 12개를 저장할수있는 배열
		
		// 3차원 배열 : 가로길이 세로길이 높이길이
			// 형태 : 자료형[][][] 배열명 = new 자료형[가로][세로][높이];
		
		// 예제1)
		int[] 배열 = new int[3]; //int : 4바이트 * 3=> 12바이트 배열
		배열[0] = 80; 배열[1] = 90; 배열[2] = 100;
		// *0번 인덱스에 80데이터 대입
		
		int[][] 배열2 = new int[2][3]; // [가로=행][세로=열] // 4바ㅣ트 * 2 * 3 => 24바이트
			배열2[0][0] = 80;	배열2[0][1] = 90;	배열2[0][2] = 100;
			배열2[1][0] = 40;	배열2[1][1] = 50;	배열2[1][2] = 60;
			
		System.out.println("1차원배열: "+ 배열); // 인덱스 없이 배열명만 호출시
		System.out.println("2차원배열: " + 배열2);// [메로리] 주소값만나옴
		
		System.out.println("1차원 배열길이: " + 배열.length); // 배열의 길이
		System.out.println("2차원 배열 행 길이: " + 배열2.length); // 2차원배열의 행길이
		System.out.println("2차원 배열 열 길이: " + 배열2[0].length); // 2차원배열의 열길이
		
		// 예) 반복무을 이용한 0~49까지 첫번째 행에 저장
						// 50~99까지 두번째 행에 저장 하는 2차원 배열 선언
		int[][] 배열3 = new int[2][50];
		
		// 저장 반복문
		for(int i = 0; i < 100 ; i++) {
			// * i는 0부터 100미만까지 1씩증가 실행 반복처리 => 총 100회
			
			if(i < 50) {
				배열3[0][i] = i;	// 첫번째 행 값 넣기
			}else{
				배열3[1][i - 50] = i;	// 두번째 행 값의 저장 50 ~ 99
			}
		}
		
		// 출력 반복문
		for(int i =0; i < 100; i++) {
			if(i < 50) {
				System.out.printf("%3d", 배열3[0][i]);
									// %d : 정수		// %2d : 2칸 차지[ 단 데이터가 없으면 공백 처리 ]
													// %3d : 3칸
									// %f : 실수		// %.2f : 소수점 자릿수
			}else{
				System.out.printf("%3d", 배열3[1][i - 50]);
			}
			
			// 행 구분
			if(i == 49) {System.out.println();}
		}
			
			
			
			
	}

}

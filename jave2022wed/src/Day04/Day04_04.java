package Day04;

public class Day04_04 {

	public static void main(String[] args) {
		
		// 데이터 저장 1개 => 변수
		// 배열 [ 특정(인덱스) 기준으로 나열 ]
			// * 여러개 변수를 저장/관리
			// 1. 인덱스 : 저장되는 순서번호[ 0번 시작 ~ ]
			// 2. [ ] : 대괄호 사용한다.
			// 3. 동일한 타입 자료형의 여러 변수 관리
		
		// 선언
			// 1. 자료형[] 배열명;		2.자료형 배열명[];
			// 2. 자료형[] 배열명 = { 데이터1, 데이터2, 데이터3 ~~ };
			// 3. 자료형[] 배열명 = new 자료형[길이];
					// 길이 : 자료형 길이
		// 데이터 호출
			// * 배열명 : 배열 메모리 주소값
			// 1. 배열명[인덱스번호]	: 해당 인덱스번호의 데이터 호출
		
		// 데이터 변경
			// 1. 배열명[인덱스번호] = 새로운 데이터
		
		// 배열의 길이
			// 1. 배열명.length : 배열내 길이 [ 변수의 개수 ]
		
		// for 과 배열 활용
			// for( 자료형 임시변수 : 배열명 ) { }
			// 배열의 0번 인덱스부터 끝 인덱스까지 임시변수에 대입 반복처리

 		
		
		// p.153 예1)
		
		int[] scores = { 83, 90, 87 };
			// 1. int[] : int형 데이터 여러개를 저장할수 있는 배열선언
			// 2. scores : 배열이름[ 아무거나 ]
			// 3. { 데이터1, 데이터2 .....} : 배열의 값 추가
		//* 83, 90, 87 이라는 int형 데이터 3개를 저장하는 배열 선언
			// 83 -> 0번 인덱스 에 저장
			// 90 -> 1번 인덱스 에 저장
			// 87 -> 2번 인덱스 에 저장
		
		// 배열 출력
		System.out.println("scores[0]: " + scores ); // 배열이름 호출하면 -> 주소값 출력
		System.out.println("scores[0]: " + scores[0]); // 0번째 인덱스의 데이터 호출
		System.out.println("scores[1]: " + scores[1]); // 1번째 인덱스의 데이터 호출
		System.out.println("scores[2]: " + scores[2]); // 2번째 인덱스의 데이터 호출
		
		// 반복문과 배열 활용
		int sum = 0;
		for( int i = 0; i < 3; i++) {
			System.out.println("scores["+i+"]: " + scores[i]);
			sum += scores[i]; // 배열명[인덱스번호]
		}
		
		System.out.println("총합: " + sum);
		double avg = sum / scores.length;
		
		// 에제2)
		int[] 정수배열1 = new int[3];
			//int[] : int형 배열 선언
			//	정수배열1 : 배열이름[아무거나]
			// new : 메모리할당 ( 객체, 배열에서 사용)
			// int[3]: 자료형[ 길이 ] : 저장개수
		//* int형 변수 3개를 저장할수 있는 배열 선언[ 메모리 할당 ]
		for(int i = 0; i < 3; i++) {
			System.out.println(정수배열1[i]);
		}
		//데이터 넣기
		정수배열1[0] = 100; 정수배열1[1] = 93; 정수배열1[2] = 20;
		
		for(int i = 0; i < 정수배열1.length; i++) {
			// * i는 0부터 배열 길이 전까지
			System.out.println(정수배열1[i]);
		}
		
		// for문 변경 활용
			// 배열자료형 변수명 : 배열명
		for( int temp : 정수배열1 ) {
			//* 배열내 인덱스 0번 부터 끝까지 temp 저장 반복
				// 1. 정수배열1[0] -> temp 저장
				// 2. 정수배열1[1] -> temp 저장
				// 3. 정수 배열[2] -> temp 저장
			System.out.println(temp);
		}
		
		
				
	}// m e

}// c e

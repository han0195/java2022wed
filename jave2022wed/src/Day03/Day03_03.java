package Day03;

import java.util.Scanner;

public class Day03_03 {

	public static void main(String[] args) {
//		//Scanner 선언
		Scanner scan = new Scanner(System.in);
//		
//		//문제6
//		// 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력
//		System.out.println("문제6) 점수를 입력해주세요: ");
//		int 문제6_점수 = scan.nextInt();
//		
//		if (문제6_점수 >= 90) {System.out.println("합격입니다");}
//		else {System.out.println("불합격입니다");}
//		
////----------------------------------------------------------------------------
//				
//		//문제7
//		// 점수를 입력받아 점수가 90점 이상이면 A등급
//		//				점수가 80점 이상이면 B등급
//		//				점수가 70점 이상이면 C등급
//		//				그외 재시험
//		System.out.println("문제7) 점수를 입력해주세요: ");
//		int 문제7_점수 = scan.nextInt();
//		
//		if (문제7_점수 >= 90) {System.out.println("등급: A");}
//		if (문제7_점수 >= 80) {System.out.println("등급: B");}
//		if (문제7_점수 >= 70) {System.out.println("등급: C");}
//		else {System.out.println("재시험");}
//		
////-----------------------------------------------------------------------------		
//		
//		//문제8 로그인페이지
//		// [ 입력 ] : 아이디와 비밀번호를 입력받기
//		// [ 조건 ] : 회원아이디가 admin 이고 
//		//           비밀번호가 1234 일 경우에는 
//		//          로그인 성공 아니면 로그인 실패 출력
//			
//		System.out.println("아이디를 입력해주세요");	String id = scan.next();
//		// char 자료형 [문자 1개 저장]
//		// 자료형으로 문자열을 저장할수 없다.
//			// 1. String 클래스 사용하면 문자열 저장가능
//			// 2. char 배열/리스트 사용하면 가능
//		
//		System.out.println("비밀번호를 입력해주세요");	int pw = scan.nextInt();
//			//객체는 연산불가
//				// '자바' >= <= == > < != [ 불가능 ]
//				// 자료형 사용하는 변수는 연산자 사용 가능
//				// 클래스 사용하는 객체는 연산자 사용 불가 -> 메소드
//					// 문자열 비교시 .equals
//					// 문자열1.equals( 문자열2 ) 
//		
//		boolean 로그인성공 = false;
//			//boolean : 1비트 true or false
//		// String 변수는 서로 비교가 안되서 equals를 통해 비교가능
//		if (id.equals("admin")) { // id 클래스 객체이기 때문에 == 불가능 -> .equals()사용
//			
//			if (pw == 1234) {
//				// pw는 자료형변수이기 때문에 == 가능
//				System.out.println("로그인 성공"); // 비밀번호가 1234 가 맞으면 실행
//				로그인성공 = true;		
//			}else { 			
//				// 비밀번호가 1234 가 아니면 실행
//				System.out.println("비밀번호가 틀렷습니다");		
//			}
//		
//		}else {			
//			// id가 admin이 아니면 실행	
//			System.out.println("아이디가 틀렸습니다");
//		}
//		
//		if(로그인성공 == false) System.out.println("로그인 실패");
//		
////---------------------------------------------------------------------------------------
		//문제9
		System.out.println("국어점수: "); int 국어 = scan.nextInt();
		System.out.println("영어점수: "); int 영어 = scan.nextInt();
		System.out.println("수학점수: "); int 수학 = scan.nextInt();
		int 평균 = (국어 + 영어 + 수학) / 3;
		
		if (평균 >= 90) { // 평균이 90점 이상이면
			if(국어 == 100) System.out.println("국어우수");
			if(영어 == 100) System.out.println("영어우수");
			if(수학 == 100) System.out.println("수학우수");
		}//if e
		else if( 평균 >= 80) { // 평균이 80점 이상이면
			if( 국어 >= 90 ) System.out.println("국어장려");
			if( 영어 >= 90 ) System.out.println("영어장려");
			if( 수학 >= 90 ) System.out.println("수학장려");	
			
		}// elseif e
		else {System.out.println("재시험");}
		
	}

}

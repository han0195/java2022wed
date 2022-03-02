package Day02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Day02_02 {	//c s

	public static void main(String[] args) { // m s
		
		// ; : 실행 단위 구분
		// 동일한 변수명은 사용할수 없다. [ 이름이 중복되면 오류(구분불가) ]
		
		// p.40 byte : 1바이트 정수 +-128
		byte var1 = -128; System.out.println( var1 );
		byte var2 = -30; System.out.println( var2 );
		byte var3 = 30; System.out.println( var3 );
		//byte var4 = 300; System.out.println( var4 );
			// 오류 발생 : 128 이상은 저장할수 없다.
		byte var4 = 'j'; System.out.println( var4 );
			// 문자 -> 정수 변환 [ 아스키 코드 기준 ]
		
		// p.43 char : 2바이트 [ 1문자 ] : 유니코드(2바이트: 전세계 모든 문자를 표현 가능) vs 아스키코드(영어만 표현가능)
		char c1 = 'a';	System.out.println( c1 );
		char c2 = 97;	System.out.println( c2 );		// 10진수 표현 : 0~9
			// 정수 -> 문자 변환
		char c3 = '\u0041';		System.out.println( c3 );
 		char c4 = '가';		System.out.println( c4 );
 		char c5 = 44032;	System.out.println ( c5 );
 		// 진법
 			// 2진수 : 0, 1 / 기계어(2진코드) / 용량1비트
 			// 8진수 : 0 ~ 7
 			// 10진수 : 0 ~ 9
 			// 16진수 : 0 ~ 9 a b c d e f
 		
 		//p.44 short : 2바이트 정수 +- 3만정도
 		short num1 = 30000; System.out.println( num1 );
 		//short num2 = 40000; System.out.println( num2 ); //오류 발생: 범위 초과 
 		
 		// p.45 int : 4바이트 정수 +-20억정도 ( 정수 기본타입 )
 		int num2 = 10;	System.out.println( num2 ); // 10진수
 		int num3 = 012;	System.out.println( num3 ); // 8진수는 앞에 0 붙이기
 		int num4 = 0xA;	System.out.println( num4 );	// 16진수는 앞에 0x 붙이기
 		
 		// p.46 long : 8바이트 실수(정수)
 		long num5 = 100000000000L;	System.out.println( num5 );
 					// int형 -> long형
 		
 		// p.47~48 float[ 데이터 뒤에 f ] : 4바이트 / double( 실수 기본타입 ) : 8바이트
 		double num6 = 3.14; System.out.println( num6 );
 		float num7 = 3.14f; System.out.println( num7 );
 		
 		double num8 = 0.123456789123456789; System.out.println( num8 );
 		float num9 = 0.123456789123456789f;; System.out.println( num9 );
 		
 		// p.48 boolean : 1비트 [ true 혹은 false ]
 			// 스위치 : on , off
 		boolean bol = true; System.out.println( bol );
 		
 		// p.49 : 타입변환
 			// * 크기순서 : byte -> short -> int -> long -> float -> double
 			// 1. 자동 형변환
 					// 작은 상자에서 큰상자로 이동 가능
 					// 큰상자에서 작은상자로 이동 불가
 			byte 바이트 = 10;
 			int 인트 = 바이트;
 			// short 쇼트 = 인트; // 오류 
 			
 			// 2. 강제 형변환
 				// 큰상자에서 작은 상자로 이동 가능인데... 단 : 테이터 손실
 				// (변경할자료형)변수형;
 			short 쇼트 = (short) 인트; // int형 변수를 short로 변환하는데 데이터 잘림
 			
 			// 자료형 연산시 자료형의 변환 [연산시 기본타입으로 변환]
 				// 1. byte + byte -> int[x] byte = int 자동 형변환이 안되서 오류!!!
 				// 2. int + byte -> int
 				// 3. int + float -> int
 				// 4. int + double -> int
	} // m e

}	// c e

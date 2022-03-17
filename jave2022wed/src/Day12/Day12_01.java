package Day12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_01 {
	public static void main(String[] args) throws IOException {
		
		// 바이트 -> 문자 변환 가능 이ㅠ
			//1. 바이트 -> +-127 표현 가능
			//2. 아스키코드 => 0 or 1 조합된 7자리 => 0101011
			// 바이트 -> 아스키코드 변환 [영문/특수문자 1바이트, 한글 2바이트]
			
			//기계어 : 0 or 1
			//7자리 기계어 : 아스키코드 [ 1000001 => A ]
		
		// p497 예1
		//1. 여러개 바이트를 저장할수 있는 바이트 배열 선언
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		//2. 바이트 배열 -> 문자열 변환
		String str1 = new String(bytes);
		//3. 확인
		System.out.println("바이트배열 -> 문자열 변환 : " + str1);
		
		//4. 특정 위치부터 변환 [new String(배열명, 시작인덱스, 개수)]
		String str2 = new String(bytes, 6 ,4);
		//5. 확인
		System.out.println("바이트배열내 6번인덱스부터 4개 변환 : " + str2);
		
		//p.498 예제2
			// System.out : 시스템클래스내 출력필드
			// System.in : 시스템클래스내 입력필드
		byte[] bytes2 = new byte[100]; // 100개 바이트를 저장할수 있는 배열
		
		System.out.println("입력: "); // 출력필드내 print메소드 호출
		int readByteNo = System.in.read( bytes2 );
			// 외부통신 : 자바프로그램외 [ 키보드, 파일, 네트워크 등 ] 입출력 일반예외
		
		//키보드 입력 ---스트림[통신:바이트]--> 컴퓨터
		
		System.out.println("입력받은 바이트: " + Arrays.toString(bytes2));
		String str = new String( bytes2 );
		System.out.println("입력받은 바이트 -> 문자열 변환: " + str);
		
		
			//Sccanner 클래스 [ System.in 으로부터 입력받은 바이트를 객체에 저장 ]
		Scanner scanner = new Scanner(System.in);
			//
		scanner.next();
		scanner.nextInt();
		scanner.nextDouble();
		
		
	}
	
}

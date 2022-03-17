package Day12;

public class Day12_02 {
	
	public static void main(String[] args) {
		
		// String 메소드
		// p.499 charAt() : 문자열에서 특정문자 추출
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) { // switch 제어문 [ switch( 검사대상 ) ]
			case '1' :	// sex 변수의 값이 문자 1 이면
			case '3' : System.out.println("남자"); break;// sex 변수의 값이 문자 2이면
			case '2' :	// sex 변수의 값이 문자 3 이면
			case '4' : System.out.println("여자"); break;// sex 변수의 값이 문자 4이면
		}
		// p.501 equals() : 문자열 비교
			// 기본자료형 사용하는 변수는 연산자 사용가능 [ == ]
			// String 클래스 사용하는 객체는 == 연산자 사용불가능
		
		// 자바 메모리 [JVM]
			// 스택 메모리 : 지역 변수
			// 힙 메모리	: 객체
			// 메소드 메모리
		
		
		// 1. 문자열 선언
		String strVar1 = new String("신민철");		
		String strVar2 = "신문철";			// 객체는 new연산자가 필수이지만 String 클래스만 자동
		
		//2.문자열 비교
		if( strVar1 == strVar2 ) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		//3.
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
		
		//p. 502 ,getbytes(); "문자열 -> 바이트열 변환
		String str = "안녕하세요";
		// 문자열 -> 바이트열 변환
		byte[] bytes2 = str.getBytes();
		System.out.println(bytes2.length);
		// 바이트열 -> 문자열 변환
		String str1 = new String(bytes2);
		System.out.println("바이트열 -> 문자열: " + str1);
		try {
			// 1. 인코딩타입 [인코딩/디코딩]
			byte[] bytes3 = str.getBytes("EUC-KR"); // 일반예외 발생
			System.out.println("EUC-KR 길이: " + bytes3.length );
			String str2 = new String( bytes3, "EUC-KR");
			System.out.println("바이트열 -> 문자열 : " + str2);
			
			
			
			
			//p.540
			String subject = "자바 프로그래밍";
			
			int location = subject.indexOf("프로그래밍");
			System.out.println(location); // 3번 인덱스에서 프로그래밍 찾기 성공
			// 문자열내 특정문자열 위치[인덱스] 찾기 / 만약에 없으면 -1 [없다]
			if(subject.indexOf("자바") != -1 ) { // 인덱스는 0번 시작 -1 없다
				System.out.println("자바와 관련 책");	
			}else {
				System.out.println("자바와 관련 없는 책");
			}
			
			
			
			
			// p.505 length() : 문자열 길이
			String ssn2 = "7306241230123";
			int length = ssn.length(); // 문자열내 문자 개수 [ 길이 구하기 ]
			if( length == 13 ) { // 만약에 문자열내 13글자 이면
				System.out.println("주민번호 자리수가 맞습니다");
			}else {
				System.out.println("주민번호 자리수가 틀립니다");
			}
		System.out.println("------------------------------------------");
				// p.506 replace( "기본문자", "새로운문자" ) : 문자열 대치[변경]
				String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 ApI를 지원합니다.";
				String newStr = oldStr.replace("자바", "JAVA");
								// 문자열.replace("기존문자", "새로운문자");
				System.out.println("기존문자열 : " + oldStr);
				System.out.println("기존문자열 : " + newStr);
				
				//p.507 substring() vs split() : 문자열 자르기 => 인덱스 기준
				String ssn3 = "880815-1234567";
				
				String firstNum = ssn3.substring(0,6);		
				System.out.println("확인: " + firstNum);
				
				String seconNum = ssn3.substring(7);
				System.out.println("확인: " + seconNum);
				// split => 문자기준
					// "880815-1234567" "-" 기준 자르기 2조각 -> 배열반환
					// [0] : 880815 [1] : 1234567
				System.out.println("앞부분: " + ssn3.split("-")[0]);
				
				//p.510 valueOf() : 기본타입[int, double 등] -> 문자열 변환
				String str3 = String.valueOf(10);// int형 10을 문자열로 변환
				String str4 = String.valueOf(10.5);// double형 10.5를 문자열 10.5로변환
				String str5 = String.valueOf(true);//문자열오 변환
				
				System.out.println(str3 + 10);
				
			
			
			
			
		}catch(Exception e){
			
		}
		
		
	}
	
	
	
}

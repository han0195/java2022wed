package Day11;

public class Day11_02 {
	//p.422
		// 컴퓨터의 하드웨어 문제를 에러 [ 실행불가능 ]
		// 사용자의 잘못된 조작 or 개발자의 잘못된 코딩의 에러는 예외
		// 종류 : 1.일반예외 2.실행예외
			// 일반예외 : 컴파이[ 실행 ]전에 예외 검사 [ 개발자에게 강제 예외처리 : 외부통신 ]
			// 실행예외 : 컴파일[ 실행 ]후에 예외 검사 
	
	
	public static void main(String[] args) {
		try {
			String data = null;
			System.out.println(data.toString());
				// 실행전에는 에러 없다..
			// 에러가 발생하는 이ㅠ : null은 메모리가 할당이 없기때문에 객체정보출력 불가능
		} // try eend
		catch(NullPointerException e){
			System.out.println("예외발생 : " + e);
		}
		
		//p.424
		try {
			String[] 배열 = new String[2]; // String 2개를 저장할수 있는 배열
			배열[0] = "a"; 배열[1] = "b"; 배열[2] = "c";
		}catch(ArrayIndexOutOfBoundsException e) {
				//예외발생한 예외클래스
			System.out.println("예외발생: " + e);
		}
		
		//p.426
		try {
			String data1 = "100"; //문자열
			String data2 = "a100"; // 문자열
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data1);// a가있어서 정수로 표현 불가
						//Integer.parseInt( 문자열 ); 문자열 -> 정수
			// 오류 발생 이유 : 문자열내 숫자형식은 변환이 가능하지만 문자열내 문자형식 변환이 불가능
			// 오류가 발생하면 catch 이동 [ 오류 발생 이후 코드 실행x ]
		}catch(NumberFormatException e) {
			System.out.println("예외발생: " + e);
		}
		
		// p.428
			Dog dog = new Dog();
			String 문자열 = "유재석";	// 자바 클래스중 하나
			Object 슈퍼객체 ; 			// 자바 클래스내 최상위 클래스
			
			슈퍼객체 = 문자열;			//
			문자열 = (String)슈퍼객체;
				// 강제형변환
				// 실행중에 형변환
		// 예외처리 판단
			// 입출력(사용자입장) 관련된 코드 [ 무조건 예외처리 ]
		
		
		// 예외처리 판단
		
					
		
				
		
	}
}



package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class Day13_04 {

	public static void main(String[] args) {
		
		// p.544 DecimalFormat 클래스 : 숫자 데이터를 원하는 형식으로 표현
			// 패턴 종류
				// 0 : 자리수 [ 빈자리면 0으로 채움 ]
				// # : 자리수 [ 빈자리면 채우기 ]
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		// ***** 천단위 구분 쉼표 *****
		df = new DecimalFormat("#,##0원");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0"); // E : 지수문자
		System.out.println( df.format(num));
		
		df = new DecimalFormat("+#,### ; -#.###" ); // 양수 ; 음수
		System.out.println( df.format(num) );
		
		//p.544 : DecimlFormat 클래스 : 숫자 형식 변환
		//p.545 : SimpleDateFormat 클래스 : 날짜 형식 변환
		//p.547	: MessageFormat 클래스 : 문자 형식 변환
		
		String id = "java";
		String name = "신용권";
		String tel = "010-123-5678";
		
		String text = "회원 ID: {0}\n회원 이름: {1}\n회원 전화: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println( result1 );
		
		// *** 데이터베이스에서 사용할 예전 ***
		//String sql = "insert info member values";
		
		
				
		
		
	}
}

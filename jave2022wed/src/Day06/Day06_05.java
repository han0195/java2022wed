package Day06;

public class Day06_05 {

	public static void main(String[] args) {
		
		// p.207
		
		// 1. 생성자 없이 필드에 값 넣기
		Korea k1 = new Korea();
		// 2. 객체 생성후에 필드 값 변경
			k1.name = "유재석";
			k1.ssn = "123456-123456";
		
		System.out.println("(빈)k1 국적: " + k1.nation);
		System.out.println("(빈)k1 이름: " + k1.name);
		System.out.println("(빈)k1 주민: " + k1.ssn);
		
		//2. 필드 2개를 갖는 생성자로 객체 생성
		Korea k2 = new Korea("박자바", "000000-00000");
		System.out.println("k2 국적: " + k2.nation);
		System.out.println("k2 이름: " + k2.name);
		System.out.println("k2 주민: " + k2.ssn);
		///////////////////////////////////////////////////////////////////////////////////////////////////
			// 1. 빈생성자 객체
		Korea 한국인1 = new Korea();
				// 한국인1 국적이 대한민국이고 이름, 주민등록번호 없음
		
			// 2. 필드 1개 생성자 객체 생성
		Korea 한국인2 = new Korea("유재석");
				//한국인2 국적이 대한민국이고 이름이 유재석 이고 주민등록번호가 없음
		
			// 3. 필드 2개 생성자 객체 생성
		Korea 한국인3 = new Korea("강호동", "134-1134");
				//한국인3 국적이 대한민국이고 이름이 강호동 이고 주민등록번호가 있음
		
			// 4. 필드 3개 생성자 객체 생성
		Korea 한국인4 = new Korea("인도", "신동엽", "1010-0101");
				//한국인4 국적이 인도이고  이름이 신동엽 이고 주민등록번호가 있음
			
	}

}

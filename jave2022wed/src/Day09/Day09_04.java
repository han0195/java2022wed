package Day09;

public class Day09_04 {
	public static void main(String[] args) {
		
		// p.296 ~ 297
			// @Override : 재정의
			// 원래라면 동일한 인수와 메소드명 불가능
			// 목적 : 동일한 메소드를 재정의[수정]
		int r = 10;
		//1.슈퍼클래스 객체생성
		calculator cal = new calculator();
		System.out.println("원면적: " + cal.areaCircle(r));
		System.out.println();
		
		//1. 서브클래스로 객체 생성
		Computer com = new Computer();
		//2. 서브클래스로 만든 객체로 호출
		System.out.println("원면적: " + com.areaCircle(r));
		
	
		
	}
}

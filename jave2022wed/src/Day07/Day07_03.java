package Day07;

public class Day07_03 {
	
	//메소드 호출시
		// 내부호출 : 메소드가 선언된 클래스[파일]내 메소드호출시
			//메소드명만 호출
			// avg(인수1, 인수2)
	
		// 외부호출 : 메소드가 선언된 다른 클래스[파일]내 메소드호출시
			//객체를 통해서 메소드명 호출
			//myCalc.avg( 인수1, 인수2)

	public static void main(String[] args) {
		Calculator2 cal2 = new Calculator2();
		
		cal2.execute();
		// p.224내부 호출

	}

}

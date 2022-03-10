package Day07;

public class Day07_01 {// cs

	public static void main(String[] args) {
		//호출
			//1. 메소드가 존재하는 클래스의 객체 필요
			//2. 객체명.메소드명
				// . : 접근연산자 ( 필드나 메소드 호출시 )
				//예) scanner.nextInt();
		//1. 객체 선언
		Calculator calculator = new Calculator();		
		//클래스명  객체명[ 이름 ] = 메모리할당 생성자();
		
		// 2. 메서드호출 [ 객체명.메소드명(); ]
		calculator.powerOn();
		
		// 3. 메서드호출 [ 인수2개 ]
		int result1 = calculator.plus(5, 6);
				//* 메서드에 5 와 6 전달후에
				//* 11이라는 결과값 받아서
		System.out.println("result1 :" + result1);
		
		double result2 = calculator.divide(10, 4);
		System.out.println(result2);
		
		calculator.powerOff();

	}// m e

}// ce

package Day15;

import Day09.calculator;

public class Day15_5 {
	public static void main(String[] args) {
		//p. 591 동기화
		// 멀티 스레드 사용시 동기화 선택 [ 단일스레드 사용 ]
		// * 여러개 스레드 동일한 메소드 호출
		// 동시다발적으로 하나의 메소드 호출

		// 예1) 동기화 없는 메소드 사용시
		//1. 계산기 객체 생성
		Calculator calculator = new Calculator();
		
		//2.
		Uesr1 u1 = new Uesr1();
		u1.setCalculator(calculator);
		u1.start();
		//3.
		User2 u2 = new User2();
		u2.setCalculator(calculator);
		u2.start();
	}	
}

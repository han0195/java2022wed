package Day13;

import java.util.Random;

public class Day13_01 {

	
	public static void main(String[] args) {
		
		// p. : Math 클래스 [ 수학 관련 메소드 제공 ] 객체없이 사용가능
		System.out.println("절댓값: " + Math.abs(-5));	
		System.out.println("절대값: " + Math.abs(-3.14));
		
		System.out.println("올림값: " + Math.ceil(5.3));
		System.out.println("올림값: " + Math.ceil(-5.3));
		
		System.out.println("버림값 : " + Math.floor(5.3));
		System.out.println("버림값 : " + Math.floor(-5.3));
		
		System.out.println("최댓값 : " + Math.max(5, 9));
		System.out.println("최댓값 : " + Math.max(5.3, 2.5));
		
		System.out.println("최솟값 : " + Math.min(5, 9));
		System.out.println("최솟값 : " + Math.min(5.3, 2.5));
		
		System.out.println("난수 : " + Math.random());
		
		System.out.println("가까운 정수의 실수값: " +Math.rint(5.3));// 반올림
		System.out.println("가까운 정수의 실수값: " + Math.rint(5.7));
		
		System.out.println("가까운 정수의 정수값: " + Math.round(5.3));
		System.out.println("가까운 정수의 정수값: " + Math.round(5.7));
		
		
		
	}
}

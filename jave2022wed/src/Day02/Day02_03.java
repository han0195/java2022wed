package Day02;

import java.util.Scanner;

public class Day02_03 {

	public static void main(String[] args) {
		//문제 1 : 급여 계산
		
		//Scanner 선언
		Scanner san = new Scanner(System.in);
		
		//Scanner 입력을 변수의 저장
		System.out.print("기본급: ");
		int 기본급 = san.nextInt();
		System.out.println("수당: ");
		int 수당 = san.nextInt();
		
		//출력 
		int 실수령액 = 기본급 + 수당 - (int) (기본급 * 0.1);
		System.out.println("실수령액: " + 실수령액);
		
				
	}

}

package Day03;

import java.util.Scanner;

public class Day03_04 {

	public static void main(String[] args) {
		
		//제어문 : 1. if문 2.switch문
			// if: 논리검사( true 혹은 false ) / 경우의수 정해져 있지 않는경우
				// >= <= > < == !=
			// switch: 데이터검사(선택조건)			   / 경우의수 정해져 있는 경우
			// 형태
				// switch( 검사대상 ){
				// 		case '값': 실행문;
				// 		case '값': 실행문;
				// 		case '값': 실행문;
				// 		default : 실행문;
				//}
		
				//break : 가장 가까운 swtich 혹은 반복문 탈출
		
		// 예1)	점수가 90점 이면 A, 80이면 B, 70 이면 C, 그외 탈락
		int 점수 = 80;
		if( 점수 == 90 ) System.out.println("A등급");
		else if( 점수 == 80 ) System.out.println("B등급");
		else if( 점수 == 70 ) System.out.println("C등급");
		else System.out.println("탈락");
		System.out.println("--------------------------------------------------------------");
		switch(점수) {
			case 90 : System.out.println("A등급");	break;
			case 80 : System.out.println("B등급"); 	break;
			case 70 : System.out.println("C등급");	break;
			default : System.out.println("탈락");
		}
		
		//예2)
		int 버튼 = 3;
		switch( 버튼 ) {
			case 1 : System.out.println("1층으로 이동"); break;
			case 2 : System.out.println("2층으로 이동"); break;
			case 3 : System.out.println("3층으로 이동"); break;
			default : System.out.println("4층으로 이동");
		}
		
		// 예3)
		char 등급 = 'A';
		switch( 등급 ) {
			case 'A' :
			case 'B' : System.out.println(" 우수 회원 "); break;
			case 'C' :
			case 'D' : System.out.println(" 일반 회원 "); break;
			default	 : System.out.println(" 손님 ");
		}
		
		// 예)
		String 직급 = "과장";
		switch( 직급 ) { // 선택조건이 때문에 .equals 사용 x
			case "부장" : System.out.println("700만원"); break;
			case "과장" : System.out.println("500만원"); break;
			default : System.out.println("1만원");
		}
		
		//문제1 ) 국어,영어,수학. 점수를 입력받아 평균이 90점 A 등급 80점 이상이면 B등급 나머지 탈락
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int 국어_1 = scan.nextInt(); int 영어_1 = scan.nextInt(); int 수학_1 = scan.nextInt();
		int 평균 = (국어_1 + 영어_1 + 수학_1) / 3;
		
		switch (평균 / 10) { // 1자리수 제외
			case 10: System.out.println("A");	break;
			case 9: System.out.println("A");	break;
			case 8: System.out.println("B");	break;
			default : System.out.println("탈락");
		}
	}

}

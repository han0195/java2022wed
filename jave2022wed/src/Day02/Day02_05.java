package Day02;

import java.util.Arrays;
import java.util.Scanner;

public class Day02_05 {

	public static void main(String[] args) {
		//Scanner 선언
		Scanner san = new Scanner(System.in);
		
//		//문제 2 : 지폐 세기
//			//Sanner 입력을 변수의 저장 
//			System.out.println("문제2. 금액을 입력해주세요: ");
//			int num = san.nextInt();
//				
//		//10만원권 개수 구하기
//			int num100 = num / 100000;
//		// 구한 개수 만큼 num 값에서 빼기
//			num = num - (num100 * 100000);
//		//출력
//			System.out.println("십만원: " + num100);
//				
//----------------------------------------------------------------------------------------------------------
//		
//		//만원권 개수 구하기
//			int num10 = num / 10000;
//		//구한 개수 만큼 num 값에서 빼기
//			num = num - (num10 * 10000);
//		//출력
//			System.out.println("만원: " + num10);
//				
//----------------------------------------------------------------------------------------------------------
//		
//		//천원권 개수 구하기
//			int num1 = num / 1000;
//		//구한 개수 만큼 num 값에서 빼기
//			num = num - (num1 * 1000);
//		//출력
//			System.out.println("천원: " + num1);
//
//----------------------------------------------------------------------------------------------------------		
//				
//		//백원 개수 구하기
//			int num01 = num / 100;
//		//구한 개수 만큼 num 값에서 빼기
//			num = num - (num01 * 100);
//		//출력
//			System.out.println("백원: " + num01);
//				
//----------------------------------------------------------------------------------------------------------			
//			
//		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
//			//Scanner 호출하여 입력받은뒤 변수의 저장
//			System.out.println("문제3 정수를 입력해주세요: ");
//			int 문제3정수 = san.nextInt();
//			
//			//삼항연산자로 7로 나누었을때 나머지가 0이되면 7의 배수
//			boolean 문제3답 = 문제3정수 % 7 == 0 ? true : false; 
//			
//			System.out.println("문제3의 정수는 7의 배수?: " + 문제3답);
//			
//----------------------------------------------------------------------------------------------------------			
//			
//		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
//			System.out.println("문제4 정수를 입력해주세요");
//			int 문제4정수 = san.nextInt();
//			
//			//2로 나누었을때 0이 아니라면 홀수
//			boolean 문제4답 = 문제4정수 % 2 != 0 ? true : false;
//			
//			System.out.println("문제4의 정수는 홀수?" + 문제4답);
//			
//----------------------------------------------------------------------------------------------------------			
//			
//		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
//			System.out.println("문제5 정수를 입력해주세요");
//			int 문제5정수 = san.nextInt();
//			
//			System.out.println("문제5의 정수는 7의 배수이면서 짝수?: " + (문제5정수 % 7 == 0 && 문제5정수 % 2 == 0 ? true : false));
//			
//----------------------------------------------------------------------------------------------------------			
//			
//		//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
//			System.out.println("문제5번 정수 2개를 입력해주세요");
//			int 문제6_1 = san.nextInt();
//			int 문제6_2 = san.nextInt();
//
//			System.out.println("큰수: " + (문제6_1 > 문제6_2 ? 문제6_1 : 문제6_2));
//			
//----------------------------------------------------------------------------------------------------------		
//			
//		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
//			// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
//			System.out.println("문제6번 반지름을 입력해주세요");
//			float 문제6반지름 = san.nextFloat();
//			System.out.println(문제6반지름 * 문제6반지름 * 3.14);
//	
//----------------------------------------------------------------------------------------------------------				
//			
//		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
//		// 예) 54.5   84.3 이면    64.285714%
//			System.out.println("문제8 2개의 실수를 입력해주세요");
//			float 문제8_1 = san.nextFloat();
//			float 문제8_2 = san.nextFloat();
//			
//			System.out.printf("앞수 는 뒷수의 : %.2f %%", ((문제8_1 / 문제8_2) * 100f));
//					//%f : 실수 표현
						// %.숫자f : 숫자만큼 소수점 자리 표현
//		
//----------------------------------------------------------------------------------------------------------
//		
//		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
//		//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
//			System.out.println("문제9 윗변, 밑변, 높이 을 입력해주세요");
//			float 윗변 = san.nextFloat();
//			float 밑변 = san.nextFloat();
//			float 높이 = san.nextFloat();
//			
//			System.out.println("사다리꼴의 넓이는: " + ((윗변 * 밑변) * 높이 / 2f));
//		
//----------------------------------------------------------------------------------------------------------		
//		
//		//문제10: 키를 정수를 입력받아 표준체중 출력하기
//		//표준체중 계산식 = > (키 - 100) * 0.9
//			System.out.println("문제10 키(정수)를 입력해주세요");
//			int 키 = san.nextInt();
//			
//			System.out.println("당신의 표준체중은" + ((int) ((키 - 100) * 0.9)));
//		
//----------------------------------------------------------------------------------------------------------		
//		
//		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
//		//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
//			System.out.println("키와 몸무게를 입력해주세요");
//			float 문제11키 = san.nextFloat();
//			float 문제11몸무게 = san.nextFloat();
//			
//			System.out.println("당신의 BMI: " + (문제11몸무게 / ( (문제11키/100f) * (문제11키/100f) )));
//		
//----------------------------------------------------------------------------------------------------------		
//		
//		//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ]
//			System.out.println("inch를 입력해주세요");
//			int inch = san.nextInt();
//			System.out.println("inch -> cm: " + (inch * 2.54) + "cm");
//		
//----------------------------------------------------------------------------------------------------------		
//			
//		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
//		//소수 둘째 자리 까지 점수 출력하기
//		//중간고사 반영비율 => 30 %
//		//기말고사 반영비율 => 30 %
//		//수행평가 반영비율 => 40 %
//			System.out.println("중간고사, 기말고사, 수행평가를 입력해주세요");
//			float 중간고사 = san.nextFloat();
//			float 기말고사 = san.nextFloat();
//			float 수행평가 = san.nextFloat();
//			
//			System.out.println("당신의 성적은: " + ((중간고사 * 0.3f) + (기말고사 * 0.3f) + (수행평가 * 0.4f)));
//			
//----------------------------------------------------------------------------------------------------------				
//			
//		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
//			int x = 10;
//			int y = x-- + 5 + --x;
//			//printf(" x의 값 : %d , y의값 :  %d ", x, y)
//			/*
//			 * 변수 y 를 계산할때
//			 * 처음 x 는 후위형이기 때문에 / 10 + 5 = 15 -> x = 9, y = 15
//			 * 15 + 전위형이기때문에 8   / 15 + 8 = 23 -> x = 8, y = 23
//			 */
//				
//----------------------------------------------------------------------------------------------------------		
//			
//			
//		//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
//			System.out.println("나이를 입력하세요");
//			int age = san.nextInt();
//			
//			System.out.println(
//					age >= 10 && age < 20 ? "학생" : age >= 20 && age < 40 ? "성인" : "중년"
//					);
//
//----------------------------------------------------------------------------------------------------------
//		
//		//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬 
//			System.out.println("3개의 정수를 입력해주세요");
//			int a = san.nextInt();
//			int b = san.nextInt();
//			int x = san.nextInt();
//			int min = 0;
//			int con = 0;
//			int max = 0;
//			
//			max = a > b && a > x ? a : b > x ? b : x;
//			min = a < b && a < x ? a : b < x ? b : x;
//			con = a != min && a != max ? a : b != min && b != max ? b : x;
//			
//			System.out.println(min);
//			System.out.println(con);
//			System.out.println(max);
//	
//----------------------------------------------------------------------------------------------------			
//			
//		//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬
			System.out.println("3개의 정수를 입력해주세요");
			int a = san.nextInt();
			int b = san.nextInt();
			int x = san.nextInt();
			int min = 0;
			int con = 0;
			int max = 0;
			
			max = a > b && a > x ? a : b > x ? b : x;
			min = a < b && a < x ? a : b < x ? b : x;
			con = a != min && a != max ? a : b != min && b != max ? b : x;
			
			System.out.println(max);
			System.out.println(con);
			System.out.println(min);
	}
}
package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_03_캘린더 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// 2. 연도 , 월 , 일
		System.out.println("연도: ");
		int year = s.nextInt();
		System.out.println("월: ");
		int month = s.nextInt();

		달력(year, month);

	}

	public static void 달력(int year, int month) {
		while (true) {
			// 1. 캘린더 클래스내 현재 날짜/시간 객체 호출
			Calendar calendar = Calendar.getInstance();
			Scanner s = new Scanner(System.in);
//		int year = calendar.get( Calendar.YEAR);
//		int month = calendar.get(calendar.MARCH)+1; // +1하는이유 : 0:1월 ~ 11: 12월;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			// * 해당 월의 1일의 요일찾기
			// 1. 사용자 정의 캘린터 설정
			calendar.set(year, month - 1, 1); // 예) 3월 1일
			// 2. 3월 1일의 요일
			int sweek = calendar.get(Calendar.DAY_OF_WEEK);
			//System.out.println(month + "월 " + day + "일 요일: " + sweek);
			
			// 3. 3월의 마지막 일
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
			//System.out.println(month + "월의 마지막 일: " + eday);

			// 3. 출력
			System.out.println("****" + year + "년" + month + "월 ******");
			System.out.println("일\t월\t화\t수\t목\t금\t토");

			// * 현재 월 1일의 위치 앞에 공백 채우기
			for (int i = 1; i < sweek; i++) {
				/// 3월 1일 = 화 = 3;
				System.out.print("\t");
			}
			// 1일부터 마지막날짜 출력
			for (int i = 1; i <= eday; i++) {
				System.out.print(i + "\t");
				// 토요일마다 줄바꿈처리 [ 토요일 = 7 ] 요일이 7배수마다
				if (sweek % 7 == 0) {
					System.out.println();
				}

				sweek++; // 하루씩 요일 증가
			}

			
			// 달력 버튼 [1. 이전 2.다음] 기능			
			try {
				System.out.println("\n1.이전 / 2.다음");
				int ch = s.nextInt();
				if (ch == 1) {
					if (month == 1) {
						달력(year - 1, month + 11);
					} else {
						달력(year, month - 1);
					}
				} else if (ch == 2) {
					if (month == 12) {
						달력(year + 1, month - 11);
					} else {
						달력(year, month + 1);
					}
				}
			}catch(Exception e){
				System.out.println("에러]] 정상적인 입력을해주세요 [관리자호출] 에러: " + e);
			}// try end
			
						
		}// 프로그램 무한반복 end

	}// 달력 end

}// c end

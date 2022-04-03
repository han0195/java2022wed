package 달력날짜클래스;

import java.util.Calendar;
import java.util.Scanner;

import Day09.calculator;

public class 달력 { // 26 : 52 // 5
	
	static Scanner s = new Scanner(System.in); //입력객체선언 [static]
	
	public static void main(String[] args) {
	
		
		System.out.println("연도: ");
		int year = s.nextInt(); // 연도입력받기
		System.out.println("월: ");
		int month = s.nextInt(); // 월 입력받기
		달력(year, month); // 달력 메소드 호출
	}
	
	public static void 달력(int year, int month) { // 연도 월 입력받기
		while(true) {
			Calendar calendar = Calendar.getInstance(); // 캘릭더 클래스내 날짜/시간 호출 [static]
			int day = calendar.get(calendar.DAY_OF_MONTH); // 캘릭더 월기준 일자 day변수의 저장
			calendar.set(year, month - 1, 1);// 입력받은 기준 캘린더 설정
			
			int sweek = calendar.get(Calendar.DAY_OF_WEEK);// 입력받은 일수 요일
	
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);// 마지막 일수
			
			//3. 출력
			System.out.println("*****" +year+"년"+month+ "월 ******");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			//* 현재 월 1일의 위치 앞에 공백 채우기
			for(int i = 1; i < sweek; i++) {
				System.out.print("\t"); // 화요일이면 0 1 공백처리
			}
			
			for(int i = 1; i <= eday; i++) { // 1 ~ 마지막일수까지 출력
				System.out.print(i + "\t");
				// 토요일마다 줄바꿈처리 [토요일 = 7]
				if(sweek % 7 == 0) { // 7마다 줄바꿈
					System.out.println();
				}
				sweek++; //첫요일부터 ++
			}
			
			try {
				System.out.println("\n1.이전 / 2.다음");
				int ch = s.nextInt(); // 선택 입력ㅂ다기
				if(ch == 1) { //이전
					if(month == 1) { // 기준 월이 1월이면
						달력(year - 1, month + 11); // 년도 - 1 , month + 11 = 12월
					}else { // 아니면 
						달력(year, month - 1);
					}
				}else if(ch == 2) { // 다음
					if(month == 12) {// 기준 월이 12월이면
						달력(year + 1, month - 11); // 년도 + 1 , month - 11 = 1월
					}else {
						달력(year, month + 1);
					}
				}else {
					System.out.println("알수없는 행동");
				}
				
			}catch (Exception e) {
				System.out.println("에러" + e);
			}
			
		}		
	} // me 
}// ce

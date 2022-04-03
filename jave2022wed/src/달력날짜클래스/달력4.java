package 달력날짜클래스;

import java.util.Calendar;
import java.util.Scanner;

public class 달력4 { // 7 : 56 : 0
	static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("연도: ");
		int year = s.nextInt();
		System.out.println("월: ");
		int month = s.nextInt();
		달력(year, month);
	}
	public static void 달력( int year, int month ) {
		while (true) {
			Calendar calendar = Calendar.getInstance();
			calendar.set(year, month - 1, 1);
			int sweek = calendar.get(calendar.DAY_OF_WEEK);
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
			System.out.println("*****" + year +"년" + month +"월 *****");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for(int i = 1; i < sweek ; i++) {
				System.out.print("\t");
			}
			for(int i = 1; i < eday ; i++){
				System.out.print(i + "\t");
				
				if(sweek % 7 == 0) {
					System.out.println();
				}
				sweek++;
			}
			
			try {
				System.out.println("\n1.이전 / 2. 다음"); int ch = s.nextInt();
				if(ch == 1) {
					if(month == 1) {
						달력(year -1, month + 11);
					}else {
						달력(year, month - 1);
					}
				}else if(ch == 2) {
					if(month == 12) {
						달력(year +1, month - 11);
					}else {
						달력(year, month + 1);
					}
				}else {
					System.out.println("알수없는행동");
				}
			} catch (Exception e) {
				System.out.println("에러 " + e);
			}	
		}
		
	}
}

package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

import Day09.calculator;

public class Day13_02 {

	public static void main(String[] args) {
		
		// p. 539
			// Date 클래스 : ( java.util )시스템 날짜/시간
		Date date = new Date(); // date 객체생성
		System.out.println( "현재 날씨/시간: " + date );
		System.out.println( "객체정보메소드: " + date.toString() );
		 
			//SimpleDateFormat 클래스 : 날짜 / 시간 포멧(형식 = 모양) 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh일 mm분 ss초");
		// 날짜에 형식 적용하기
		System.out.println("날짜형식변경: " + sdf.format(date));
										// 형식객체.format( 날짜 객체 )
		
		// p.540
			// Calender 클래스 : 운영체제 시삭ㄴ대의 날짜/시간에 대한 정보
		Calendar now = Calendar.getInstance();
			// 이미 Calendar클래스내 객체 존재!! = 별도로 객체생성x
		System.out.println("연도: " + now.get(Calendar.YEAR) );
		System.out.println(" 월: " + now.get(Calendar.MONTH) ); // 월: 0~11 [ 0 : 1월 ~~~~ 11:12 ]
		System.out.println(" 일: " + now.get(Calendar.DAY_OF_MONTH)); // 일
													// 월 기준으로 일수
		System.out.println(" 요일" + now.get( Calendar.DAY_OF_WEEK)); 
													// 주 기준으로 일수 1부터 일요일 7토
		
		//요일
		int week = now.get( Calendar.DAY_OF_WEEK);
		String 요일 = null;
		switch( week ) {
			case 1 : 요일 = "일요일"; break;
			case 2 : 요일 = "월요일"; break;
			case 3 : 요일 = "화요일"; break;
			case 4 : 요일 = "수요일"; break;
			case 5 : 요일 = "목요일"; break;
			case 6 : 요일 = "금요일"; break;
			case 7 : 요일 = "토요일"; break;
		}
		System.out.println("요일[한글] : " + 요일);
		
		//오전 / 오후
		System.out.println("오전/오후: " + now.get(Calendar.AM_PM)); // 0 : 오전 1 : 오후
		int ampm = now.get(Calendar.AM_PM);
		String 오전오후 = "";
		if(ampm == 0) {
			오전오후 = "오전";
		}else {
			오전오후 = "오후";
		}
		System.out.println("오전오우: " + 오전오후);
		
		System.out.println("시: " + now.get(Calendar.HOUR));
		System.out.println("분: " + now.get(Calendar.MINUTE));
		System.out.println("초: " + now.get(Calendar.SECOND));
		
		// ZonedDateTime 클래스 : 시계 협정시
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정시: " + zonedDateTime);
		ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울: " + zonedDateTime2);
		ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕: " + zonedDateTime3);
		
		
		
		
		
		
		
		
	}
		
}

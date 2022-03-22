package 주차표;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Controller {
	//필드
	static ArrayList<car> car = new ArrayList<car>();
	
	//메소드
	public static boolean 주차(String carnum) {
		//차량번호 입력받기
			//*차량번호 중복체크
		for(car temp : Controller.car) {
			if(temp.get차량번호().equals(carnum)) {
				return false;
			}
		}
		//입차날짜 생성
		LocalDate 날짜 = LocalDate.now();
		//입차시간 생성
		LocalTime 시간 = LocalTime.now();
		//객체화후 car list의 저장후 true 리턴
		car car = new car(carnum, 날짜, 시간, 0);
		Controller.car.add(car);
		return true;
	}
	
	public static boolean 출차(String carnum) {
		//차량번호 입력받아
		//carlist의 차량넘버 중복체크후 중복된값의 
		int i = 0;
		for(car temp : Controller.car) {
			if(temp.get차량번호().equals(carnum)) {
				//출차시간 생성
				LocalTime 출차시간 = LocalTime.now();
				//요금계산 [최초 30분 무료이후 10분당 1000원][(분 - 30) / 10 * 1000]
				int 총주차분 = (int) ChronoUnit.MINUTES.between(temp.get입차시간(), 출차시간);
				int 주차요금 = 0;
				if(총주차분 > 30) {
					주차요금 = (총주차분 - 30) / 10 * 1000;
				}else {
					주차요금 = 0;
				}
				// 출차시간 주차비용 car list 의 저장
				Controller.car.get(i).set출차시간(출차시간);
				Controller.car.get(i).set주차비용(주차요금);
				return true;
			}
			i++;
		}//f e
		return false;
	}
	
}

package 주차표;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class park {

	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(System.in);
			while (true) {
				System.out.println("----------------------------- 주차 현황표 ---------------------------------");
				//주차 출력
				System.out.println("\t\t    " + LocalDate.now() +" "+ LocalTime.now().getHour()+":"+LocalTime.now().getMinute());
				System.out.println("날짜\t\t차량번호\t\t입차시간\t\t출차시간\t\t금액");		
				for(car temp : Controller.car) { // 출차시간 null 이면 주차중 출력 + 출차시간없음 금액 정산전 출력
					if(temp.get출차시간() == null) {
						//날짜
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");// 어떻게 출력할건지
						String 날짜 = temp.get입차날짜().format(formatter);	// formatter 정의대로 날짜 출력
						DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
						String 주차시간 = temp.get입차시간().format(formatter2);
						System.out.println(날짜 +"\t"+ temp.get차량번호() +"\t\t"+ 주차시간 +"\t\t"+ "주차중" +"\t\t"+ "정산전");
					}else {
						DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
						String 주차시간 = temp.get입차시간().format(formatter2);
						String 출차시간 = temp.get출차시간().format(formatter2);
						System.out.println(temp.get입차날짜() +"\t"+ temp.get차량번호() +"\t\t"+ 주차시간 +"\t\t"+ 출차시간 +"\t\t"+ temp.get주차비용());
					}
				}
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("\t\t1.주차 2.출차"); int ch = s.nextInt();
				 
				if(ch == 1) {
					//주차
					System.out.println("차량번호: "); String carnum = s.next();
					boolean pass = Controller.주차(carnum); // 차번호 넘기기
					if(pass) { // 주차성공
						System.out.println("주차성공");
					}else {// 주차실패
						System.out.println("주차실패");
					}
				}else if(ch == 2) {
					//출차
					System.out.println("차량번호: "); String carnum = s.next();
					boolean pass = Controller.출차(carnum);
					if(pass) { // 주차성공
						System.out.println("출차성공");
					}else {// 주차실패
						System.out.println("출차실패");
					}
				}else {
					System.out.println("잘못된 선택");
				}

				
			}// we
		} catch (Exception e) {
			System.out.println("에러)) 관리자 문의" + e);
		}
		
		
		
	}// me
}// ce

package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4 {
	
	public static void main(String[] args) {
		
		// 대기명단 프로그램
			// 메뉴 : 1.대기추가 2.대기취소 [관리자] 3.대기자입장
				// 대기추가 : 인원수를 입력받아 대기번호 반환
				// 대기취소 : 대기번호를 입력받아 명단 취소
				// 대기자입장 : 첫번째 대기중인 대기번호 호출
		int 대기번호 = 1;
		Scanner s = new Scanner(System.in);
		ArrayList<대기> 대기명단 = new ArrayList<>();
		while(true) {
			// 반복문을 이용한 리스트내 모든 객체 호출
			System.out.println(" 대기번호 \t 인원수");
				for( 대기 temp : 대기명단 ) {
					System.out.println(temp.대기번호 + "\t" + temp.인원수
							+ 대기명단.indexOf(temp) * 3 + "분");
					
				}
			System.out.println("[고객]1.대기추가 2.대기취소 [관리자]3.대기자입장");
			int ch = s.nextInt();
			if( ch == 1) {
				System.out.println("전화번호: "); String phone = s.next();
				System.out.println("인원수");		int 인원수 = s.nextInt();
				
				대기 temp = new 대기(대기번호, phone, 인원수);
				
				대기명단.add(temp);
				대기번호++; //대기번호 증가
			}else if(ch == 2) {
				
			}else if(ch == 3) {
				
			}else {
				
			}
		}
	}
	
	
}

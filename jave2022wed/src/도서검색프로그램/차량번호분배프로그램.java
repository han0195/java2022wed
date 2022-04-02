package 도서검색프로그램;

import java.util.Random;
import java.util.Scanner;

public class 차량번호분배프로그램 {
	// 차량번호 분배 프로그램
		// 조건 
			// 1. 난수 0000~9999[4자리 문자] 사이의 난수 10개 생성해서 배열에 저장 
			// 2. 모든 차량 번호를 배열에 저장 
			// 3. 끝자리 번호로 홀/짝 구분
			// 4. 차량 끝짜리의 번호가 홀수 차량 배열에 저장  
			// 5. 차량 끝짜리의 번호가 짝수 차량 배열에 저장 
			// 6. 홀수차량 배열 출력 // 짝수차량 배열 출력
	public static void main(String[] args) { // 14 : 11 // 2
		
		Scanner s = new Scanner(System.in);
		String[] carnum = new String[10];
		String[] evencar = new String[10];
		String[] oddcar = new String[10];
		Random random = new Random();
		
		while(true) {
			System.out.println("주창중인 차량 번호");
			for(String temp : carnum) {
				if(temp != null) {
					System.out.print(temp+"\t");
				}
			}
			System.out.println("\n주차중인 짝수 번호");
			for(String temp : evencar) {
				if(temp != null) {
					System.out.print(temp+"\t");
				}
			}
			System.out.println("\n주차중인 홀수 번호");
			for(String temp : oddcar) {
				if(temp != null) {
					System.out.print(temp+"\t");
				}
			}
			System.out.println("\n1.입차"); int ch = s.nextInt();
			if(ch == 1) {
				int carnums = random.nextInt(10000)+1;
				String carstr = String.format("%04d", carnums);// 4자리수 남은자리는 0으로 채움
				boolean pass = false; // 만차여부
				for(int i = 0 ; i < carnum.length ; i++) {
					if( carnum[i] == null) { // 비어있음
						carnum[i] = carstr;  // 저장
						pass = true;		// 만차여부
						break;				// 빠져나오기
					}
				}// for end
				
				if(pass) { // 주차장이 비어 있다면
					int i = 0;
					while(true) {
						if(carnums % 2 == 0 && evencar[i] == null) {
							evencar[i] = carstr;
							break;
						}else if(oddcar[i] == null){
							oddcar[i] = carstr;
							break;
						}
						i++;
					}
				}
				
				if(pass == false) {System.out.println("만차");}
				
			}else {
				System.out.println("알수없음");
			}
		}
		
		
		
	}
}
